package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 * 会员服务
 */
@SpringBootApplication
@EnableEurekaClient
public class ProvideServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideServerApplication.class, args);
	}
}
