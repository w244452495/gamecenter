<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>请登录...</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login/submit" method="post">
		<span>用户名</span><input type="text" name="userName" value="admin"/><br />
		<span>密码</span><input type="password" name="password" value="123456"/><br />
		<button>登录</button>
	</form>
</body>
</html>