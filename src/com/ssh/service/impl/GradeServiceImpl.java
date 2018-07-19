package com.ssh.service.impl;

import java.util.List;

import com.ssh.dao.IGradeDao;
import com.ssh.dmain.Grade;
import com.ssh.dmain.PageBean;
import com.ssh.dmain.Student;
import com.ssh.service.IGradeService;


public class GradeServiceImpl implements IGradeService {
	private IGradeDao gradeDao;
	

	public void setGradeDao(IGradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}
	
	@Override
	//保存部门
	public void save(Grade grade) {
		gradeDao.save(grade);
	}
	
	@Override
	//查询所有
	public List<Grade> findAll() {		
		List<Grade> grades =  gradeDao.findAll();
		return grades;		
	}
	
	@Override
	//查询一个
	public Grade findById(Integer gid) {
		Grade grade = gradeDao.findById(gid);
		return grade;
		
	}
	@Override
	//删除
	public void delete(Grade grade) {
		gradeDao.delete(grade);
	}
	
	@Override
	//更新
	public void update(Grade grade) {
		gradeDao.update(grade);
	}
	
	@Override
	//通过name查询部门
	public Grade findByName(String gname) {
		Grade grade = gradeDao.findByName(gname);
		return grade;
	}

	@Override
	public PageBean<Grade> findByPage(Integer currPage) {
		PageBean<Grade> pageBean = new PageBean<Grade>();
		pageBean.setCurrPage(currPage);
		int pageSize = 5;
		pageBean.setPageSize(pageSize);
		int totalCount = gradeDao.findCount();
		pageBean.setTotalCount(totalCount);
		int totalPage;
        if(totalCount%pageSize==0){
        	totalPage = totalCount/pageSize;
        }else{
        	totalPage = totalCount/pageSize + 1; 
        }
        pageBean.setTotalPage(totalPage);
        int begin= (currPage - 1)*pageSize;
        List<Grade> list = gradeDao.findByPage(begin, pageSize);
        pageBean.setList(list);
        
		return pageBean;
	}


}
