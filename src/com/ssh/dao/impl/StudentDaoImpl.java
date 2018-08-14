package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ssh.dao.IStudentDao;
import com.ssh.dmain.Student;

public class StudentDaoImpl implements IStudentDao {
	private HibernateTemplate hibernateTemplate;

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	//保存学生
	public void save(Student student) {

		//保存学生
		hibernateTemplate.save(student);		
	}
	
	@Override
	//查询所有学生
	public List<Student> findAll() {
		return  (List<Student>) hibernateTemplate.find("from Student");
	}

	@Override
	//根据id查询学生
	public Student findById(Integer sid) {
		List list =  hibernateTemplate.find("from Student where sId = ?",Long.valueOf(sid));
		return (Student) list.get(0);
	}

	@Override
	//删除学生
	public void delete(Student student) {
		hibernateTemplate.delete(student);
	}

	@Override
	//更新学生
	public void update(Student student) {
		hibernateTemplate.update(student);
	}

	@Override
	//根据name查询学生
	public Student findByName(String sname) {
		List list =  hibernateTemplate.find("from Student where sName = ?",sname);
		return (Student) list.get(0);

	}

	@Override
	//查询学生总数
	public int findCount() {
		List<Long> list =  (List<Long>) hibernateTemplate.find("select count(*) from Student");
		if(list.size()>0) {
			return  list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Student> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
		List<Student> list = (List<Student>) hibernateTemplate.findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public List<Student> findByGrade(Integer gid) {
		return  (List<Student>) hibernateTemplate.find("from Student s left outer join fetch  s.grade where s.grade.gId = ?", Long.valueOf(gid));
	}












}
