package com.pragmaticbitbucket.photoapp.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PhotoAppApiZuulApiGatewayApplication {
	@Autowired
	Environment environment;

	private String printPropertyValue;

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiZuulApiGatewayApplication.class, args);
	}

	@Bean
	public String printPropertyValue() {
		System.out.println("Property token.secret has value: " + environment.getProperty("token.secret"));
		return "Just testing";
	}
}

