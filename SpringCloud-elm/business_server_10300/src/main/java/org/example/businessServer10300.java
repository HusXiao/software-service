package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启Spring Cloud Feign的支持功能
@EnableFeignClients
public class businessServer10300 {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(businessServer10300.class, args);
	}

}
