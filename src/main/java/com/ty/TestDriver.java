package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Student stud =(Student)context.getBean("myStudent");
		
		System.out.println("Student name :"+stud.getName());
		System.out.println("studet age : "+stud.getAge());
		System.out.println("student height : "+stud.getHeight());
	}

}
