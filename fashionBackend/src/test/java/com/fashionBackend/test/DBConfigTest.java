package com.fashionBackend.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBConfigTest {
	public static void main(String arg[])
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.fashionbackend");
		
		context.refresh();
		
		context.close();
	}

}
