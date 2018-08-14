package com.ssh.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssh.dao.IStudentDao;
import com.ssh.dao.impl.StudentDaoImpl;
import com.ssh.dmain.PageBean;
import com.ssh.dmain.Student;
import com.ssh.service.IStudentService;
import com.ssh.utils.HibernateUtil;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao studentDao;
	

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	//保存学生
	public void save(Student student) {
		studentDao.save(student);
	}
	
	@Override
	//查询所有
	public List<Student> findAll() {		
		List<Student> students =  studentDao.findAll();
		return students;		
	}
	
	@Override
	//查询一个
	public Student findById(Integer sid) {
		Student student = studentDao.findById(sid);
		return student;
		
	}
	@Override
	//删除
	public void delete(Student student) {
		studentDao.delete(student);
	}
	
	@Override
	//更新
	public void update(Student student) {
		studentDao.update(student);
	}
	
	@Override
	//通过name查询学生
	public Student findByName(String sname) {
		Student student = studentDao.findByName(sname);
		return student;
	}

	@Override
	public PageBean<Student> findByPage(Integer currPage) {
		  PageBean<Student> pageBean = new PageBean<Student>();

	        pageBean.setCurrPage(currPage);

	        int pageSize = 5;
	        pageBean.setPageSize(pageSize);

	        int totalCount = studentDao.findCount();
	        pageBean.setTotalCount(totalCount);

	        int totalPage;
	        if(totalCount%pageSize==0){
	        	totalPage = totalCount/pageSize;
	        }else{
	        	totalPage = totalCount/pageSize + 1; 
	        }
	        pageBean.setTotalPage(totalPage);

	        int begin= (currPage - 1)*pageSize;
	        List<Student> list = studentDao.findByPage(begin, pageSize);
	        pageBean.setList(list);
			return pageBean;
	}

	@Override
	public List<Student> findByGrade(Integer gid) {
		List<Student> students =  studentDao.findByGrade(gid);
		return students;						
	}


}
