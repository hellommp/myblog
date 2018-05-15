$(function() {
	
	/*注册验证*/

	$("tbody tr input.required").each(function(){
		var $required = "<td class='remind onError'>*</td>";
		var $parent = $(this).parent().parent();
		$parent.append($required);
	});
	/*账号验证*/
	
	$("tbody tr input").blur(function() {
		var $parent = $(this).parent().parent();
		$parent.find(".remind").remove();
		
		//验证用户
		if ($(this).is("#account")) {
			/*console.log(!isEmailAvailable($(this)) );
			 !isPoneAvailable($(this)) ||*/
			if (!isEmailAvailable($(this))) {
				var errorMsg = "请输入正确的账号";
				$parent.append('<td class="remind onError">' + errorMsg + '</td>');
			} else {
				var OKMsg = "正确";
				$parent.append("<td class='remind onOk'>" + OKMsg + "</td>");
			}
		}

		//验证密码
		if ($(this).is("#password")) {
			if ($(this).val() == "" || $(this).val().length < 6) {
				var errorMsg = "密码不能小于六位数";
				$parent.append("<td class='remind onError'>" + errorMsg + "</td>");
			} else {
				var OKMsg = "正确";
				$parent.append("<td class='remind onOk'>" + OKMsg + "</td>");
			}
		}

		//验证确认密码
		if ($(this).is("#querenmima")) {
			var mima = $parent.parent().parent().find("#password").val();
			if ($(this).val() != mima) {
				var errorMsg = "两次密码不相等";
				$parent.append("<td class='remind onError'>" + errorMsg + "</td>");
			} else {
				var OKMsg = "正确";
				$parent.append("<td class='remind onOk'>" + OKMsg + "</td>");
			}
		}

	}).keyup(function() {
		$(this).triggerHandler("blur");
	}).focus(function() {
		$(this).triggerHandler("blur");
	});
});

/*function isPoneAvailable($poneInput) {

	var myreg = /^[1][3,4,5,7,8][0-9]{9}$/; //手机号验证正则表达式
	if (!myreg.test($poneInput.val()) && ($poneInput.val() == "")) {
		return false;
	} else {
		return true;
	}
}*/

function isEmailAvailable($emaliInput) {
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //邮箱正则表达式
	/**/
	
	if (!reg.test($emaliInput.val()) ) {
		return false;
	} else {
		return true;
	}

}