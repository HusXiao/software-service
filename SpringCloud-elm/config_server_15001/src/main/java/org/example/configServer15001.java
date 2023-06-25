package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer			//开启SCC服务端注解
public class configServer15001 {

	public static void main(String[] args) {
		SpringApplication.run(configServer15001.class, args);
	}
}
