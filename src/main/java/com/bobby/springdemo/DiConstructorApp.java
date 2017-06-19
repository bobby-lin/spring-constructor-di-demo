package com.bobby.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bobby.springdemo.domain.HumanResourceDept;
import com.bobby.springdemo.domain.Organization;

public class DiConstructorApp {

	public static void main(String[] args) {
		// Create application context
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		
		// Create bean
		Organization org = (Organization) cxt.getBean("myorg");
		
		// invoke the corporate slogan via bean
		System.out.println(org.corporateSlogan());
		
		// Print organization details
//		System.out.println(org);
//		System.out.println(org.corporateServices());
		
		// Print HR Department hiring status
		HumanResourceDept hr = (HumanResourceDept) cxt.getBean("myhrdept");
		System.out.println(hr.hiringStatus(10000));
		
		// Close the application context
		((ClassPathXmlApplicationContext) cxt).close();
	}

}
