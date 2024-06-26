package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;

/**
 * @Classname DmoApplication
 * @Description https://docs.spring.io/spring-authorization-server/reference/getting-started.html
 * @Author rookie
 * @Date 2023/2/28 23:26
 * @Version 1.0
 */
@SpringBootApplication
public class DefaultAuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DefaultAuthorizationServerApplication.class, args);


    }







}
