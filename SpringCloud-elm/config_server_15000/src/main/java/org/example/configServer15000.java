package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class configServer15000 {
	public static void main(String[] args) {
		SpringApplication.run(configServer15000.class, args);
	}
}
