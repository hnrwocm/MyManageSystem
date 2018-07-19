package com.ssh.action;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.ssh.dmain.PageBean;
import com.ssh.dmain.Student;
import com.ssh.service.IStudentService;
import com.ssh.utils.HibernateUtil;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	//业务层注入
	private IStudentService studentService;
	//模型驱动
	private Student student = new Student();
	//设置当前页数
	private Integer currPage = 1;
	private Integer skipPage;
	
	public Integer getSkipPage() {
		return skipPage;
	}

	public void setSkipPage(Integer skipPage) {
		this.skipPage = skipPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public Student getModel() {
			return student;
	}
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	//查询所有学生,并把查询到的结果集添加到值栈中
	public String findAll() {
		PageBean<Student> pageBean = studentService.findByPage(currPage);
		
		ActionContext.getContext().getValueStack().push(pageBean);
//		ActionContext.getContext().getValueStack().set("list", studentService.findAll());
		return "findAll";
	}
	//根据Id查询学生,并把查询到的结果添加到值栈中
	public String findById() {
		ActionContext.getContext().getValueStack().set("list", studentService.findById(student.getsId().intValue()));
		return "findById";
	}
	//根据name查询学生,并把查询的结果封装到值栈中
	public String findByName() {
		ActionContext.getContext().getValueStack().set("list", studentService.findByName(student.getsName()));
		return "findByName";
	}
	//删除学生,调用了findById
	public String deleteStudent() {
		studentService.delete(studentService.findById(student.getsId().intValue()));
		return "deleteStudent";		
	}
	//跳转到添加学生页面
	public String addStudent(){
		return "addStudent";
	}
	//跳转到编辑页面,找到要编辑的学生,并把编辑前的学生信息传入输入框
	public String editStudent(){
		System.out.println(student);
		ActionContext.getContext().getValueStack().set("list",studentService.findById(student.getsId().intValue()));
		return "editStudent";
	}
	//保存学生
	public String saveStudent(){
		studentService.save(student);
		return "saveStudent";
	}
	//更新学生
	public String updateStudent() {
		studentService.update(student);
		return "updateStudent";
		
	}

	
	

	
}
