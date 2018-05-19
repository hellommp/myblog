<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>友情链接</title>
<%@ include file="headInclude.jsp"%>
<script type="text/javascript" src="js/friendshipLink.js"></script>

<!--加载自己的css-->
<link rel="stylesheet" href="css/friendshipLink.css" />
</head>
<body>
	<div class="head">
		<%@include file="../samePage/head.jsp"%>
	</div>

	<div class="content">

		<div class="main_contnet">
			<div class="left_content pull_left">
				<%@include file="../samePage/leftPage.jsp"%>
			</div>
			<div class="right_content">
				<div id="link" class=" articles">
					<h4 class="entry-title">
						<a style="color: black; font-weight: bold;" href="#" title="java">友情链接</a>
					</h4>
					<ul class="entry-content">
						<li><a href="#">1yangqing</a></li>
						<li><a href="#">2ayukong</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">6</a></li>

					</ul>
				</div>
			</div>
			<div style="clear: both;"></div>
		</div>
	</div>
	<div class="foot">
		<%@include file="../samePage/foot.jsp"%>
	</div>
</body>
</html>