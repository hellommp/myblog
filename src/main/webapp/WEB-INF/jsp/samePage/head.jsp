<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>头部</title>
<!-- <link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/samePageCss/head.css" /> -->
</head>

<body>
	<div class="headPage">
		<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"> <img src="${blog}/img/huaban.png" />
				</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#example-navbar-collapse">
					<span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="example-navbar-collapse">
				<!--向左对齐-->
				<ul class="nav navbar-nav navbar-left">
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#">关于我们</a></li>
					<li><a href="#">留言板</a></li>
					<li><a href="#">友情链接</a></li>
				</ul>
				<!--向右对齐-->
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 换肤 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">春天</a></li>
							<li class="divider"></li>
							<li><a href="#">夏天</a></li>
							<li class="divider"></li>
							<li><a href="#">秋天</a></li>
							<li class="divider"></li>
							<li><a href="#">冬天</a></li>
						</ul></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							注册</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							登录</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li>
						<form class=" navbar-form navbar-right" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="请输入关键字">
							</div>
							<button type="submit" class="btn btn-default">搜索文章</button>
						</form>
					</li>
				</ul>
				
			</div>
		</div>
		</nav>
	</div>

</body>

</html>