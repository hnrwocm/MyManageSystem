package com.ssh.dmain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



/**
 * 班级的实体类
 * @author OCM
 *
 */
public class Grade implements Serializable{
	//班级号码
	private Long gId;
	//班级名字
	private String gName;
	//班主任
	private String gHead;
	//班级说明
	private String  gDesc;
	
	private Set<Student> students = new HashSet<Student>(0);
	

	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Long getgId() {
		return gId;
	}
	public void setgId(Long gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgHead() {
		return gHead;
	}
	public void setgHead(String gHead) {
		this.gHead = gHead;
	}
	public String getgDesc() {
		return gDesc;
	}
	public void setgDesc(String gDesc) {
		this.gDesc = gDesc;
	}
	@Override
	public String toString() {
		return "Grade [gId=" + gId + ", gName=" + gName + ", gHead=" + gHead + ", gDesc=" + gDesc + "]";
	}
	
	
	
	
}
