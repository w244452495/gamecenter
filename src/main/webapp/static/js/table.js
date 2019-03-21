$(function() {
	// 页面加载时连接websocket
	openWebSocket();
	
	// 获取所有桌子列表
	$.ajax({
		type: 'POST',
		url: 'table/queryTableListByGameId',
		data: {
			'gameId': $('#page_id').val().trim()
		},
		success: function(data) {
			// 1.根据最大座位数渲染座位
			var maxSiteNum = $('#max_site_num').val();
			if (3 == maxSiteNum) {
				loadThreeUsersTable(data);
			} else if (4 == maxSiteNum) {
				// loadFourUsersTable(data);
			}
			// 2.渲染当前桌子状态和用户座位状态
			loadTableStatusAndSiteUser();
			/*for(var i = 0; i < data.length; i++) {
				$('#tableUrlList').append("<h4><a href=\"javascript:void(0);\" onclick=\"openTablePage('" + data[i].tableUrl + "')\">>>> Table " + data[i].id + " <span id=\"currentSiteUser\">( " + data[i].currentSiteNum + " / " + data[i].maxSiteNum + " )</span></a></h4>");
			}*/
		},
		fail: function(data) {
			alert('页面加载失败，请稍后重试！！！');
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
	} else {
		ws = new SockJs('http://localhost/gamecenter/gamecenter/sockjs/gameCenterWebSocket/info?type=' + type + '&id=' + id);
	}
	
	ws.open = function() {
		
	}
	
	ws.onmessage = function(event) {
		var messageBox = $("#websocketDiv").html();
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