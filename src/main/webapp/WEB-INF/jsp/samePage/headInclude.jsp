
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath }" var="blog" />

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!--加载头部的css-->
<link rel="stylesheet" href="${blog} /css/samePageCss/head.css" />
<!--加载leftPage的css和js-->
<link rel="stylesheet" href="${blog}/css/samePageCss/leftPage.css" />
<script type="text/javascript" src="${blog}/js/samePageJS/leftPage.js"></script>
<!--加载底部的css-->
<link rel="stylesheet" href="${blog}/css/samePageCss/foot.css" />
<%-- <!--加载背景特效-->
<script type="text/javascript" class="autoinsert"
	src="${blog}/js/jquery-1.2.6.min.js"></script>
<script src="${blog}/js/snowfall.jquery.js"></script> --%>

