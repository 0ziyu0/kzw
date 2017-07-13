<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<script type="text/javascript" src="/jquery.min.js"></script>
<script type="text/javascript" src="/jquery.easyui.min.js"></script>
</head>
<body style="background-color: #F3F3F3">
	
	<form action="/login" method="post">
		用户名: <input name="userName" style="width:200px;height:32px" value="zhanglei"/>
		密&nbsp;&nbsp;码: <input name="passWord" type="password" style="width:200px;height:32px" value="zhanglei123"/>
		<input type="submit" value="登录"/>
	</form>

    <!-- <div class="easyui-dialog" title="店铺登录" data-options="closable:false,draggable:false" style="width:400px;height:300px;padding:10px;">
       	<div style="margin-left: 50px;margin-top: 50px;">
       		<div style="margin-bottom:20px;">
	            <div>
	            	用户名: <input name="username" class="easyui-textbox" data-options="required:true" style="width:200px;height:32px" value="zhanglei"/>
	            </div>
	        </div>
	        <div style="margin-bottom:20px">
	            <div>
	            	密&nbsp;&nbsp;码: <input name="password" class="easyui-textbox" type="password" style="width:200px;height:32px" data-options="" value="zhanglei123"/>
	            </div>
	        </div>
	        <div>
	            <a id="login"  style="width:100px;height:32px;margin-left: 50px">登录</a>
	        </div>
       	</div>
    </div> -->
    
</body>
<!--  <script type="text/javascript">
    	$("#login").click(function(){
    		var username = $("[name=username]").val();
    		var password = $("[name=password]").val();
    		
    		var url = "/login?userName=" + username + "&passWord=" + password;
    		$.ajax({
          	    url : url,
          	    type: "GET",
          	    dataType: "json",
             	success : function(data) {
             		if(data.status == 200) {
             			location.href = "/";
             			//location.href = "http://127.0.0.1:8088/";
           			    return false;
             		} else {
             			alert("登录失败：" + data.msg);
             		}
             	}
          	});
    		
    		
    	});
    </script> -->
</html>