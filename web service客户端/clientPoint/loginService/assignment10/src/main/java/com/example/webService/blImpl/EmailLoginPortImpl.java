package com.example.webService.blImpl;

import com.example.webService.bl.LoginPort;
import com.example.webService.entity.*;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
/*
* 默认邮箱密码为邮箱@符前的字符串，即本科生与研究生为学号，老师为工资号
* */
public class EmailLoginPortImpl implements LoginPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    @Override
    public EmailAuthenticationResultType emailAuthentication(EmailAuthenticationInfoType emailAuthenticationInfo) throws EmailPwdFault, NotNjuFault, InvalidDataFault {
        String email = emailAuthenticationInfo.getEmail();
        String pwd = emailAuthenticationInfo.getPwd();
        EmailAuthenticationResultType res =new EmailAuthenticationResultType();
        if(!email.contains("@")){
            String message = "email format fault";
            throw new InvalidDataFault(message,message);
        }
        String prefix = email.substring(0,email.indexOf("@"));
        String last = email.substring((email.indexOf("@"))+1);
        if(!last.contains("nju.edu.cn")){
            System.out.println("shit");
            String message=email+" is not a valid NanJing University email address";
            throw new NotNjuFault(message,message);
        }
        String identify=last.substring(0,last.indexOf("nju.edu.cn"));
        if(identify.equals("smail.")){
            res.setEmailIdentity(EmailIdentity.fromValue("本科生"));
        }
        else if(identify.equals("jmail.")){
            res.setEmailIdentity(EmailIdentity.fromValue("研究生"));
        }
        else if(identify.equals("")){
            res.setEmailIdentity(EmailIdentity.fromValue("老师"));
        }
        else{
            String message=email+" is not a valid NanJing University email address";
            System.out.println(identify);
            throw new NotNjuFault(message,message);
        }

        if(!pwd.equals(prefix)){
            String message = "password does not match email";
            EmailPwdFaultType emailPwdFaultType = new EmailPwdFaultType();
            emailPwdFaultType.setEmail(email);
            emailPwdFaultType.setFault(message);
            EmailPwdFault emailPwdFault = new EmailPwdFault(message,emailPwdFaultType);
            throw emailPwdFault;
        }
        else{
            res.setEmail(email);
            return res;
        }

    }
}
