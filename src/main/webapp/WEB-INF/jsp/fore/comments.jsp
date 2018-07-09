<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>评论页面</title>
<%@ include file="../samePage/headInclude.jsp"%>
<!--加载评论div的css-->
<link rel="stylesheet" href="${blog}/css/comments.css" />
<!--分页-->
<link rel="stylesheet" href="${blog}/css/pager.css" />
<script src="${blog}/js/pager.js">  </script>
</head>

<body>

	<div class="head">
		<%@include file="../samePage/head.jsp"%>
	</div>

	<div class="content">
		<!--<div class="content_title">
				
			</div>-->
		<div class="main_contnet ">
			<div class="left_content pull_left">
				<%@include file="../samePage/leftPage.jsp"%>
			</div>
			<div class="right_content">

				<div id="comment-jump" class="comments">
					<div id="comments" class="clearfix">
						<h3 id="comments-title">0条评论</h3>
						<div id="loading-comments" class="hide">
							<span><i class="fa fa-spinner fa-pulse"></i> Loading...</span>
						</div>
						<ul class="commentlist comdot" id="commentTarget">
							<!-- <li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img/" src="img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite>
										</div>
										<div class="comment-text">
											<p>code life博客来访。。。</p>
										</div>
										<div class="comment-info clearfix">
											<span class="comment-date"> <a class="comment-time"
												href="javascript:void(0)">2018-05-09 00:06:56</a>
											</span> <span class="comment-edit"></span>
										</div>
									</div>
								</div>
							</li>

							<li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img/" src="img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite>
										</div>
										<div class="comment-text">
											<p>code life博客来访。。。</p>
										</div>
										<div class="comment-info clearfix">
											<span class="comment-date"> <a class="comment-time"
												href="javascript:void(0)">2018-05-09 00:06:56</a>
											</span> <span class="comment-edit"></span>
										</div>
									</div>
								</div>
							</li>
							<li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img/" src="img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite>
										</div>
										<div class="comment-text">
											<p>code life博客来访。。。</p>
										</div>
										<div class="comment-info clearfix">
											<span class="comment-date"> <a class="comment-time"
												href="javascript:void(0)">2018-05-09 00:06:56</a>
											</span> <span class="comment-edit"></span>
										</div>
									</div>
								</div>
							</li>
							<li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img/" src="img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite>
										</div>
										<div class="comment-text">
											<p>code life博客来访。。。</p>
										</div>
										<div class="comment-info clearfix">
											<span class="comment-date"> <a class="comment-time"
												href="javascript:void(0)">2018-05-09 00:06:56</a>
											</span> <span class="comment-edit"></span>
										</div>
									</div>
								</div>
							</li>
							<li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img/" src="img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite>
										</div>
										<div class="comment-text">
											<p>code life博客来访。。。</p>
										</div>
										<div class="comment-info clearfix">
											<span class="comment-date"> <a class="comment-time"
												href="javascript:void(0)">2018-05-09 00:06:56</a>
											</span> <span class="comment-edit"></span>
										</div>
									</div>
								</div>
							</li>
 -->
						</ul>

						<div>
							<ul class="pagination" id="page1">
							</ul>
						</div>
						<br> <br>
						<div id="respond" class="comment-respond">
							<h3 id="reply-title" class="comment-reply-title">
								发表评论 <small><div id="cancel-comment-reply-link"
										style="display: none;">
										<i class="icon-remove-sign"></i>
									</div></small>
							</h3>
							<form method="post" id="commentform" class="comment-form">
								<p class="comment-notes">
									<span id="email-notes">电子邮件地址不会被公开。</span> 必填项已用<span
										class="required">*</span>标注
								</p>
								<p class="comment-form-author">
									<label for="author">姓名 <span class="required">*</span></label>
									<input id="author" name="author" 
										placeholder="请输入您的名字!" size="30" maxlength="10"
										aria-required="true" required="required" type="text">
								</p>
								<p class="comment-form-email">
									<label for="email">电子邮件 <span class="required">*</span></label>
									<input id="email" name="email" 
										placeholder="博主回复你会通知到此邮箱!" size="30" maxlength="30"
										aria-describedby="email-notes" aria-required="true"
										required="required" type="text">
								</p>
							<br>
							<br>		
								<p class="comment-form-comment">
									<label for="comment">评论</label>
									<textarea id="comment" name="comment" cols="45" rows="8"
										maxlength="65525" aria-required="true"
										placeholder="上述电子邮件地址不会被公开,只作为博主回复联系方式!" required="required"></textarea>
								</p>
								<p class="form-submit">
									<input name="submit" onclick="saveComment()" id="submit"
										class="submit" value="发表评论" type="button">
								</p>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div style="clear: both;"></div>
		<input type="hidden" value="${id} " id="blogID"/>
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
	var blogid = $("#blogID").val();
	console.log("blogid:"+blogid);
	$(function(){
		//设置默认第1页
    	BlogPager(1);
	});
	
	function BlogPager(n){
		$.ajax({
			url:ctx+'/comment/listComment',
			data:{'rows':5,'page':n,'blogid':blogid},
			success:function(result){ 
				var obj = JSON.parse(result);
				commentList = obj.rows;
				number = obj.total;
				$("#comments-title").val(number+"条评论");
				
				var str = "";
				for(var i=0;i<commentList.length;i++){
					//截取博客内容前155字符 作为博客简介
				 	var summary = commentList[i].content.substr(0, 155);
					console.log("id:"+commentList[i].id);
					str += "<li class='comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix' id='li-comment-'"+commentList[i].id+">";
						
						str+="<div class='comment-block' id='comment-'"+commentList[i].id+">"
							+"<div class='author-img'>"
							+"<img class='lazy' data-original='img/' src='${blog}/img/huaban.png' width='100' height='100'></div>"
							+"<div class='comment-body clearfix'>"
							+"<div class='comment-name'>"
							+"<span class='arrow left'></span>"
							+"<cite class='fn'>"+commentList[i].name+"</cite></div>"
							+"<div class='comment-text'>"
							+"<p>"+commentList[i].content+"</p></div>"
							+"<div class='comment-info clearfix'>"
							+"<span class='comment-date'>"
							+"<a class='comment-time' href='javascript:void(0)'>"+commentList[i].createDate+"</a>"
							+"</span><span class='comment-edit'></span></div>"
							+"</div</div></li>"
					$("#commentTarget").html(str);
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
	
	
	//发表评论
	function saveComment(){
		var name = $("#author").val();
		var email = $("#email").val();
		var content = $("#comment").val();
		var reg = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+[\.][a-zA-Z0-9_-]+$";
		
		if (name == null || name == '') {
	 		alert("请输入名字！");
	 	} else if (email == null || email == '') {
	 		alert("请输入email");
	 	}else if (email.match(reg)== null) {
	 		alert("email输入格式不正确");
	 	}else if (content == null || content == '') {
	 		alert( "请输入评论内容！");
	 	} else {
			$.ajax({
				url:ctx+'/comment/save',
				data:{'blog.id':blogid,'name':name,'email':email,'content':content},
				success:function(result){ 
					var obj = eval('(' + result + ')');
					if (obj.success) {
						alert("评论成功");
						$("#author").val("");
						$("#email").val("");
						$("#comment").val("");
					} else {
						alert("评论成败");
						return;
					}
				}
			});
	 	}
	}
	</script>
</body>

</html>