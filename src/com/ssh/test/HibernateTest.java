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
	@Test
	public void test5() {
		Student s = new Student();
		s.setsName("测试");

		//1.解析主配置文件
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.根据配置文件创建SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		//3.根据SessionFactory创建Session
		Session session =factory.openSession();
		//4.开启事务
		Transaction tx = session.beginTransaction();
		//5.执行操作(保存)
		session.save(s);
		//6.提交事务
		tx.commit();
		//7.释放资源
		session.close();
		factory.close();
	}

}
