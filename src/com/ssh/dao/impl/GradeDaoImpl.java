package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.ssh.dao.IGradeDao;
import com.ssh.dmain.Grade;
import com.ssh.dmain.Student;


public class GradeDaoImpl implements IGradeDao {
	private HibernateTemplate hibernateTemplate;

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	//保存部门
	public void save(Grade grade) {
		hibernateTemplate.save(grade);		
	}
	
	@Override
	//查询所有部门
	public List<Grade> findAll() {
		return  (List<Grade>) hibernateTemplate.find("from Grade");
	}

	@Override
	//根据id查询部门
	public Grade findById(Integer gid) {
		List list =  hibernateTemplate.find("from Grade where gId = ?",Long.valueOf(gid));
		return (Grade) list.get(0);
	}

	@Override
	//删除部门
	public void delete(Grade grade) {
		hibernateTemplate.delete(grade);
	}

	@Override
	//更新部门
	public void update(Grade grade) {
		hibernateTemplate.update(grade);
	}

	@Override
	//根据name查询部门
	public Grade findByName(String gname) {
		List list =  hibernateTemplate.find("from Grade where gName = ?",gname);
		return (Grade) list.get(0);

	}

	@Override
	public int findCount() {
		List<Long> list =  (List<Long>) hibernateTemplate.find("select count(*) from Grade");
		if(list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}


	@Override
	public List<Grade> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Grade.class);
		List<Grade> list = (List<Grade>) hibernateTemplate.findByCriteria(criteria,begin,pageSize);
		return list;
	}












}
