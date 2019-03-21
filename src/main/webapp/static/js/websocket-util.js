function loadThreeUsersTable(data) {
	var gameId = $('#page_id').val();

	var tableHTML = "";
	for(var i = 0; i < data.length; i++) {
		tableHTML += "<table id=\"table-" + i + "\" class=\"col-xs-6 col-sm-4 col-md-3 col-lg-2\"><tr>";
		tableHTML += "<td><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "00\" class=\"site-nobody\"><button class=\"btn btn-info\">进入</div></td>";
		tableHTML += "<td><div id=\"" + data[i].tableHtmlId + "\" class=\"table-three-users table-close\"></td>";
		tableHTML += "<td><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "02\" class=\"site-nobody\"><button class=\"btn btn-info\">进入</div></div></td></tr>"; 
		tableHTML += "<tr><td></td>";
		tableHTML += "<td><div id=\"SITE_" + formatIdTwoDigit(gameId) + formatIdTwoDigit(i + 1) + "01\" class=\"site-nobody\"><button class=\"btn btn-info\">进入</div></div></td>";
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
			/*loadTableStatus(data.table);
			loadSiteUser(data.site);*/
		},
		fail: function(data) {
			alert('页面加载失败，请稍后重试！！！');
		}
	})
}

// 渲染当前桌子状态
function loadTableStatus(tables) {
	for(var i = 0; i < tables.length; i++) {
		
	}
}

// 用户座位状态
function loadSiteUser(sites) {
	for(var i = 0; i < sites.length; i++) {
		
	}
}

// 1位ID补0转换成两位
function formatIdTwoDigit(number) {
	return number < 10 ? '0' + number : number;
}