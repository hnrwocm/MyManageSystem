package com.ssh.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hibernate的工具类
 * @author ocm
 *
 */
public class HibernateUtil {
	static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	public static Session getSession() {
		return factory.openSession();
	}
	public static Session getCurrentSession() {
		return factory.getCurrentSession();
	}
}
