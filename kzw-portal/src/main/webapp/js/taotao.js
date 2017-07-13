var TT = TAOTAO = {
	checkLogin : function(){
		var _ticket = $.cookie("KZW_TOKEN");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://localhost:8083/sso/user/token/" + _ticket,
			dataType : "jsonp",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					var username = data.data.username;
					//<a href=\"http://localhost:8080/user/logout.html\" class=\"link-logout\">[退出]</a>
					//var html = username + "，欢迎来到开张网！";
					var html = username + ", 欢迎来到开张网！<a href=\"http://localhost:8080/logout.html\" class=\"link-logout\">[退出]</a>";
					$("#loginbar").html(html);
				}
			}
		});
	},
	checkStore : function(){
		var kzw_token = $.cookie("KZW_TOKEN");
		if(!kzw_token) {
			return ;
		}
		$.ajax({
			url : "http://localhost:8080/store/checkStore.action?token=" + kzw_token,
			dataType : "json",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					//var html = "<s></s><a href='http://localhost:8088/?token=" + kzw_token + "' rel='nofollow' target='_Blank'>[店铺管理]</a>";
					var html = "<s></s><a href='http://localhost:8088' rel='nofollow' target='_Blank'>[店铺管理]</a>";
					$("#myStores").html(html);
				}else {
					var html = "<s></s><a href='http://localhost:8080/store/register.action' rel='nofollow' target='_Blank'>我要开店</a>";
					$("#myStores").html(html);
				}
			}
		});
	}
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	TT.checkLogin();
	// 查看用户是否开店
	TT.checkStore();
});