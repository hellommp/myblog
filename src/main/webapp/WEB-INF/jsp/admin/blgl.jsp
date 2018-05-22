<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>博客类别管理</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath }" var="blog" />

<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/demo/demo.css">
<script type="text/javascript" src="${blog}/jquery-easyui-1.5.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${blog}/js/houtaiJS/blgl.js"></script>
</head>

<body>
	<table id="dg"></table>

	<div id="dlg-buttons">
		<div>
			<a href="javascript:saveBlogType()" class="easyui-linkbutton"
				iconCls="icon-ok" plain="true">保存</a> <a
				href="javascript:closeBlogTypeDialog()" class="easyui-linkbutton"
				iconCls="icon-cancel" plain="true">关闭</a>
		</div>
	</div>

	<div class="se-preview-section-delimiter"></div>

</body>
</html>