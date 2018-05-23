$(function() {
	//datagrid初始化
	$('#dg').datagrid({
		
		//请求数据的url
<<<<<<< HEAD
		url: '../blog/listBlog',
=======
		url: '../category/category_list',
>>>>>>> 5d9269d45e8d30851c65e3cdfa5d2037a1e8118d
		//载入提示信息
		loadMsg: 'loading...',
		//水平自动展开，如果设置此属性，则不会有水平滚动条，演示冻结列时，该参数不要设置
		fitColumns: true,
		//数据多的时候不换行
		nowrap: true,
		//设置分页
		pagination: true,
		//设置每页显示的记录数，默认是10个
		pageSize: 5,
		//每页显示记录数项目
		pageList: [5, 10, 15, 20],
		//指定id为标识字段，在删除，更新的时候有用，如果配置此字段，在翻页时，换页不会影响选中的项
		idField: 'id',
		//上方工具条 添加 修改 删除 刷新按钮
		toolbar: [{
			iconCls: 'icon-add', //图标
			text: '添加', //名称
			handler: function() { //回调函数
				//打开对话框并且设置标题
				$("#dlg").dialog("open").dialog("setTitle", "添加博客类别信息");
				//将url设置为添加
				url = "../category/save";
			}
<<<<<<< HEAD
		}, '-', {
			iconCls: 'icon-edit',
			text: '修改',
			handler: function() {
				//获取选中要修改的行
				var selectedRows = $("#dg").datagrid("getSelections");
				//确保被选中行只能为一行
				if (selectedRows.length != 1) {
					$.messager.alert("系统提示", "请选择一个要修改的博客类别");
					return;
				}
				//获取选中行id
				var row = selectedRows[0];
				//打开对话框并且设置标题
				$("#dlg").dialog("open").dialog("setTitle", "修改博客类别信息");
				//将数组回显对话框中
				$("#fm").form("load", row); //会自动识别name属性，将row中对应的数据，填充到form表单对应的name属性中
				//在url中添加id 后台就能识别是更新操作
				url = "../category/save?id=" + row.id;
			}
		}, '-', {
=======
		},  '-', {
>>>>>>> 83e6201026c355765419f6146601b61860a33d5f
			iconCls: 'icon-edit',
			text: '删除',
			handler: function() {
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
					if (r) {
						$.post("../category/delete", {
							ids: ids
						}, function(result) {
							if (result.exist) {
								$.messager.alert("系统提示", '该类别下有博客，不能删除!');
							} else if (result.success) {
								$.messager.alert("系统提示", "数据删除成功！");
								$("#dg").datagrid("reload");
							} else {
								$.messager.alert("系统提示", "数据删除失败！");
							}
						}, "json");
					}
				});
			}
		}, '-', {
			iconCls: 'icon-reload',
			text: '刷新',
			handler: function() {
				/*刷新*/
				$("#dg").datagrid("reload");
			}
		}],
		//同列属性，但是这些列将会冻结在左侧,z大小不会改变，当宽度大于250时，会显示滚动条，但是冻结的列不在滚动条内
		frozenColumns: [
			[{
					field: 'checkbox',
					checkbox: true
				}, //复选框
				{
					field: 'id',
					title: '编号',
					width: 200
				} //id字段
			]
		],
		columns: [
			[{
<<<<<<< HEAD
					field: 'title',
					title: '博客分类名称',
					width: 300
				}, //typeName 字段
				{
					field: 'publishDate',
					title: '博客类别排序',
					width: 300
				}, //orderNum 字段
=======
					field: 'name',
					title: '博客分类名称',
					width: 300
				}, //typeName 字段
>>>>>>> 5d9269d45e8d30851c65e3cdfa5d2037a1e8118d
			]
		],
	});

	/*增删改查*/

	/*添加*/
	//将url改为如下：
	/*url = {
		iconCls: 'icon-add', //图标
		text: '添加', //名称
		handler: function() { //回调函数
			//打开对话框并且设置标题
			$("#dlg").dialog("open").dialog("setTitle", "添加博客类别信息");
			//将url设置为添加
			url = "${blog}/admin/blogType/save.do";
		}
	}*/

	/*修改用法如上*/
	/*url = {
		iconCls: 'icon-edit',
		text: '修改',
		handler: function() {
			//获取选中要修改的行
			var selectedRows = $("#dg").datagrid("getSelections");
			//确保被选中行只能为一行
			if (selectedRows.length != 1) {
				$.messager.alert("系统提示", "请选择一个要修改的博客类别");
				return;
			}
			//获取选中行id
			var row = selectedRows[0];
			//打开对话框并且设置标题
			$("#dlg").dialog("open").dialog("setTitle", "修改博客类别信息");
			//将数组回显对话框中
			$("#fm").form("load", row); //会自动识别name属性，将row中对应的数据，填充到form表单对应的name属性中
			//在url中添加id 后台就能识别是更新操作
			url = "${blog}/admin/blogType/save.do?id=" + row.id;
		}
	}*/

	/*删除*/
	/*url = {
		iconCls: 'icon-edit',
		text: '删除',
		handler: function() {
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
				if (r) {
					$.post("${blog}/admin/blogType/delete.do", {
						ids: ids
					}, function(result) {
						if (result.exist) {
							$.messager.alert("系统提示", '该类别下有博客，不能删除!');
						} else if (result.success) {
							$.messager.alert("系统提示", "数据删除成功！");
							$("#dg").datagrid("reload");
						} else {
							$.messager.alert("系统提示", "数据删除失败！");
						}
					}, "json");
				}
			});
		}
	}*/

});

/*关闭对话框*/

function closeBlogTypeDialog() {
	$("typeName").val(""); //保存成功后将内容置空
	$("typeNum").val("");
	$("#dlg").dialog("close"); //关闭对话框
}

//定义全局url 用于修改与添加操作
var url;

//省略其他代码  让url声明在第一行
/**
 * 添加或者修改博客类别
 */
function saveBlogType() {
	$("#fm").form("submit", {
		url: url,
		onSubmit: function() {
			return $(this).form("validate");
		}, //进行验证，通过才让提交
		success: function(result) {
			var result = eval("(" + result + ")"); //将json格式的result转换成js对象
			if (result.success) {
				$.messager.alert("系统提示", "博客类别保存成功");
				$("typeName").val(""); //保存成功后将内容置空
				$("typeNum").val("");
				$("#dlg").dialog("close"); //关闭对话框
				$("#dg").datagrid("reload"); //刷新一下
			} else {
				$.messager.alert("系统提示", "博客类别保存失败");
				return;
			}
		}
	});
}