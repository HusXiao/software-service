package org.examp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class businessServer10301 {

	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(businessServer10301.class, args);
	}

//	@Bean
//	public RestTemplate getRestTemplate(){
//		return new RestTemplate();
//	}
}
