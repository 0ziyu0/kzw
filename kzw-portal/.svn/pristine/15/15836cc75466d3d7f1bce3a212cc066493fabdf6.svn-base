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
function changePage(id){
	var totalPage=$("#totalPage").text();//共多少页
	var nowPage=$("#nowPage").text();//当前页
	var pageNum=1;
	
	if(totalPage==nowPage && (id=="nextPage"|| id=="lastPage")){
		pageNum=totalPage;
	}else{
	if(id=="previousPage" && parseInt(totalPage)>2){
		 pageNum=parseInt(nowPage)-1;
	}else if(id=="nextPage" && parseInt(nowPage)<parseInt(totalPage) ){
		pageNum=parseInt(nowPage)+1;
	}else if(id=="lastPage"){
		pageNum=totalPage;
	}else{
		pageNum=1;
	}}
	ajax(pageNum);
}	

	function ajax(pageNum){
				$.ajax({
				    url: "/order/itemOrderJson.action",    //请求的url地址
				    dataType: "json",   //返回格式为json
				    async: true, //请求是否异步，默认为异步，这也是ajax重要特性
				    data: {"pageNum": pageNum },    //参数值
				    type: "post",   //请求方式
				    success: function(date) {
				    $("#nowPage").text(date.pageNum);
				    $("#totalPage").text(date.pages);
				     $("#itemTable").html("");
				     var html=" <tr><td>订单ID</td><td>商品标题 </td><td>数量 </td><td>单价 </td><td>总价 </td><td>购买时间</td><td>订单状态</td></tr>";
				     $.each(date.data.list, function(i, item){  
					html+="	<tr><td>"+item.order_id+"</td><td> "+item.title+"</td><td> "+item.num+"</td><td> "+item.price
					html+="</td><td>"+item.total_fee+"</td><td>"+item.timeStr +"</td><td>"
					if(item.status==1){
						html+="<span>等待买家发货</span></td></tr>"
					}else if(item.status==2){
						html+="<span id='"+item.order_id+"'>"+"<button class='uk-button-primary uk-button-small'  onclick='ident('"+item.order_id+"')'";
						html+=">确认收货</button>/span>"
					}else if(item.status==3){
						html+="<span>交易成功</span>";
					}														
					});
					$("#itemTable").html(html);	
				        
				    },

				});					
				
			}	

	function ident(orderId){
		window.location.href="/order/harvest.html?orderId="+orderId;
		
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
							<li class="active"><a href="/order/itemOrder.action">商品订单</a></li>
							<li ><a href="/personalCenter/SeorderInfo.action">二手订单</a></li>
							<li ><a href="/personalCenter/onsell.action">在售宝贝</a></li>
							<li ><a href="/personalCenter/index.action">发布商品</a></li>
						</ul>
					</div>
				</div>
			</div>

			<div style="width:110%">
				<h3>购买历史</h3>
            <hr />            
            <table id="itemTable" class="uk-table uk-table-middle uk-table-hover uk-table-striped"  style="width:79%;text-align:center;">
   		<tr>
   			<td>订单ID</td>         
            <td>商品标题 </td>
            <td>数量 </td>
            <td>单价 </td>  
            <td>总价 </td>
            <td>购买时间</td>
            <td>订单状态</td>
   		</tr>
  <c:forEach items="${result.list}" var="item">
        <tr>
            <td>${item.order_id}</td>         
            <td>${item.title} </td>
            <td>${item.num} </td>
            <td>${item.price} </td>  
            <td>${item.total_fee} </td>
             <td>${item.timeStr}</td>
            
            <td><c:choose>
            		<c:when test="${item.status==1}"><span>等待买家发货</span></c:when>	
            		<c:when test="${item.status==2}">
            		<span id="${item.order_id}">
            		<button class="uk-button-primary uk-button-small"  onclick="ident('${item.order_id}')">确认收货
            		</button>
            		</span>
            		</c:when>	
            		<c:when test="${item.status==3}"><span>交易成功</span></c:when>	
               </c:choose>
            </td>
        </tr>
</c:forEach>
        </table>
				<br>
			</div>
		</div>
		
		<!-- 分页链接 -->
		<div align="center" style="padding-left:10%;font-size: 15px">
			<a id="fristPage" href="javascript:changePage('fristPage')">首页</a> 
			<a id="previousPage" href="javascript:changePage('previousPage')">上一页</a>
			第<span id="nowPage">${result.curPage}</span>页/共
			<span id="totalPage">${result.pageCount }</span>页
			 <a id="nextPage" href="javascript:changePage('nextPage')">下一页</a>
			<c:if test="${result.curPage <result.pageCount}">
				<a id="lastPage" href="javascript:changePage('lastPage')">尾页</a>
			</c:if>
		</div>
		
		

	</div>

	<jsp:include page="../commons/footer.jsp" />

	
	
</body>
</html>