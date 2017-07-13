<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8">
<title>开张个人主页</title>
<link type="text/css" rel="stylesheet" href="/css/kzw/uikit.min.css" />
<link type="text/css" rel="stylesheet" href="/css/personal/reset.css">
<link type="text/css" rel="stylesheet" href="/css/personal/main.css">
<script src="/js/kzw/uikit.min.js"></script> 
<script src="/js/jquery-1.6.4.js"></script>
<script type="text/javascript">
function formatDate(now) {
	var now = new Date(now);
	var year = now.getFullYear();
	var month = now.getMonth() + 1;
	var date = now.getDate();
	var hour = now.getHours();
	var minute = now.getMinutes();
	var second = now.getSeconds();
	return year + "/" + (month < 10 ? ("0" + month) : month) + "/" 
			+ (date < 10 ? ("0" + date) : date)
			+ " " + hour + ":" 
			+ (minute < 10 ? ("0" + minute) : minute) + ":" 
			+ (second < 10 ? ("0" + second) : second);
}


</script>



</head>



<body>
	<div id="wrapper">

		<div class="headerBar">
			<%@include file="PersonCenterHeader.jsp"%>
		</div>
		
		
<div class="hr_15"></div>
		<div class="comWidth clearfix products ">
			<div class="leftArea products">
				<div class="leftNav vertical">
					<h3 class="nav_title">个人中心</h3>
					<div class="nav_cont">
						<ul class="navCont_list clearfix" style="text-align:center;!imp">
							<li><a href="/order/itemOrder.action">商品订单</a></li>
							<li class="active"><a href="/personalCenter/SeorderInfo.action">二手订单</a></li>
							<li ><a href="/personalCenter/onsell.action">在售宝贝</a></li>
							<li ><a href="/personalCenter/index.action">发布商品</a></li>
						</ul>
					</div>
				</div>
			</div>

			<div style="width:110%">
				<h3>购买历史</h3>
            <hr />            
            <table class="uk-table uk-table-middle uk-table-hover uk-table-striped"  style="width:79%;text-align:center;">
    <c:forEach items="${resultList}" var="item">
        <tr>
            <th>
            <c:if test="${item.typeId ==1 }">你已经成功购买了商品ID:${item.itemid }的宝贝<span style="color:FF9933">${item.itemname}</span>，价格<span style="color:9933FF">￥${item.itemprice }</span>,时间:${item.timeStr}</c:if>
            <c:if test="${item.typeId ==2 }">你的宝贝<span style="color:FF9933">${item.itemname}</span>以  &nbsp<span style="color:9933FF">￥${item.itemprice }</span>元&nbsp价格成功出售，联系电话:<span style="color:9999FF">${item.phone}</span>,时间:${item.timeStr}</c:if>
            
            </th>
            
        </tr>
</c:forEach>
        </table>
				<br>
			</div>
		</div>

	</div>

	<jsp:include page="../commons/footer.jsp" />
</body>
</html>