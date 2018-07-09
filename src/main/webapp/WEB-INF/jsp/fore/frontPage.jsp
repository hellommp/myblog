<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>前台首页</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="blog" />

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
				<div id="articles" style="margin: 0 auto; width: auto;height: 1380px;">
				</div>
				
				<div id ="page" style="margin: 10px auto; text-align: center;">
					<ul class="pagination" id="page1">
					</ul>
				</div>
				
			</div>
			<div style="clear: both;"></div>
		</div>
	</div>

	<div class="foot">
		<%@include file="../samePage/foot.jsp"%>
	</div>

	<script type="text/javascript">
	var ctx = "${pageContext.request.contextPath }";
	var blogList = null;
	var number = null; 
	var n = null;
	$(function(){
		//设置默认第1页
    	BlogPager(1);
	});
	
	function BlogPager(n){
		$.ajax({
			url:ctx+'/blog/blogList',
			data:{'rows':5,'page':n},
			success:function(result){ 
				var obj = JSON.parse(result);
				blogList = obj.rows;
				number = obj.number;
				var str = "";
				for(var i=0;i<blogList.length;i++){
					//截取博客内容前155字符 作为博客简介
				 	var summary = blogList[i].content.substr(0, 155);
					console.log("id:"+blogList[i].id);
					str += "<article id='article_"+blogList[i].id+"' class='articles'>";
						if(i==0){
							str +="<div class='stick'></div>";
						}
							str+="<h4 class='entry-title'>"
							+"<a style='color: black; font-weight: bold;'"
							+"href='${blog}/blog/blogDetail?id="+blogList[i].id+"'"
							+" title='点击阅读全文'>"+blogList[i].title+"</a></h4>"
							+"<div class='entry-content'><a href='#'>"+summary+"</a></div>"
							+"<div class='entry-foot'><div class='pull_left'><div class='pull_left'>"
							+"<span class='glyphicon glyphicon-time'></span> <a href='#'>"+blogList[i].publishDate+"</a></div>"
							+"<div class='pull_left'><span class='glyphicon glyphicon-bookmark'></span> <a href='#'>H&T</a></div>"
							+"<div class='pull_left'><span class='glyphicon glyphicon-tags'></span> <a href='#'class='keyword'><span>"
							+blogList[i].keyWord+"</span></a></div></div>"
							+"<div class='pull_right'><div class='browser pull_left'>"
							+"<span class='glyphicon glyphicon-eye-open'></span>"
							+"<span class='browser_number'>12</span> </div>"
							+"<div class='comment pull_left' onclick='commentFunc("+blogList[i].id+")'><span class='glyphicon glyphicon-comment'></span>"
							+"<span class='comment_number'>1</span></div>"
							+"<div class='praise pull_left'><span class='glyphicon glyphicon-heart-empty'></span>"
							+"<span class='praise_number'>1</span></div></div>"
							+"<div style='clear: both;'></div>";
					$("#articles").html(str);
					console.log(blogList[i].keyWord);

				}
				Page({
					num : number, //页码数（总共有几页）
					startnum : n, //指定页码（默认当前选中第几页）
					elem : $('#page1'), //指定的元素
					callback : function(n){
						n = n;
						BlogPager(n);
					}
			 	});
				if (result.success) {
					console.log("成功");
				} else {
					console.log("失败");
					return;
				}
				
		 }}); 
	}
	function commentFunc(id){
		window.open(ctx+"/comment/tempComment?id="+id);
		//用异步提交的方式无法进行页面跳转
		
		/* $.ajax({
			url:ctx+'/comment/tempComment',
			data:{'id':id},
			success:function(result){ 
				console.log("成功");
			}
		}); */
	}
	</script>
	<!--<div style="position:absolute;top: 0; height:1700px; width:100%;z-index: -999;"></div>-->
</body>
</html>
