package com.poli.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.poli.socket")
@SpringBootApplication
public class SocketPoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketPoliApplication.class, args);
	}

}
