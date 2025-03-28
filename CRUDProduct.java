package com.hibernate_demo;

import org.hibernate.Session;

public class CRUDProduct {
	void insertProduct(Product p1) {
		Session session = MyHbConf.getSessionProduct();
		session.save(p1);

		session.beginTransaction().commit();
		System.out.println("Data Inserted");
	}

	void updateProduct(Product p1) {
		Session session = MyHbConf.getSessionProduct();
		session.saveOrUpdate(p1);

		session.beginTransaction().commit();
		System.out.println("Data Updated");
	}

	void displayProduct(int id) {
		Session session = MyHbConf.getSessionProduct();
		Product p1 = session.get(Product.class, id);
		if (p1 != null) {
			System.out.println("Prodcut ID: " + p1.getPid());
			System.out.println("Product Name: " + p1.getName());
			System.out.println("Product Category:" + p1.getCategory());
			System.out.println("Product Cost: " + p1.getCost());
		} else {
			System.out.println("Record NOT Found");
		}

	}
}