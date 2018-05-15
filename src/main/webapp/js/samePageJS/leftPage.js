$(function() {
	changeColor(2);
});
// 动态改变颜色
function changeColor(type) {
	type = parseInt(type);
	setTimeout(function() {
		if (type == 1) {
			$("#advertColor").attr("style", "color:" + getRandomColor() + ";font-weight: bold;");
			$("#advertColor").text("个人资料");
			changeColor(2);
		} else if (type == 2) {
			$("#advertColor").attr("style", "color:" + getRandomColor() + ";font-weight: bold;");
			$("#advertColor").text("个人资料");
			changeColor(3);
		} else if (type == 3) {
			$("#advertColor").attr("style", "color:" + getRandomColor() + ";font-weight: bold;");
			$("#advertColor").text("个人资料");
			changeColor(4);
		} else if (type == 4) {
			$("#advertColor").attr("style", "color:" + getRandomColor() + ";font-weight: bold;");
			$("#advertColor").text("个人资料");
			changeColor(5);
		} else if (type == 5) {
			$("#advertColor").attr("style", "color:" + getRandomColor() + ";font-weight: bold;");
			$("#advertColor").text("个人资料");
			changeColor(1);
		}
	}, 200);
}
// 随机颜色
function getRandomColor() {
	var c = '#';
	var cArray = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
		'B', 'C', 'D', 'E', 'F'
	];
	for (var i = 0; i < 6; i++) {
		var cIndex = Math.round(Math.random() * 15);
		c += cArray[cIndex];
	}
	return c;
}