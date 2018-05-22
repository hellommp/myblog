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
	
	//创建select框
/*	$('#category').combobox({
		url : '../category/category_list',
		valueField:'id',
		textField:'name'
	});*/
	//根据已知的类型值让下拉框进行选中
	console.log(row.category.name);
	$("#category option[value='"+row.category.name+"']").attr("selected","selected");
    ue.ready(function() {//编辑器初始化完成再赋值  
        ue.setContent(row.content);  //赋值给UEditor  
    });  
	//在url中添加id 后台就能识别是更新操作
	url = "${blog}/admin/blogType/save.do?id=" + row.id;
}
/**
 * 重新载入数据
 */
function reload() {
	$("#dg").datagrid("reload");
}