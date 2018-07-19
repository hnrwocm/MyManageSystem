package com.ssh.dao;

import java.util.List;

import com.ssh.dmain.Student;

public interface IStudentDao {

	List<Student> findAll();

	Student findById(Integer sid);

	void save(Student student);
	
	void delete(Student student);
	
	void update(Student student);

	Student findByName(String sname);

	int findCount();

	List<Student> findByPage(int begin, int pageSize);
	
}
