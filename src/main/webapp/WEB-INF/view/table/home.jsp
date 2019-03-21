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
	<script src="http://cdn.jsdelivr.net/sockjs/1/sockjs.min.js"></script>
	<script src="static/js/table.js"></script>
	<script src="static/js/websocket-util.js"></script>
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
	<div class="padding-div">
		<input type="hidden" id="page_type" value="game" />
		<input type="hidden" id="page_id" value="${game.gameId }" />
		<input type="hidden" id="max_site_num" value="${game.maxSiteNum }" />
		<h3 id="gameName">${game.gameName }</h3>
		<div id="tableUrlList"></div>
	</div>
	<!-- <div id="websocketDiv">
		消息列表<br />
	</div>
	<input type="text" id="message"></input>
	<button onclick="send()">发送</button> -->
</body>
</html>