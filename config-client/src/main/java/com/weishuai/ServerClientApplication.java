package com.weishuai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式配置中心
 * client端
 * (控制台会报错，但不会影响使用)
 */
@SpringBootApplication
@RestController
public class ServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerClientApplication.class, args);
	}

	@Value("${userName}")
	private String userName;

	@RequestMapping(value = "/getUserName")
	public String getUserName(){
		return userName;
	}
}
