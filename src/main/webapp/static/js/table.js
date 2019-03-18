$(function() {
	// 页面加载时连接websocket
	openWebSocket();
	console.log(ws);
	// 获取所有桌子列表
	$.ajax({
		type: 'POST',
		url: 'table/queryTableListByGameId',
		data: {
			'gameId': $('#page_id').val().trim()
		},
		success: function(data) {
			for(var i = 0; i < data.length; i++) {
				$('#tableUrlList').append("<h4><a href=\"javascript:void(0);\" onclick=\"openTablePage('" + data[i].tableUrl + "')\">>>> Table " + data[i].id + " <span id=\"currentSiteUser\">( " + data[i].currentSiteNum + " / " + data[i].maxSiteNum + " )</span></a></h4>");
			}
		}
	})
})

var ws = null;
function openWebSocket() {
	// 类型，game->游戏主页面，table->桌子主页面
	var type = $('#page_type').val();
	// id，游戏，桌子id
	var id = $('#page_id').val();
	if('WebSocket' in window) {
		ws = new WebSocket('ws://localhost/gamecenter/gameCenterWebSocket.action?type=' + type + '&id=' + id);
		console.log('websocket已连接');
	} else {
		ws = new SockJs('http://localhost/gamecenter/gamecenter/sockjs/gameCenterWebSocket/info?type=' + type + '&id=' + id);
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

function openTablePage(data) {
	var b="width=960,height=540,left=100,top=50,resizable=yes,scrollbars=yes,menubar=no,copyhistory=no,toolbar=no,location=no,directories=no,status=no";
	window.open(data,'_blank',b);
}