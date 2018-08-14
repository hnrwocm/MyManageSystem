package com.ssh.action;



import java.util.List;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.ssh.dmain.Grade;
import com.ssh.dmain.PageBean;
import com.ssh.dmain.Student;
import com.ssh.service.IGradeService;
import com.ssh.service.IStudentService;


public class GradeAction extends ActionSupport implements ModelDriven<Grade>{
	//业务层注入
	private IGradeService gradeService;
	private IStudentService studentService;
	//模型驱动
	private Grade grade = new Grade();
	
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
	

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public Grade getModel() {
		
		return grade;
	}
	public void setGradeService(IGradeService gradeService) {
		this.gradeService = gradeService;
	}
	
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	//查询所有班级,并把查询到的结果集添加到值栈中
	public String findAll() {
		PageBean<Grade> pageBean = gradeService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	//根据Id查询班级,并把查询到的结果添加到值栈中
	public String findById() {
		ActionContext.getContext().getValueStack().set("list", gradeService.findById(grade.getgId().intValue()));
		return "findById";
	}
	//根据name查询班级,并把查询的结果封装到值栈中
	public String findByName() {
		ActionContext.getContext().getValueStack().set("list", gradeService.findByName(grade.getgName()));
		return "findByName";
	}
	//删除班级,调用了findById
	public String deleteGrade() {
		gradeService.delete(gradeService.findById(grade.getgId().intValue()));
		return "deleteGrade";		
	}
	//跳转到添加班级页面
	public String addGrade(){
		return "addGrade";
	}
	//跳转到编辑页面,找到要编辑的班级,并把编辑前的班级信息传入输入框
	public String editGrade(){
		System.out.println(grade);
		ActionContext.getContext().getValueStack().set("list",gradeService.findById(grade.getgId().intValue()));
		return "editGrade";
	}
	//保存班级
	public String saveGrade(){
		gradeService.save(grade);
		return "saveGrade";
	}
	//更新班级
	public String updateGrade() {
		gradeService.update(grade);
		return "updateGrade";
		
	}
	public String findByGrade() {
		List<Student> list = studentService.findByGrade(grade.getgId().intValue());
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("GradeAction中的findByGrade方法执行了");
		ActionContext.getContext().getValueStack().set("list", list);
		return "findByGrade";
	}

	
	

	
}
