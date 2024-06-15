package com.rts.klef.springboot;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RationTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RationTrackingSystemApplication.class, args);
		System.out.println("Application Running !!");
	}

}
