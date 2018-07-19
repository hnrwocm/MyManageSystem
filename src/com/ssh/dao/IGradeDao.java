package com.ssh.dao;

import java.util.List;

import com.ssh.dmain.Grade;

public interface IGradeDao {

	List<Grade> findAll();

	Grade findById(Integer gid);

	void save(Grade grade);
	
	void delete(Grade grade);
	
	void update(Grade grade);

	Grade findByName(String gname);

	int findCount();

	List<Grade> findByPage(int begin, int pageSize);


	
}
