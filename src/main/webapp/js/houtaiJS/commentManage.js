﻿//定义全局url 用于修改与添加操作
var url;

//省略其他代码  让url声明在第一行

/**
 * 格式化博客获取其文章标题
 * @param val
 * @param row
 * @returns {string}
 */
function formatBlog(val,row) {
	return val.title;
}

/**
 * 按照title查询评论
 */
function searchComment() {

	$("#dg").datagrid("load", {
		"title": $("#s_title").val()
	});
}

/**
 * 按照评论内容查询评论
 */
function searchContent() {
	$("#dg").datagrid("load", {
		"content": $("#s_title").val()
	});
}

/**
 * 删除评论
 * 可以多选
 */
function deleteComment() {

	//获取选中要删除的行
	var selectedRows = $("#dg").datagrid("getSelections");
	//判断是否有选择的行
	if (selectedRows.length == 0) {
		$.messager.alert("系统提示", "请选择要删除的数据");
		return;
	}
	//定义选中 选中id数组
	var idsStr = [];
	//循环遍历将选中行的id push进入数组
	for (var i = 0; i < selectedRows.length; i++) {
		idsStr.push(selectedRows[i].id);
	}
	//将数组安装,连接成字符串
	var ids = idsStr.join(","); //1,2,3,4
	//提示是否确认删除
	$.messager.confirm("系统提示", "<font color=red>您确定要删除选中的" + selectedRows.length + "条数据么？</font>", function(r) {
		//确定删除
		if (r) {
			//发送ajax请求
			$.post("../comment/delete", {
				ids: ids
			}, function(result) {
				if (result.success) {
					$.messager.alert("系统提示", "数据删除成功！");
					$("#dg").datagrid("reload");
				} else {
					$.messager.alert("系统提示", "数据删除失败！");
				}
			}, "json");
		}
	});
}
/**
 * 重新载入数据
 */
function reload() {
	$("#dg").datagrid("reload");
}

/*关闭对话框*/

function closeBlogTypeDialog() {
	$("typeName").val(""); //保存成功后将内容置空
	$("typeNum").val("");
	$("#dlg").dialog("close"); //关闭对话框
}


/**
 * 添加或者修改评论
 */
function saveBlogType() {
	$("#fm").form("submit", {
		url : url,
		onSubmit : function() {
			return $(this).form("validate");
		}, //进行验证，通过才让提交
		success : function(result) {
			var result = eval("(" + result + ")"); //将json格式的result转换成js对象
			if (result.success) {
				$.messager.alert("系统提示", "博客保存成功");
				$("content").val(""); //保存成功后将内容置空
				$("title").val("");
				$("#dlg").dialog("close"); //关闭对话框
				$("#dg").datagrid("reload"); //刷新一下
			} else {
				$.messager.alert("系统提示", "博客保存失败");
				return;
			}
		}
	});
}