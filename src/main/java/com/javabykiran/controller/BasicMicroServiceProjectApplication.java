
package com.javabykiran.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@SpringBootApplication
@ComponentScan("com.javabykiran")
@EntityScan("com.javabykiran")
public class BasicMicroServiceProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasicMicroServiceProjectApplication.class, args);
	}

}
