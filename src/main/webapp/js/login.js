$(function() {
	/*登录验证*/

	/*账号验证*/
	
	$(".loginDiv input").blur(function() {
		
		var $parent = $(this).parent().parent();
		$parent.find(".remind").remove();
		
		//验证用户名
		if ($(this).is("#account")) {
			if (!isEmailAvailable($(this))){
				var errorMsg = "请输入正确的账号";
				$parent.append("<span class='remind onError'>"+errorMsg+"</span>");
			}else{
				var OKMsg = "正确";
				$parent.append("<span class='remind onOk'>"+OKMsg+"</span>");
			}
		}
		
		//验证密码
		if ($(this).is("#password")) {
			if ($(this).val() == "" || $(this).val().length < 6) {
				var errorMsg = "密码不能小于六位数";
				$parent.append("<span class='remind onError'>" + errorMsg + "</span>");
			} else {
				var OKMsg = "正确";
				$parent.append("<span class='remind onOk'>" + OKMsg + "</span>");
			}
		}
		
	}).keyup(function(){
		$(this).triggerHandler("blur");
	}).focus(function(){
		$(this).triggerHandler("blur");
	});
});

/*function isPoneAvailable($poneInput) {
	
	var myreg = /^[1][3,4,5,7,8][0-9]{9}$/;//手机号验证正则表达式
	if (!myreg.test($poneInput.val())&& $poneInput.val()=="") {
		return false;
	} else {
		return true;
	}
}*/

function isEmailAvailable($emaliInput){
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //邮箱正则表达式
	if (!reg.test($emaliInput.val())|| $emaliInput.val()=="") {
		return false;
	} else {
		return true;
	}

}
