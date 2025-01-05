package test;

import org.junit.jupiter.api.Test;

import com.telusko.dao.Course;
import com.telusko.dao.JavaCourse;
import com.telusko.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void proceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		pc.proceedWithCourse( JavaCourse());
	}

	public Course JavaCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
