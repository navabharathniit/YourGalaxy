package com.galaxy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.galaxy.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
SessionFactory sessionFactory;
	public void addProduct(Product product) {
		
		Session session= sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(product);
			tx.commit();
			System.out.println("done");

	}
	
	

}
