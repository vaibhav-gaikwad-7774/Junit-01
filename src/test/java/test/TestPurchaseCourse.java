package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.telusko.dao.JavaCourse;
import com.telusko.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void proceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		pc.proceedWithCourse(new JavaCourse());
	}

}
