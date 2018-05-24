
//定义全局url 用于修改与添加操作
var url;

//省略其他代码  让url声明在第一行


/**
 * 格式化博客类型获取其类型名称
 * @param val
 * @param row
 * @returns {string}
 */
function formatBlogType(val,row) {
	return val.name;
}

/**
 * 按照title查询博客信息
 */
function searchBlog() {
	$("#dg").datagrid("load", {
		"title": $("#s_title").val()
	});
}

/**
 * 删除博客信息
 * 可以多选
 */
function deleteBlog() {
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
			$.post("../blog/delete", {
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
 *打开修改博客界面
 */
function openBlogModifyTab() {
	var ue = UE.getEditor('editor');
	//获取选中要修改的行
	var selectedRows = $("#dg").datagrid("getSelections");
	//确保被选中行只能为一行
	if (selectedRows.length != 1) {
		$.messager.alert("系统提示", "请选择一个要修改的博客");
		return;
	}
	//获取选中行id
	var row = selectedRows[0];
	//打开对话框并且设置标题
	$("#dlg").dialog("open").dialog("setTitle", "修改博客信息");
	//将数组回显对话框中
	$("#fm").form("load", row); //会自动识别name属性，将row中对应的数据，填充到form表单对应的name属性中
	
	//根据已知的类型值让下拉框进行选中
	$("#category option[value='"+row.category.name+"']").attr("selected","selected");
    ue.ready(function() {//编辑器初始化完成再赋值  
        ue.setContent(row.content);  //赋值给UEditor  
    });  
	//在url中添加id 后台就能识别是更新操作
	url = "../blog/save?id=" + row.id;
}
/**
 * 重新载入数据
 */
function reload() {
	$("#dg").datagrid("reload");
}

/*关闭对话框*/

function closeBlogTypeDialog() {
	$("content").val(""); //保存成功后将内容置空
	$("title").val("");
	$("keyWord").val(""); 
	$("category").val("");
	$("#dlg").dialog("close"); //关闭对话框
}


/**
 * 添加或者修改博客信息
 */
function saveBlogType() {
	//获取博客标题
 	var title =  $("#fm").find("#title").val();
 	//获取博客类别id
 	var categoryId =  $("#fm").find("#category").combobox("getValue");
 	//获取博客内容 带标记
 	var content =UE.getEditor('editor').getContent();
 	/*//截取博客前155字符 作为博客简介
 	var summary = UE.getEditor('editor').getContentTxt().substr(0, 155);*/
 	//博客关键词
 	var keyWord = $("#fm").find("#keyWord").val();
 	
 	if (title == null || title == '') {
 		$.messager.alert("系统提示", "请输入标题！");
 	} else if (categoryId == null || categoryId == '') {
 		$.messager.alert("系统提示", "请选择博客类型！");
 	} else if (content == null || content == '') {
 		$.messager.alert("系统提示", "请编辑博客内容！");
 	} else {
 		//ajax请求 请求后台写博客接口
 		$.post(url, {
 			'title': title,
 			'category.id': categoryId,
 			'content': content,
 			/*'summary': summary,*/
 			'keyWord': keyWord,
 			/*'contentNoTag': contentNoTag*/
 		}, function(result) {
 			console.log("result:"+result);
			//此处data={"Success":true}实际为字符串，而不是json对象，需要用如下代码处理  
            var result = jQuery.parseJSON(result); 
 			if (result.success) {
				$.messager.alert("系统提示", "博客信息保存成功");
				$("content").val(""); //保存成功后将内容置空
				$("title").val("");
				$("keyword").val(""); 
				$("category").val("");
				$("#dlg").dialog("close"); //关闭对话框
				$("#dg").datagrid("reload"); //刷新一下
			} else {
				$.messager.alert("系统提示", "博客信息保存失败");
				return;
			}
 		}, "json");
 	}
	/*$("#fm").form("submit", {
		url : url,
		onSubmit : function() {
			return $(this).form("validate");
		}, //进行验证，通过才让提交
		
		//注意ajax的url的后台action方法必须有返回值return "json"，而不是return null,否则下面的回调函数不起作用，sucess方法失效  
		success : function(result) {
			console.log("result:"+result);
			//此处data={"Success":true}实际为字符串，而不是json对象，需要用如下代码处理  
            var result = jQuery.parseJSON(result);  
			
			var result = eval("(" + result + ")"); //将json格式的result转换成js对象
			if (result.success) {
				$.messager.alert("系统提示", "博客信息保存成功");
				$("content").val(""); //保存成功后将内容置空
				$("title").val("");
				$("keyword").val(""); 
				$("category").val("");
				$("#dlg").dialog("close"); //关闭对话框
				$("#dg").datagrid("reload"); //刷新一下
			} else {
				$.messager.alert("系统提示", "博客信息保存失败");
				return;
			}
		}
	});*/
}