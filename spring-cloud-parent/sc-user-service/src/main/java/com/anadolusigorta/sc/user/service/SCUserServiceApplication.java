package com.anadolusigorta.sc.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableHystrix
public class SCUserServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SCUserServiceApplication.class, args);
    }
}
