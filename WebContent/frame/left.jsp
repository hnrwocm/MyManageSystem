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
<link href="${pageContext.request.contextPath }/css/dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/dtree.js"></script>
</head>

<body style="background-image:url(${pageContext.request.contextPath }/images/2.png);background-size:100%;background-color:#E9E9E9;" leftMargin="0" topMargin="0" marginwidth="0" marginheight="0">
	<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
		<div class="dtree">		     
			<script type="text/javascript">
				d = new dTree('d');
				d.add('01', '-1', '学生管理系统');
				d.add('0101', '01', '高中部');
				d.add('010101', '0101', '班级管理', 'department_findAll.action','', 'right');
				d.add('010102', '0101', '学生管理', 'employee_findAll.action','','right');
				d.add('010103', '0101', '学生优秀作品展', 'employee_show','','right');
				document.write(d);
			</script>
			
		</div>	
	</table>
	
</body>
</html>
