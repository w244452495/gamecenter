<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Game Center</title>
	<base href="${pageContext.request.contextPath }/gamecenter">
	<link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script src="static/jquery/jquery-1.11.3.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<c:choose>
		<c:when test="${null == user }">
			<blockquote>
  				<p><a href="login">登录</a>&nbsp;&nbsp;&nbsp;<a href="register">注册</a></p>
			</blockquote>
		</c:when>
		<c:otherwise>
			<div>
				<span>Welcome</span>
				<a href="user/info?username=${user.userName }">${user.nickname }</a>
				<a href="logout">注销</a>
			</div>
		</c:otherwise>
	</c:choose>
	<div></div>
	<div class="btn-group">
  		<a class="btn btn-large btn-info dropdown-toggle" data-toggle="dropdown" href="#">Game Center&nbsp;&nbsp;&nbsp;<span class="caret"></span></a>
  		<ul class="dropdown-menu">
    		<li><a href="landlord/home">Fight Landload</a></li>
  		</ul>
	</div>
	
</body>
</html>