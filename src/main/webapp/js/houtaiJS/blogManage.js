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
	console.log(row.category.name);
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