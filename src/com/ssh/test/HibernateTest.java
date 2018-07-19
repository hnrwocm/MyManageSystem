package com.ssh.test;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.ssh.dmain.Student;
import com.ssh.service.IStudentService;
import com.ssh.service.impl.StudentServiceImpl;
import com.ssh.utils.HibernateUtil;

public class HibernateTest {
	@Test
	public void test1() {
		Student s = new Student();
		s.setsName("测试学生6");
		Session session = HibernateUtil.getSession();		
		Transaction ts = session.beginTransaction();		
		session.save(s);		
		ts.commit();
		session.close();

	}
	@Test
	public void test2() {

		IStudentService studentSerive = new StudentServiceImpl();
		List<Student> students = studentSerive.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test3() {
		
		Session s = HibernateUtil.getCurrentSession();
		Transaction tx = s.beginTransaction();
		org.hibernate.Query query = s.createQuery("from Grade");
		List list = query.list();
		for (Object o : list) {
			System.out.println(o);
		}
		tx.commit();
	}
	
	@Test
	public void test4() {
		Session s1 = HibernateUtil.getSession();
		Session s2 = HibernateUtil.getSession();
		System.out.println(s1==s2);
		
//		Session s3 = HibernateUtil.getCurrentSession();
//		Session s4 = HibernateUtil.getCurrentSession();
//		System.out.println(s3==s4);
		
		
	}

}
