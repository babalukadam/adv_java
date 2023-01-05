package com.demo.SpringBootMVCCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMvcCrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootMvcCrudApplication.class, args);
		System.out.println("system is on now");
	}

}
