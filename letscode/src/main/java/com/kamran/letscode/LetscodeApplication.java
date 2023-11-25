package com.kamran.letscode;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LetscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetscodeApplication.class, args);
		start();
	}

	public static void start(){
		System.out.println("\tStarted the App \n============================\n============================\n============================");
	}

}
