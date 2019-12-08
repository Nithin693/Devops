package com.fashionBackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fashionBackend.dao.CategoryDAO;
import com.fashionBackend.model.Category;

public class CategoryDAOTest {

	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void executeFirst() {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.fashionBackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
		
	
	}
	
	@Test
	public void addCategoryTest() {
		Category category=new Category();
		category.setCategoryName("Branded Men Pants");
		category.setCategoryDesc("All branded men pants");
		assertTrue("problem occoured while adding",categoryDAO.addCategory(category));
	}

}
