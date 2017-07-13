<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<style type="text/css">
.demo {
	width: 760px;
	margin: 20px auto 0 auto;
	height: 70px;
}

.button {
	display: inline-block;
	outline: none;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	font: 16px/100% 'Microsoft yahei', Arial, Helvetica, sans-serif;
	padding: .5em 2em .55em;
	text-shadow: 0 1px 1px rgba(0, 0, 0, .3);
	-webkit-border-radius: .5em;
	-moz-border-radius: .5em;
	border-radius: .5em;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .2);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .2);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .2);
}

.button:hover {
	text-decoration: none;
}

.button:active {
	position: relative;
	top: 1px;
}

.bigrounded {
	-webkit-border-radius: 2em;
	-moz-border-radius: 2em;
	border-radius: 2em;
}

.medium {
	font-size: 12px;
	padding: .4em 1.5em .42em;
}

.small {
	font-size: 11px;
	padding: .2em 1em .275em;
}

/* blue */
.blue {
	color: #d9eef7;
	border: solid 1px #0076a3;
	background: #0095cd;
	background: -webkit-gradient(linear, left top, left bottom, from(#00adee),
		to(#0078a5));
	background: -moz-linear-gradient(top, #00adee, #0078a5);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#00adee',
		endColorstr='#0078a5');
}

.blue:hover {
	background: #007ead;
	background: -webkit-gradient(linear, left top, left bottom, from(#0095cc),
		to(#00678e));
	background: -moz-linear-gradient(top, #0095cc, #00678e);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0095cc',
		endColorstr='#00678e');
}

.blue:active {
	color: #80bed6;
	background: -webkit-gradient(linear, left top, left bottom, from(#0078a5),
		to(#00adee));
	background: -moz-linear-gradient(top, #0078a5, #00adee);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0078a5',
		endColorstr='#00adee');
}

/* green */
.green {
	color: #e8f0de;
	border: solid 1px #538312;
	background: #64991e;
	background: -webkit-gradient(linear, left top, left bottom, from(#7db72f),
		to(#4e7d0e));
	background: -moz-linear-gradient(top, #7db72f, #4e7d0e);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#7db72f',
		endColorstr='#4e7d0e');
}

.green:hover {
	background: #538018;
	background: -webkit-gradient(linear, left top, left bottom, from(#6b9d28),
		to(#436b0c));
	background: -moz-linear-gradient(top, #6b9d28, #436b0c);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#6b9d28',
		endColorstr='#436b0c');
}

.green:active {
	color: #a9c08c;
	background: -webkit-gradient(linear, left top, left bottom, from(#4e7d0e),
		to(#7db72f));
	background: -moz-linear-gradient(top, #4e7d0e, #7db72f);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#4e7d0e',
		endColorstr='#7db72f');
}

/* white */
.white {
	color: #606060;
	border: solid 1px #b7b7b7;
	background: #fff;
	background: -webkit-gradient(linear, left top, left bottom, from(#fff),
		to(#ededed));
	background: -moz-linear-gradient(top, #fff, #ededed);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffff',
		endColorstr='#ededed');
}

.white:hover {
	background: #ededed;
	background: -webkit-gradient(linear, left top, left bottom, from(#fff),
		to(#dcdcdc));
	background: -moz-linear-gradient(top, #fff, #dcdcdc);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffff',
		endColorstr='#dcdcdc');
}

.white:active {
	color: #999;
	background: -webkit-gradient(linear, left top, left bottom, from(#ededed),
		to(#fff));
	background: -moz-linear-gradient(top, #ededed, #fff);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ededed',
		endColorstr='#ffffff');
}

/* orange */
.orange {
	color: #fef4e9;
	border: solid 1px #da7c0c;
	background: #f78d1d;
	background: -webkit-gradient(linear, left top, left bottom, from(#faa51a),
		to(#f47a20));
	background: -moz-linear-gradient(top, #faa51a, #f47a20);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#faa51a',
		endColorstr='#f47a20');
}

.orange:hover {
	background: #f47c20;
	background: -webkit-gradient(linear, left top, left bottom, from(#f88e11),
		to(#f06015));
	background: -moz-linear-gradient(top, #f88e11, #f06015);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f88e11',
		endColorstr='#f06015');
}

.orange:active {
	color: #fcd3a5;
	background: -webkit-gradient(linear, left top, left bottom, from(#f47a20),
		to(#faa51a));
	background: -moz-linear-gradient(top, #f47a20, #faa51a);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f47a20',
		endColorstr='#faa51a');
}
</style>
<meta charset="UTF-8">
<title>开张网</title>
<link type="text/css" rel="stylesheet" href="/css/kzw/uikit.min.css" />
<link type="text/css" rel="stylesheet" href="/css/personal/reset.css">
<link type="text/css" rel="stylesheet" href="/css/personal/main.css">
<script src="/js/jquery-1.6.4.js"></script>
<script src="/js/kzw/uikit.min.js"></script> 
</head>
<script type="text/javascript">
	$(function() {
		$("#addbutton").click(function() {

			var itemname = $("input[name ='itemname']").val();
			var itemprice = $("input[name ='itemprice']").val();
			var itemdescription = $("input[name ='itemdescription']").val();
			var img = $("input[name ='img']").val();

			if (itemname.length == 0) {
				alert("商品名不能为空！")
			} else if (itemprice.length == 0 ) {
				alert("价格不能为空！")
			}else if (isNaN(itemprice)) {
				alert("价格请输入数字!");
			}else if (itemdescription.length < 5) {
				alert("描述不能低于5个字！")
			} else
			if (img.indexOf(".png") < 0 && img.indexOf(".jpg") < 0) {
				alert("请上传正确格式的图片（jpg,png）！")
			} else {
				 $("#additem").submit(); 
			}

		})

	})
</script>
<body>
	<div id="wrapper">
		<div class="headerBar">
			<%@include file="PersonCenterHeader.jsp"%>
		</div>
		<div class="banner comWidth clearfix hide">
			<div class="banner_bar banner_big">
				<ul class="imgBox">
					<li><a href="#"><img src="images/banner/banner_01.jpg"
							alt="banner"></a></li>
					<li><a href="#"><img src="images/banner/banner_02.jpg"
							alt="banner"></a></li>
				</ul>
				<div class="imgNum">
					<a href="#" class="active"></a><a href="#"></a>
				</div>
			</div>
		</div>
		<div class="hr_15"></div>
		<div class="comWidth  products clearfix "  style="padding-top:15px">
			<div class="leftArea products">
				<div class="leftNav vertical">
					<h3 class="nav_title">个人中心</h3>
					<div class="nav_cont">
						<ul class="navCont_list clearfix" style="text-align:center;">
							<li><a href="/order/itemOrder.action">商品订单</a></li>
							<li><a href="/personalCenter/SeorderInfo.action">二手订单</a></li>
							<li><a href="/personalCenter/onsell.action">在售宝贝</a></li>
							<li class="active"><a href="/personalCenter/index.action">发布商品</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class=" rightArea" style="float:left;padding-left:20px;">
				<div class=" products banner_bar banner_big hide">
					<ul class="imgBox">
						<li><a href="#"><img src="images/banner/banner_01.jpg"
								alt="banner"></a></li>
						<li><a href="#"> <img src="images/banner/banner_02.jpg"
								alt="banner"></a></li>
					</ul>
					<div class="imgNum">
						<a href="#" class="active"></a><a href="#"></a>
					</div>
				</div>
				<div class="inputGood"
					style="font-size:16px;font-family:'Microsoft Yahei','微软雅黑';width:400px;height:300px;">
					<div class="products_title">
						<h3 style="width:400px;text-indent:0px;font-size:16px">发布所需的商品信息</h3>
					</div>
					<!-- 这里是对传入到后台参数的规范校验 -->
					<c:if test="${allErrors !=null }">
						<c:forEach items="${allErrors }" var="error">
     				   ${error.defaultMessage }
      </c:forEach>
					</c:if>
					<br>
					<!-- 这里是对商品上传成功的提示信息 -->
					<p style="color: red; font-weight: 900">${message }</p>

					<form id="additem" action="/personalCenter/add.action"
						method="post" enctype="multipart/form-data">
						商品名称：<input type="text" name="itemname" /> <br>
						<hr />
						价 格：<input type="text" name="itemprice" /> <br>
						<hr />
						商品描述：<input type="text" name="itemdescription" "/> <br>
						<hr />
						商品图片：<input type="file" name="img" /> <br>
						<hr />
						<input id="addbutton" type="button" value="提交"
							class="button blue medium" style="width: 44px;height: 18px;" />
					</form>

				</div>
			</div>
		</div>
	</div>
	<!-- wrapper结束 -->
	<jsp:include page="../commons/footer.jsp" />
</body>
</html>