package com.anadolusigorta.sc.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SCServiceApplication {
 
	
	private Logger logger = LoggerFactory.getLogger(SCServiceApplication.class);
	
	public static void main(String[] args) {
        SpringApplication.run(SCServiceApplication.class, args);
    }
 
    @RequestMapping("/ping")
    public String ping() {
    	logger.info("Ping from service");
        return "pong";
    }

   
}
