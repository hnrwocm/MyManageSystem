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
	<div class="container">
	<table border="0" width="600px" class="table">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">学生添加</td>
		</tr>
		<tr>
			<td align="right">
			    <a href="javascript:document.getElementById('saveForm').submit()">保存</a>
				&nbsp;&nbsp; 
				<a href="javascript:history.go(-1)">退回 </a>
		   </td>
		</tr>
	</table>
	<br/>
	<br/>
	<!-- action对应一个action标签，id对应提交时的对应关系 -->
	<s:form id="saveForm" action="student_saveStudent.action" method="post" namespace="/" theme="simple">
		<table style="font-size:16px" class="table">
			<tr>
				<td align="right">学生姓名：</td>
				<td><s:textfield name="sName" /></td>
				<td align="right">性别：</td>
				<td><s:radio list="{'男','女'}" name="sSex" /></td>
			</tr>
			<tr>
				<td align="right">出生日期：</td>
				<td><s:textfield name="sBirthday" /></td>
				
				<td align="right">所属班级：</td>
				<td><s:textfield name="sGrade" /></td>
			</tr>

			<tr>
				<td align="right">学号：</td>
				<td><s:textfield name="sNo" /></td>
				<td align="right">手机号码：</td>
				<td><s:textfield name="sPhone" /></td>
				<td align="right">家庭地址：</td>
				<td><s:textfield name="sAddress" /></td>
			</tr>
		</table>
	</s:form>
	</div>
</body>
</html> 