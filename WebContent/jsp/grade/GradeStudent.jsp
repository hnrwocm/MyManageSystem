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
	
	</div>

</body>
</html>