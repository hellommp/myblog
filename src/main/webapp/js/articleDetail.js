$(function(){
	
	/*加载相同页面*/
	$(".head").append('<embed type="text/html" src="samePage/head.html"  style="width: 100%;height: 80px;"></embed>')
	$(".left_content").load("samePage/leftPage.html");
	$(".foot").load("samePage/foot.html");
});