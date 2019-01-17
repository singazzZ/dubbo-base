package com.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Hello world!
 *
 */
@Service
public class App 
{
	@Reference
	private App a;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
