<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Link JScript-->
<script type="text/javascript" charset="utf-8" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript">
    //判断如果当前页面不为主框架，则将主框架进行跳转
  	var tagert_URL = "http://127.0.0.1:8088/showLogin";
    alert("123");
 		    if(self==top){
 		    	//window.location.href="http://127.0.0.1:8083/sso/page/login";
 		    	$.messager.alert('登录超时',data.msg + '-3秒后自动跳转');
 		    	setTimeout(windowRefleshs,3000);
 		    	
 		    }else{
 		    	$.messager.alert('登录超时',data.msg + '-3秒后自动跳转');
 		    	setTimeout(topRefleshs,3000);
 		    } 
 		    
// 延迟加载表格数据
 function windowRefleshs() {
	 window.location.href = tagert_URL;
}	
function topRefleshs() {
	top.location.href = tagert_URL;
}
 </script>
<!-- 会话超时，<span id="time">5</span>s后将跳转到登录页面  -->
</body>
