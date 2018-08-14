package com.ssh.service;

import java.util.List;

import com.ssh.dmain.PageBean;
import com.ssh.dmain.Student;

public interface IStudentService {
	
	Student findById(Integer sid);
	
	void save(Student student);
	
	void update(Student student);

	List<Student> findAll();

	void delete(Student student);
	
	Student findByName(String sname);
	
	PageBean<Student> findByPage(Integer currPage);

	List<Student> findByGrade(Integer gid);
}
