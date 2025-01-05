package com.telusko.dao;

public abstract class JunitCourse implements Course{
	
	@Override
	public boolean coursePurchased() {
		
		System.out.println("Junit Course purchased");
		return true;
		
	}


}
