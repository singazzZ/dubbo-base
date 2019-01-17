package com.consumer;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.device.DeviceService;

public class ConsumerTest {
	public static AtomicInteger count1 = new AtomicInteger(0);
	public static AtomicInteger count2 = new AtomicInteger(0);
	public static AtomicInteger count3 = new AtomicInteger(0);
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer start !!!");
		DeviceService deviceService = context.getBean(DeviceService.class);
		for (;;) {
			Scanner scanner = new Scanner(System.in);  
			String line = scanner.nextLine(); 
			String name = deviceService.getDeviceName();
			System.out.println(name);
		}
		
		
//		for (int i = 0; i < 100; i++) {
//			Consumer c = new Consumer(deviceService);
//			c.start();
//		}
//		Thread.sleep(5000);
//		System.out.println("count1 = " + count1.get());
//		System.out.println("count2 = " + count2.get());
//		System.out.println("count3 = " + count3.get());
//		context.close();
	}
}

class Consumer extends Thread {
	DeviceService deviceService;
	public Consumer(DeviceService deviceService) {
		this.deviceService = deviceService;
	}
	
	public void run() {
		String name = deviceService.getDeviceName();
		System.out.println(name);
		if (name.contains("立式")) {
			ConsumerTest.count1.getAndIncrement();
		} else if (name.contains("桌面式")) {
			ConsumerTest.count2.getAndIncrement();
		} else if (name.contains("便携式")) {
			ConsumerTest.count3.getAndIncrement();
		}
	}
}