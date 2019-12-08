package com.fashionBackend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.fashionBackend.model.Category;


@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public List<Category> listCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=(Query)session.createQuery("from Category");
		List<Category> listCategories=query.list();
		session.close();
		return listCategories;
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Category category=(Category) session.get(Category.class, categoryId);
		return category ;
	}

	
}
