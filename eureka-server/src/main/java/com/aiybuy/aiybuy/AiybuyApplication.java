package com.aiybuy.aiybuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AiybuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiybuyApplication.class, args);
	}
}
