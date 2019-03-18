$(function() {
	$.ajax({
		type: 'POST',
		url: 'game/queryGameList',
		success: function(data) {
			for(var i = 0; i < data.length; i++) {
				$('#gameList').append('<li><a href="table/home?id=' + data[i].id + '">' + data[i].gameName + '</a></li>');
			}
		}
	})
})