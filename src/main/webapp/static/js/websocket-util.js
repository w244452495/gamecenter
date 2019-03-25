function loadThreeUsersTable(data) {
	var gameId = $('#page_id').val();

	var tableHTML = "";
	for(var i = 0; i < data.length; i++) {
		tableHTML += "<table align=\"center\" id=\"table-" + i + "\" class=\"col-xs-6 col-sm-4 col-md-3 col-lg-2 table-3users\"><tr>";
		tableHTML += "<td><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "00\" class=\"site-nobody\"><button class=\"btn btn-info\" onclick=\"openTablePage('" + data[i].tableUrl + "', 'SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "00')\">进入</div></td>";
		tableHTML += "<td align=\"center\"><div id=\"" + data[i].tableHtmlId + "\" class=\"table-three-users table-close\"></td>";
		tableHTML += "<td><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "02\" class=\"site-nobody\"><button class=\"btn btn-info\" onclick=\"openTablePage('" + data[i].tableUrl + "', 'SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "02')\">进入</div></div></td></tr>"; 
		tableHTML += "<tr><td></td>";
		tableHTML += "<td align=\"center\"><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "01\" class=\"site-nobody\"><button class=\"btn btn-info\" onclick=\"openTablePage('" + data[i].tableUrl + "', 'SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "01')\">进入</div></div></td>";
		tableHTML += "<td></td></tr></table>";
		$('#tableUrlList').append(tableHTML);
		tableHTML = "";
	}
}

// 渲染当前桌子状态和用户座位状态
function loadTableStatusAndSiteUser() {
	$.ajax({
		type: 'POST',
		url: 'table/queryForLoadTableStatusAndSiteUser',
		data: {
			'gameId': $('#page_id').val().trim()
		},
		success: function(data) {
			loadTableStatus(data.table);
			loadSiteUser(data.site);
		},
		fail: function(data) {
			alert('页面加载失败，请稍后重试！！！');
		}
	})
}

// 渲染当前桌子状态
function loadTableStatus(tables) {
	for(var i = 0; i < tables.length; i++) {
		$('#' + tables[i].tableHtmlId).removeClass('table-close');
		$('#' + tables[i].tableHtmlId).addClass('table-open');
	}
}

//渲染当前用户座位状态
function loadSiteUser(sites) {
	for(var i = 0; i < sites.length; i++) {
		$('#' + sites[i].siteHtmlId).empty();
		var nickname = sites[i].nickname.length > 4 ? sites[i].nickname.substr(0,3) + '...' : sites[i].nickname;
		console.log(nickname);
		if(0 == sites[i].gameStatus) {
			$('#' + sites[i].siteHtmlId).append("<p>" + nickname + "</p>");
		} else {
			$('#' + sites[i].siteHtmlId).append("<p>" + nickname + "<span> ♠ </span></p>");
		}
	}
}

function send() {
	var message = $('#message').val();
	ws.send(message);
}

function openTablePage(data, siteId) {
	debugger;
	var url = data + "?siteId=" + siteId
	var b="width=960,height=540,left=100,top=50,resizable=yes,scrollbars=yes,menubar=no,copyhistory=no,toolbar=no,location=no,directories=no,status=no";
	window.open(url,'_blank',b);
}

//1位ID补0转换成两位
function formatIdTwoDigit(number) {
	return number < 10 ? '0' + number : number;
}