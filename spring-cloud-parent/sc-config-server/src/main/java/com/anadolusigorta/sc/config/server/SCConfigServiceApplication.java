package com.anadolusigorta.sc.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SCConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCConfigServiceApplication.class, args);
    }
    
}