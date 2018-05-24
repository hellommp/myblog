<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>前台首页</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="../samePage/headInclude.jsp"%>
<link rel="stylesheet" href="css/frontPage.css" />
<script type="text/javascript" src="js/frontPage.js"></script>


<!--分页-->
<link rel="stylesheet" href="css/pager.css" />
<script src="js/pager.js">
	
</script>
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

				<c:forEach items="${bloglist }" var="blog">
					<article id="article_1" class=" articles">
					<div class="stick"></div>
					<h4 class="entry-title">
						<a style="color: black; font-weight: bold;" href="#"
							title="点击阅读全文">【ssm个人博客项目实战01】SSM环境搭建</a>
					</h4>
					<div class="entry-content">
						<a href="#">【ssm个人博客项目实战01】SSM环境搭建1111111111</a>
					</div>
					<div class="entry-foot">
						<div class="pull_left">
							<div class="pull_left">
								<span class="glyphicon glyphicon-time"></span> <a href="#">2018-03-16
									11:34:01 </a>
							</div>
							<div class="pull_left">
								<span class="glyphicon glyphicon-bookmark"></span> <a href="#">梁钟霖
								</a>
							</div>
							<div class="pull_left">
								<span class="glyphicon glyphicon-tags"></span> <a href="#"
									class="keyword"> <span>ip</span> <span>mysql</span> <span>java教程</span>
									<span>xmanager</span> <span>java</span>
								</a>
							</div>
						</div>
						<div class="pull_right">
							<div class="browser pull_left">
								<span class="glyphicon glyphicon-eye-open"></span> <span
									class="browser_number">12</span>
							</div>
							<div class="comment pull_left">
								<span class="glyphicon glyphicon-comment"></span> <span
									class="comment_number">1</span>
							</div>
							<div class="praise pull_left">
								<span class="glyphicon glyphicon-heart-empty"></span> <span
									class="praise_number">1</span>
							</div>

						</div>
						<div style="clear: both;"></div>
					</div>
					</article>
				</c:forEach>

				<div>
					<ul class="pagination" id="page1">
					</ul>
				</div>
				<script>
					Page({
						num : 2, //页码数
						startnum : 1, //指定页码
						elem : $('#page1'), //指定的元素
						callback : function(n) { //回调函数
							console.log(n);
						}
					});
				</script>

			</div>
			<div style="clear: both;"></div>
		</div>
	</div>

	<div class="foot">
		<%@include file="../samePage/foot.jsp"%>
	</div>
	<!--<div style="position:absolute;top: 0; height:1700px; width:100%;z-index: -999;"></div>-->
</body>
</html>
