package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign客户端配合Hystrix断路器实现服务降级
 * 配合provide_server做压力测试
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderServerFeignDegradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerFeignDegradeApplication.class, args);
	}
}
