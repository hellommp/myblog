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
	<div id="dlg" class="easyui-dialog"
		style="width: 500px; height: 180px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post">
			<table cellspacing="8px">
				<tr>
					<td>博客类别名称</td>
					<td><input type="text" id="typeName" name="typeName"
						class="easyui-validatebox" required="true"></td>
				</tr>
				<tr>
					<td>博客类别排序</td>
					<td><input type="text" id="orderNum" name="orderNum"
						class="easyui-numberbox" required="true" style="width: 60px">&nbsp;(博客类别会根据序号从小到大排列)
					</td>
				</tr>
			</table>
		</form>
	</div>

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