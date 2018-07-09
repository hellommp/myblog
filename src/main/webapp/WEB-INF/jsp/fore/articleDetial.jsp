<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>文章详情</title>

<%@ include file="../samePage/headInclude.jsp"%>
<!--加载评论div的css-->
<link rel="stylesheet" href="${blog}/css/comments.css" />
<script type="text/javascript" src="${blog}/js/articleDetail.js"></script>
<link rel="stylesheet" href="${blog}/css/frontPage.css" />
</head>

<body>

	<div class="head">
		<%@include file="../samePage/head.jsp"%>
	</div>

	<div class="content">
		
		<div class="main_contnet ">
			<div class="left_content pull_left">
				<%@include file="../samePage/leftPage.jsp"%>
			</div>
			<div class="right_content ">

				<article id="article_${Blog.id}" class=" articles">
				<div class="stick"></div>
				<h4 class="entry-title">
					<a style="color: black; font-weight: bold;" href="#" title="java">${Blog.title}</a>
				</h4>
				<div class="entry-content">
					<a href="#">${Blog.content}</a>
				</div>
				<div class="entry-foot">
					<div class="pull_left">
						<div class="pull_left">
							<span class="glyphicon glyphicon-time"></span> <a href="#">${Blog.publishDate} </a>
						</div>
						<div class="pull_left">
							<span class="glyphicon glyphicon-bookmark"></span> <a href="#">H&T
							</a>
						</div>
						<div class="pull_left">
							<span class="glyphicon glyphicon-tags"></span> <a href="#"
								class="keyword"> 
								${Blog.keyWord}
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


				<div id="comment-jump" class="comments">
					<div id="comments" class="clearfix">
						<h3 id="comments-title">0条评论</h3>
						<div id="loading-comments" class="hide">
							<span><i class="fa fa-spinner fa-pulse"></i> Loading...</span>
						</div>
						<ul class="commentlist comdot" id="commentTarget">
							<li
								class="comment byuser comment-author-zhw2590582 bypostauthor even thread-even depth-1 clearfix"
								id="li-comment-22">
								<div class="comment-block" id="comment-22">
									<div class="author-img">
										<img class="lazy" data-original="img" src="${blog}/img/huaban.png"
											width="100" height="100">
									</div>
									<div class="comment-body clearfix">
										<div class="comment-name">
											<span class="arrow left"></span> <cite class="fn">code
												life</cite><span class="fr">116L</span>
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

						</ul>
						<br> <br>
						<div class="showAll">
							<input type="button" value="显示全部评论"/>
						</div>
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
									<input id="author" name="author" value=""
										placeholder="请输入您的名字!" size="30" maxlength="10"
										aria-required="true" required="required" type="text">
								</p>
								<p class="comment-form-email">
									<label for="email">电子邮件 <span class="required">*</span></label>
									<input id="email" name="email" value=""
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
	</div>
	</div>

	<div class="foot">
		<%@include file="../samePage/foot.jsp"%>
	</div>
</body>

</html>