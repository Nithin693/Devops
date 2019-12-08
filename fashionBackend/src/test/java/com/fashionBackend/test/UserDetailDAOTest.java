package com.fashionBackend.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fashionBackend.dao.UserDetailDAO;
import com.fashionBackend.model.UserDetail;

public class UserDetailDAOTest {
	
	static UserDetailDAO userDetailDAO;
	
	@BeforeClass
	public static void executeFirst() {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.fashionBackend");
		context.refresh();
		userDetailDAO=(UserDetailDAO)context.getBean("UserDetailDAO");
		
	
	}
	
	@Test
	public void addCategoryTest() {
UserDetail user=new UserDetail();
		
		user.setUsername("suneel");
		user.setCustomerName("Sneel Nair");
		user.setAddress("MMDA,chennai");
		user.setEmailId("temp321@gmail.com");
		user.setEnabled(true);
		user.setPhoneNo("9287452891");
		user.setPassword("12345");
		user.setRole("ROLE_USER");
		
		assertTrue("Problem in Registering User:",userDetailDAO.addUserDetail(user));
	}

}

