<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>CSS3 Skype加载动画代码 - 源码之家</title>

<style>
body {
  background-color: #02aff1;
}

#center {
  position: absolute;
  top: 50%;
  left: 50%;
  margin-top: -180px;
  margin-left: -75px;
  width: 150px;
  height: 80px;
  font-family: "Lato", sans-serif;
  font-weight: 600;
  font-size: 16px;
  color: #fff;
  text-align: center;
  -webkit-font-smoothing: antialiased;
}

.skype-loader {
  width: 80px;
  height: 80px;
  position: relative;
  margin: auto;
  margin-top: 60px;
  margin-bottom: 70px;
}

.skype-loader .dot {
  position: absolute;
  top: 0;
  left: 0;
  width: 80px;
  height: 80px;

  animation: 1.7s dotrotate cubic-bezier(0.775, 0.005, 0.310, 1.000) infinite;
}

.skype-loader .dot:nth-child(1) {
  animation-delay: 0.2s;
}

.skype-loader .dot:nth-child(2) {
  animation-delay: 0.35s;
}

.skype-loader .dot:nth-child(3) {
  animation-delay: 0.45s;
}

.skype-loader .dot:nth-child(4) {
  animation-delay: 0.55s;
}

.skype-loader .dot:after, .skype-loader .dot .first {
  content: "";
  position: absolute;
  width: 8px;
  height: 8px;
  background: white;
  border-radius: 50%;
  left: 50%;
  margin-left: -4px;
}

.skype-loader .dot .first {
  background: #fff;
  margin-top: -4px;
  animation: 1.7s dotscale cubic-bezier(0.775, 0.005, 0.310, 1.000) infinite;
  animation-delay: 0.2s;
}

@keyframes dotrotate { 
  from { transform: rotate(0deg); } 
  to { transform: rotate(360deg); }
}

@keyframes dotscale { 
  0%, 10% { width: 16px; height: 16px; margin-left: -8px;  margin-top: -4px; } 
  50% { width: 8px; height: 8px; margin-left: -4px; margin-top: 0; }
  90%, 100% { width: 16px; height: 16px;  margin-left: -8px;  margin-top: -4px; }
}
</style>

</head>
<body>
<div id="center">
  <img src="img/skype.png" width="150" alt="">
  <div class="skype-loader">
    <div class="dot">
      <div class="first"></div>
    </div>
    <div class="dot"></div>
    <div class="dot"></div>
    <div class="dot"></div>
  </div>
  Logging in...
</div>

<div style="text-align:center;">

</div>
<script src="http://www.mycodes.net/js/tongji.js"></script>
<script src="http://www.mycodes.net/js/youxia.js" type="text/javascript"></script>
</body>
</html>

