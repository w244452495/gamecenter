<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>请登录...</title>
	<base href="${pageContext.request.contextPath }/gamecenter">
	<link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/login.css" rel="stylesheet">
	<script src="static/jquery/jquery-1.11.3.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="form-div">
		<form action="login/submit" method="post" class="form-horizontal">
			<div class="control-group">
				<label class="control-label" for="inputEmail">用户名</label>
				<div class="controls">
					<input type="text" name="userName" value="admin" placeholder="用户名"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">密&nbsp;&nbsp;&nbsp;码</label>
				<div class="controls">
					<input type="password" name="password" value="123456" placeholder="密码"/>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button type="submit" class="btn btn-info">登录</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>