package com.telusko.dao;

public abstract class JavaCourse implements Course {
	
	@Override
	public boolean CoursePurchased() {
		System.out.println("java Course Purchased");
		return false;
	}

//	@Override
//	public boolean coursePurchased() {
//		return true;
	}




//15.5