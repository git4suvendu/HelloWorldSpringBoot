package com.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloWorldApplication {
	@Value("${spring.application.name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World";
	   }
	@RequestMapping(value = "/servicename")
	   public String name() {
	      return name;
	   }

}	

