package com.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProviderStart3 {
	public static void main( String[] args ) throws IOException {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("provider3 start !!!");
		System.in.read();
        System.out.println("provider3 end !!!" );
    }
}
