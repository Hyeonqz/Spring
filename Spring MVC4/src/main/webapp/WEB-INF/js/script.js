

$(function() {
	$("#myimg").attr("src","../image/q9.JPG");
	
	$("#myimg").hover(function() {
		$(this).attr("src","../image/q9.JPG");
	},
	function() {
		$(this).attr("src","../image/b8.png");
	});
	
});
