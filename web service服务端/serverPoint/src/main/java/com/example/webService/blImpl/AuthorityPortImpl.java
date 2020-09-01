package com.example.webService.blImpl;

import com.example.webService.JpaEntity.StudentAuthorityEntity;
import com.example.webService.JpaEntity.StudentUserEntity;
import com.example.webService.bl.AuthorityPort;
import com.example.webService.dao.StudentAuthorityRepository;
import com.example.webService.dao.StudentUserRepository;
import com.example.webService.entity.*;
import org.apache.cxf.staxutils.StaxUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "AuthorityPort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class AuthorityPortImpl implements AuthorityPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    @Autowired
    StudentUserRepository studentUserRepository;
    @Autowired
    StudentAuthorityRepository studentAuthorityRepository;


    @Override
    public authenticationResult studentAuthority(StudentAuthorityParamType studentAuthorityParamType)
            throws InvalidDataFault, PwdFault, StudentDoNotExistFault {
        StudentAuthenticationInfo   info = studentAuthorityParamType.getStudentAuthenticationInfo();
        StudentUserEntity entity = studentUserRepository.findStudentUserEntitiesByStudentId(info.getStudentId());
        if(entity==null){
            String message = "student "+info.getStudentId()+" does not exist or has no authorities";
            StudentDoNotExistFaultType studentDoNotExistFaultType = new StudentDoNotExistFaultType();
            studentDoNotExistFaultType.setFault(message);
            studentDoNotExistFaultType.setStudentId(info.getStudentId());
            throw new StudentDoNotExistFault(message,studentDoNotExistFaultType);
        }
        else if(!entity.getPwd().equals(info.getPwd())){
            String message = "student id does not exist or password does not match student id";
            PwdFaultType pwdFaultType = new PwdFaultType();
            pwdFaultType.setStudentId(entity.getStudentId());
            pwdFaultType.setFault(message);
            throw new PwdFault(message,pwdFaultType);
        }
        else{
            List<StudentAuthorityEntity> entities = studentAuthorityRepository.
                    findStudentAuthorityEntitiesByStudentId(entity.getStudentId());
            authenticationResult res = entityList2AuthenticationResult(entities);
            return res;

        }

    }

    public authenticationResult entityList2AuthenticationResult(List<StudentAuthorityEntity> studentAuthorityEntities){
        if(studentAuthorityEntities==null||studentAuthorityEntities.size()==0)
            return null;
        authenticationResult res = new authenticationResult();
        AuthorityList authorityList = new AuthorityList();
        List<AuthorityId> authorityIds = new ArrayList<AuthorityId>();

        res.setStudentId(studentAuthorityEntities.get(0).getStudentId());
        for(StudentAuthorityEntity cur:studentAuthorityEntities){
            AuthorityId authorityId = new AuthorityId();
            authorityId.setAuthorityCharacter(AuthorityCharacter.fromValue(cur.getAuthorityCharacter()));
            authorityId.setId(cur.getAuthorityId());
            authorityIds.add(authorityId);
        }
        authorityList.setAuthorityIds(authorityIds);
        res.setAuthorityList(authorityList);
        return res;
    }
}
