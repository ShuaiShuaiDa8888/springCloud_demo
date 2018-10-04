package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * feign客户端配合Hystrix断路器实现服务降级
 * 配合order-server-feign-degrade做压力测试
 */
@SpringBootApplication
public class ProvideServerSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideServerSecondApplication.class, args);
	}
}
