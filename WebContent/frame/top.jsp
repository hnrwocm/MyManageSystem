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
</head>
<style>
	*{
		margin:0;
		padding:0;
	}
</style>
<body>
		<div style="background-image:url(${pageContext.request.contextPath }/images/1.jpg);background-size:100%;width:100%;height:200px;">	   
			<div style="margin-right: 10px;margin-bottom: 10px;">欢迎您：<s:property value="#session.existEmployee.ename" /></div>
		</div>
</body>
</html>
