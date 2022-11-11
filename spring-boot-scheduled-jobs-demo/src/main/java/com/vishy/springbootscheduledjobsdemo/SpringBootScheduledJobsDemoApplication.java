package com.vishy.springbootscheduledjobsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootScheduledJobsDemoApplication {

	@Autowired
	static ScheduledJob scheduledJob;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduledJobsDemoApplication.class, args);
	}

}
