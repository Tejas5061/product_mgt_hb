package com.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHbConf {
	public static Session getSessionProduct() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session;
	}

}
