package webServiceClient;

import ServerService.LoginPort;
import ServerService.LoginService;
import entity.LoginService.EmailAuthenticationInfoType;
import entity.LoginService.EmailAuthenticationResultType;
import entity.LoginService.EmailPwdFault;
import entity.LoginService.NotNjuFault;

public class EmailLoginService {
    public EmailAuthenticationResultType login(EmailAuthenticationInfoType loginInfo){
        LoginService loginService = new LoginService();
        LoginPort loginPort = loginService.getLoginPort();
        EmailAuthenticationResultType res = null;
        try {
            res = loginPort.emailAuthentication(loginInfo);
        }
        catch (EmailPwdFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
        }
        catch (NotNjuFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
        }
        return res;
    }
}
