<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Fight Landload</title>
	<base href="${pageContext.request.contextPath }/gamecenter">
	<link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/main/main.css" rel="stylesheet">
	<script src="static/jquery/jquery-1.11.3.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="padding-div">
		<div class="btn-group">
	  		<a class="btn btn-success dropdown-toggle" data-toggle="dropdown" href="#">${user.nickname }<span class="caret"></span></a>
	  		<ul class="dropdown-menu">
	    		<li><a href="user/info?username=${user.userName }">我的信息</a></li>
	    		<li><a href="logout">注销</a></li>
	  		</ul>
		</div>
	</div>
	<h3>Fight Landload</h3>
</body>
</html>