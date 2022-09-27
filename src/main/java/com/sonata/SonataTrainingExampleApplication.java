package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonataTrainingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonataTrainingExampleApplication.class, args);
		
		AddInterface a1 = new AddImpl();
		System.out.println(a1.add(10, 20));
	}

}
