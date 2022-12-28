package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		System.out.println("Application is working");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		
		//getting the rate info bean and printing the object
		RateInfo rateInfo=context.getBean(RateInfo.class,"rate-info");
		System.out.println(rateInfo);
		System.out.println("---------------------------------------");
		
		//getting the contact bean and printing the object
		Contact contact=(Contact)context.getBean("contact");
		System.out.println(contact);
		System.out.println("---------------------------------------");
		
		//getting the customer bean and printing the object
		Customer customer=(Customer)context.getBean("customer");
		System.out.println(customer);
		System.out.println(customer.getmCustomerContact());
		System.out.println("---------------------------------------");
		
		
		//getting senderInfo bean and printing the object
		SenderInfo senderInfo=(SenderInfo)context.getBean("sender-info");
		System.out.println(senderInfo);
		System.out.println("---------------------------------------");
		
		//getting rateUpdateDetails bean and printing the object
		RateUpdateDetails rateUpdateDetails=(RateUpdateDetails)context.getBean("rate-update-details");
		System.out.println(rateUpdateDetails);
		System.out.println("----------------------------------------");
		
		RateUpdate rateUpdate=(RateUpdate)context.getBean("rate-update");
		System.out.println(rateUpdate);
		System.out.println(rateUpdate.getmUpdateDetails().toString());
		
		
		

	}

}
