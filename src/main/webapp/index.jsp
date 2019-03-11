<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Game Center</title>
	<base href="${pageContext.request.contextPath }/gamecenter">
	<link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/main/main.css" rel="stylesheet">
	<script src="static/jquery/jquery-1.11.3.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<c:choose>
		<c:when test="${null == user }">
			<div class="padding-div">
				<a href="login" class="btn btn-success">登录</a>
				<a href="register" class="btn btn-info">注册</a>
			</div>
		</c:when>
		<c:otherwise>
			<div class="padding-div">
				<div class="btn-group">
			  		<a class="btn btn-success dropdown-toggle" data-toggle="dropdown" href="#">${user.nickname }<span class="caret"></span></a>
			  		<ul class="dropdown-menu">
			    		<li><a href="user/info?username=${user.userName }">我的信息</a></li>
			    		<li><a href="logout">注销</a></li>
			  		</ul>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
	<div class="padding-div">
		<div class="btn-group">
	  		<a class="btn btn-large btn-info dropdown-toggle" data-toggle="dropdown" href="#">Game Center&nbsp;&nbsp;&nbsp;<span class="caret"></span></a>
	  		<ul class="dropdown-menu">
	    		<li><a href="landlord/home">Fight Landload</a></li>
	  		</ul>
		</div>
	</div>
</body>
</html>