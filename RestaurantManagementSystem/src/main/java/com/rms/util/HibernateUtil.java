package com.rms.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory getSessionFactory() {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	return sessionFactory;
	}

}
