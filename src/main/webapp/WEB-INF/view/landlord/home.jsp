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
	<script>
		var ws = null;
		function openWebSocket() {
			if('WebSocket' in window) {
				ws = new WebSocket('ws://localhost/gamecenter/gameCenterWebSocket.action');
				console.log('websocket已连接');
			} else {
				ws = new SockJs('http://localhost/gamecenter/gamecenter/sockjs/gameCenterWebSocket/info');
				console.log('sockjs已连接');
			}
			
			ws.open = function() {
				
			}
			
			ws.onmessage = function(event) {
				console.log(event)
				var messageBox = $("#websocketDiv").html();
				console.log(messageBox)
				$("#websocketDiv").html(messageBox + event.data + '<br/>');
			}
			
			ws.onclose = function(event) {
				
			}
		}
		
		function send() {
			var message = $('#message').val();
			ws.send(message);
		}
		
		$(function() {
			// 页面加载时连接websocket
			openWebSocket();
			console.log(ws);
		})
	</script>
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
		<h3>Fight Landload</h3>
		<h4><a href="landlord/table">>>>Table 1</a></h4>
	</div>
	<div id="websocketDiv">
		消息列表<br />
	</div>
	<input type="text" id="message"></input>
	<button onclick="send()">发送</button>
</body>
</html>