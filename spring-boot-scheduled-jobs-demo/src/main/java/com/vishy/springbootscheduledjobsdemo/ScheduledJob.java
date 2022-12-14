package com.vishy.springbootscheduledjobsdemo;

import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJob {
	
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
	  System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	}

}
