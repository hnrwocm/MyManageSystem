<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<s:debug></s:debug>
	<div class="container">

	<table class="table">
		<tr>
			<td align="center" style="font-size: 36px; color: #666">学生管理</td>
		</tr>
		<tr>
			<td align="right">
			      <a href="student_addStudent.action">添加</a>
			      <a href="javascript:history.go(-1)">退回 </a>
			</td>
		</tr>
	</table>
	
		<form class="pull-left" role="form" action="${pageContext.request.contextPath}/student_findByName.action" method="post">				
					查询的姓名:
				<input type="text"  name="sName" placeholder="请输入查询的学生姓名" style="border-radius: 5%;">
				<input type="submit" value="提交">
	</form>
		<div class="dropdown pull-right" style="margin-bottom:5px">
			<button type="button" class="btn dropdown-toggle" id="dropdownMenu1" 
					data-toggle="dropdown">
				管理
				<span class="caret"></span>
			</button>
			<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
				<li role="presentation" class="dropdown-header">学生管理</li>
				<li role="presentation" >
					<a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/student_findAll">总览</a>
				</li>
		
				<li role="presentation" class="divider"></li>
				<li role="presentation" class="dropdown-header">班级管理</li>
				<li role="presentation">
					<a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/grade_findAll">总览</a>
				</li>
			</ul>
		</div>
	<br />
	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<th>学生学号</th>
				<th>学生姓名</th>
				<th>性别</th>
				<th>出生日期</th>
				<th>所在班级</th>
				<th>手机号码</th>
				<th>家庭地址</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="s">
				<tr>
					<td><s:property value="#s.sNo" /></td>
					<td><s:property value="#s.sName" /></td>
					<td><s:property value="#s.sSex" /></td>
					<td><s:date format="yyyy-MM-dd" name="#s.sBirthday" /></td>
					<td><s:property value="#s.sGrade" /></td>
					<td><s:property value="#s.sPhone" /></td>
					<td><s:property value="#s.sAddress" /></td>

					<td>
					    <a href="student_editStudent.action?sId=<s:property value="#s.sId"/>">
					       <span class="glyphicon glyphicon-pencil"></span>
					    </a>
					</td>
					<td>
					    <a href="student_deleteStudent.action?sId=<s:property value="#s.sId"/>">
					       <span class="glyphicon glyphicon-remove"></span>
					    </a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br/>
		<table border="0" cellspacing="0" cellpadding="0" width="900px">
		<tr>
			<td align="right">
			<span>
			     第<s:property value="currPage" />/<s:property value="totalPage" />页
			</span>
			&nbsp;&nbsp; 
			<span>
			    总记录数：<s:property value="totalCount" />&nbsp;&nbsp;
			    每页显示:<s:property value="pageSize" /></span>&nbsp;&nbsp; 
			<span>
			   <s:if test="currPage != 1">
					<a href="student_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a href="student_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
               </s:if>
               <s:if test="currPage != totalPage">
					<a href="student_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
					
                    <a href="student_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]<s:property value="totalPage"/></a>&nbsp;&nbsp;
               </s:if> 
            </span>
            </td>
		</tr>
	</table>
	</div>
</body>
</html>