<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>教务管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <link href="css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	 <div class="header" style="line-height: 55px;"><a href="${pageContext.request.contextPath}/student_findAll" style="font-size: 35px;line-height: 55px;")>欢迎来到教务管理系统>></a>
	  </div>
	<div class="container">		
	    <div class="login_box">
	        <div class="login_l_img"><img src="images/login-img.png" /></div>
	        <div class="login">
	            <div class="login_logo"><a href="#"><img src="images/login_logo.png" /></a></div>
	            <div class="login_name">
	                <p>后台管理系统</p>
	            </div>
	            <form method="post" action="${pageContext.request.contextPath}/login">
	                <input name="username" type="text" value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
	                <span id="password_text" onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();">密码</span>
	                <input name="password" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};" />
	                <span></span>
	                <input value="登录" style="width:100%;" type="submit">
	            </form>
	            
	            
<input   value="注册" style="width:100%;margin-top:5px;" type="submit" data-toggle="modal" data-target="#myModal">
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">
				</button>
				<h4 class="modal-title" id="myModalLabel">
					注册
				</h4>
			</div>
			<div class="modal-body">
				<form method="post" action="${pageContext.request.contextPath}/register">
	                <input name="lUsername" type="text" value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
	                
	                <input name="lPassword" type="password" id="password"/>
	                <span></span>
	                <input value="注册" style="width:100%;" type="submit">
	            </form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
	            
	            
	            
	            
	            
	        </div>
	        <div class="copyright">hnrwocm 版权所有©2016-2018 技术支持电话：000-00000000</div>
		</div>
	</div>
</body>

</html>