<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Cache-Control" content="max-age=300" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园小店 - 开张网</title>
<meta name="Keywords" content="开张网网站" />
<meta name="description" content="开张网" />
<link rel="stylesheet" type="text/css" href="/css/base.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/psearch20131008.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/psearch.onebox.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/pop_compare.css" media="all" />
<script type="text/javascript" src="/js/jquery-1.6.4.js"></script>
</head>
<body>
<script type="text/javascript" src="/js/base-2011.js" charset="utf-8"></script>
<!-- header start -->
<jsp:include page="commons/header.jsp" />
<!-- header end -->
<div class="w main">
<div class="clr"></div>
<div class="m clearfix" id="bottom_pager">
<div  id="pagin-btm" class="pagin fr" clstag="search|keycount|search|pre-page2">
	<span class="prev-disabled">上一页<b></b></span>
	<a href="javascript:void(0)" class="current">1</a>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=2">2</a>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=3">3</a>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=4">4</a>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=5">5</a>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=6">6</a>
	<span class="text">…</span>
	<a href="search?keyword=java&enc=utf-8&qr=&qrst=UNEXPAND&rt=1&page=2" class="next">下一页<b></b></a>
	<span class="page-skip"><em>&nbsp;&nbsp;共${totalPages}页&nbsp;&nbsp;&nbsp;&nbsp;到第</em></span>
</div>
</div>
<div class="m psearch " id="plist">
<ul class="list-h clearfix" tpl="2">
<c:forEach items="${itemList}" var="item">
<li class="item-book" bookid="11078102">
	<div class="p-img">
		<a target="_blank" href="/item/base/${item.id }.html?storeName=${item.store_name }">
			<img width="160" height="160" data-img="1" data-lazyload="${item.image}" />
		</a>
	</div>
	<div class="p-name" style="text-align: center;">
		<a target="_blank" href="/item/base/${item.id }.html?storeName=${item.store_name }">
			${item.title}
		</a>
	</div>
	<div class="p-price" style="text-align: center;">
		<i>价格：</i>
		<strong style="margin-left: 37%;">￥<fmt:formatNumber groupingUsed="false" maxFractionDigits="2" minFractionDigits="2" value="${item.price / 100 }"/></strong>
	</div>
	<div class="service" style="text-align: center;">由<strong style="color: red;">${item.store_name }</strong>店铺发布</div>
	<div class="extra" style="text-align: center;">
		<span class="star" style="margin-left: 33%;"><span class="star-white"><span class="star-yellow h5">&nbsp;</span></span></span>
	</div>
</li>
</c:forEach>
</ul></div>
</div>
<!-- footer start -->
<jsp:include page="commons/footer.jsp" />
<!-- footer end -->
<script type="text/javascript" src="/js/jquery.hashchange.js"></script>
<script type="text/javascript" src="/js/search_main.js"></script>
<script type="text/javascript">
//${paginator.totalPages}
SEARCH.query = "${query}";
SEARCH.bottom_page_html(${page},${totalPages},false);
   $(function(){
	   $("#nav-fashion").addClass(" curr");
   });
</script>
</body>
</html>