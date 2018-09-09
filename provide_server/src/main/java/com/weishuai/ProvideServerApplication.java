package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProvideServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideServerApplication.class, args);
	}
}
