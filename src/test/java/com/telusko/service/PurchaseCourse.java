package com.telusko.service;

import com.telusko.dao.Course;

public class PurchaseCourse {
	
	private Course course;
	
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
		
	}

}
