package com.ssh.dmain;

import java.io.Serializable;
import java.util.Date;
/**
 * 学生的实体类
 * @author OCM
 *
 */
public class Student implements Serializable {
	//学生id
	private Long sId;
	//学生学号
	private Long sNo;
	//学生姓名
	private String sName;
	//学生性别
	private String sSex;
	//学生的出生日期
	private Date sBirthday;
	//学生所属班级
	private String sGrade;
	//学生手机号码
	private String sPhone;
	//学生家庭地址
	private String sAddress;
	
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	
	public Long getsNo() {
		return sNo;
	}
	public void setsNo(Long sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public Date getsBirthday() {
		return sBirthday;
	}
	public void setsBirthday(Date sBirthday) {
		this.sBirthday = sBirthday;
	}
	public String getsGrade() {
		return sGrade;
	}
	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sSex=" + sSex + ", sBirthday=" + sBirthday + ", sGrade="
				+ sGrade + ", sPhone=" + sPhone + ", sAddress=" + sAddress + "]";
	}
	
	
	
}
