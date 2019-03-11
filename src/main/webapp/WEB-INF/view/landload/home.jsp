<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Fight Landload</title>
</head>
<body>
	<div>
		<span>Welcome</span>
		<a href="${pageContext.request.contextPath }/user/info?username=${user.userName }">${user.nickname }</a>
		<a href="${pageContext.request.contextPath }/logout">注销</a>
	</div>
	<div>Fight Landload</div>
</body>
</html>