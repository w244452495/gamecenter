<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Game Center</title>
</head>
<body>
	<c:choose>
		<c:when test="${null == user }">
			<div>
				<a href="${pageContext.request.contextPath }/login">登录</a>
				<a href="${pageContext.request.contextPath }/register">注册</a>
			</div>
		</c:when>
		<c:otherwise>
			<div>
				<span>Welcome</span>
				<a href="${pageContext.request.contextPath }/user/info?username=${user.userName }">${user.nickname }</a>
				<a href="${pageContext.request.contextPath }/logout">注销</a>
			</div>
		</c:otherwise>
	</c:choose>
	<div><a href="${pageContext.request.contextPath }/landlord/home"> >>> Fight Landload</a></div>
</body>
</html>