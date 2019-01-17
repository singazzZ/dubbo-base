package com.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProviderStart {
	public static void main( String[] args ) throws IOException {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("provider start !!!");
		System.in.read();
        System.out.println("provider end !!!" );
    }
}
