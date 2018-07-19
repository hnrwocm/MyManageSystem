package com.ssh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ssh.dao.IStudentDao;
import com.ssh.dmain.Student;
import com.ssh.service.IGradeService;
import com.ssh.service.IStudentService;

public class SpringTest1 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IStudentService is = (IStudentService) ac.getBean("studentService");
//		System.out.println(is);

		IGradeService gs = (IGradeService) ac.getBean("gradeService");
		System.out.println(gs);
//		IStudentDao id = (IStudentDao) ac.getBean("studentDao");
//		System.out.println(id);
//		id.findAll();
//		Student c = new Student();
//		c.setsName("wwww");
//		is.save(c);
//		is.findAll();
	}

}
