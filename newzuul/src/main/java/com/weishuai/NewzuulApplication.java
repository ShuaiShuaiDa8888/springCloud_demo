package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 接口网关
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //开启网关
public class NewzuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(NewzuulApplication.class, args);
	}
}
