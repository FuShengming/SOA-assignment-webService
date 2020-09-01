package com.example.webService.Config;

import com.example.webService.bl.AuthorityPort;
import com.example.webService.bl.LoginPort;
import com.example.webService.bl.ScorePort;
import com.example.webService.bl.StudentInfoPort;
//import com.example.webService.blImpl.AuthorityPortImpl;
import com.example.webService.blImpl.EmailLoginPortImpl;
//import com.example.webService.blImpl.ScorePortImpl;
//import com.example.webService.blImpl.StudentInfoPortImpl;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Configuration
@EnableAutoConfiguration
public class CxfConfig {

//    @Resource
//    private StudentInfoPortImpl studentInfoPort;

    @Bean
    public ServletRegistrationBean createServletRegistrationBean() {

        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    //把实现类交给spring管理
//    @Bean
//    public StudentInfoPort studentInfoPort() {
//        return new StudentInfoPortImpl();
//    }
//
//    @Bean
//    public ScorePort scorePort() {
//        return new ScorePortImpl();
//    }
//
//    @Bean
//    public AuthorityPort authorityPort() {
//        return new AuthorityPortImpl();
//    }

    @Bean
    public LoginPort loginPort() {
        return new EmailLoginPortImpl();
    }

    //终端路径
//    @Bean(name = "studentInfoEndpoint")
//    public Endpoint endpoint1() {
//        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), studentInfoPort());
//        endpoint.publish("/studentInfo");
//        return endpoint;
//    }
//    @Bean(name = "scoreEndpoint")
//    public Endpoint endpoint2() {
//        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), scorePort());
//        endpoint.publish("/score");
//        return endpoint;
//    }
//    @Bean(name = "authorityEndpoint")
//    public Endpoint endpoint3() {
//        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), authorityPort());
//        endpoint.publish("/authority");
//        return endpoint;
//    }
    @Bean(name = "loginEndpoint")
    public Endpoint endpoint4() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), loginPort());
        endpoint.publish("/login");
        return endpoint;
    }

}
