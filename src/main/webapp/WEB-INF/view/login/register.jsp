<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>请登录...</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/register/submit" method="post">
		<span>用户名</span><input type="text" name="userName"/><br />
		<span>密码</span><input type="password" name="password"/><br />
		<span>确认密码</span><input type="password" name="chekcPassword"/><br />
		<button>注册</button>
	</form>
</body>
</html>