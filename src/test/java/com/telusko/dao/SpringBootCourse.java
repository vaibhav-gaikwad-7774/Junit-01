package com.telusko.dao;

public abstract class SpringBootCourse implements Course{
	
	@Override
	public boolean coursePurchased() {
		
		System.out.println("SpringBoot Course purchased");
		return true;
		
	}


}
