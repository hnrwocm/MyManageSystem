package com.ssh.service;

import java.util.List;

import com.ssh.dmain.Grade;
import com.ssh.dmain.PageBean;

public interface IGradeService {
	
	Grade findById(Integer gid);
	
	void save(Grade grade);
	
	void update(Grade grade);

	List<Grade> findAll();

	void delete(Grade grade);
	
	Grade findByName(String gname);
	
	PageBean<Grade> findByPage(Integer currPage);
}
