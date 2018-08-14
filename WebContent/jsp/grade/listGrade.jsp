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
			<td align="center" style="font-size: 36px; color: #666">班级管理</td>
		</tr>
		<tr>
			<td align="right">
			      <a href="grade_addGrade.action">添加</a>
			      <a href="javascript:history.go(-1)">退回 </a>
			</td>
		</tr>
	</table>
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

	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<th>班级名字</th>
				<th>班主任</th>
				<th>班级说明</th>
				<th>查询所有学生</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="g">
				<tr>
					<td><s:property value="#g.gName" /></td>
					<td><s:property value="#g.gHead" /></td>
					<td><s:property value="#g.gDesc" /></td>
					<td>
					    <a href="grade_findByGrade.action?gId=<s:property value="#g.gId"/>">
					       <span class="glyphicon glyphicon-pencil"></span>
					    </a>
					</td>
					<td>
					    <a href="grade_editGrade.action?gId=<s:property value="#g.gId"/>">
					       <span class="glyphicon glyphicon-pencil"></span>
					    </a>
					</td>
					<td>
					    <a href="grade_deleteGrade.action?gId=<s:property value="#g.gId"/>">
					       <span class="glyphicon glyphicon-remove"></span>
					    </a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br/>
	
	
	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	开始演示模态框
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					学生列表
				</h4>
			</div>
			<div class="modal-body">
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
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->



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
					<a href="grade_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a href="grade_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
               </s:if> 
               <s:if test="currPage != totalPage">
					<a href="grade_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                    <a href="grade_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]<s:property value="totalPage"/></a>&nbsp;&nbsp;
               </s:if> 
            </span>
            </td>
		</tr>
	</table>
	</div>
</body>
</html>