package com.ssh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.dmain.Student;
import com.ssh.service.IGradeService;
import com.ssh.service.IStudentService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class SpringHibernateTest01 {
	@Autowired
	private IStudentService cs;
	@Autowired
	private IGradeService gs;
	@Test
	public void testSave() {
		Student s = new Student();
		s.setsName("springTest");
		cs.save(s);
	}
	
	@Test
	public void testFindAll() {
		List students = cs.findAll();
		for (Object student : students) {
			System.out.println(student);
		}
	}	
	@Test
	public void testFindAllg() {
		List grades = gs.findAll();
		for (Object grade : grades) {
			System.out.println(grade);
		}
	}
}
