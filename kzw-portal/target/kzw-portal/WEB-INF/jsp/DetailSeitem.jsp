<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>${item.itemname } - 开张网</title>
	<script>var jdpts = new Object(); jdpts._st = new Date().getTime();</script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="/css/taotao.css" media="all" />
	<link rel="stylesheet" type="text/css" href="/css/pshow.css" media="all" />
	<script type="text/javascript">
    	window.pageConfig = {
			compatible: true,
       		product: {
				skuid: 1221882,
				name: '\u957f\u8679\uff08\u0043\u0048\u0041\u004e\u0047\u0048\u004f\u004e\u0047\uff09\u004c\u0045\u0044\u0034\u0032\u0035\u0033\u0038\u0045\u0053\u0020\u0034\u0032\u82f1\u5bf8\u0020\u7a84\u8fb9\u84dd\u5149\u004c\u0045\u0044\u6db2\u6676\u7535\u89c6\uff08\u9ed1\u8272\uff09',
				skuidkey:'E804B1D153D29E36088A33A134D85EEA',
				href: '',
				src: 'jfs/t304/157/750353441/93159/e4ee9876/54227256N20d4f5ec.jpg',
				cat: [737,794,798],
				brand: 20710,
				nBrand: 20710,
				tips: false,
				type: 1,
				venderId:0,
				shopId:'0',
				TJ:'0',
				specialAttrs:["HYKHSP-0","isHaveYB","isSelfService-0","isWeChatStock-0","isCanUseJQ","isOverseaPurchase-0","YuShou","is7ToReturn-1","isCanVAT"],
				videoPath:'',
				HM:'0'
			}
		};
    	

    	
    	
    	
	</script>

	
		



	
	
	
</head>
<body version="140120">
<script type="text/javascript">try{(function(flag){ if(!flag){return;} if(window.location.hash == '#m'){var exp = new Date();exp.setTime(exp.getTime() + 30 * 24 * 60 * 60 * 1000);document.cookie = "pcm=1;expires=" + exp.toGMTString() + ";path=/;domain=jd.com";return;}else{var cook=document.cookie.match(new RegExp("(^| )pcm=([^;]*)(;|$)"));var flag=false;if(cook&&cook.length>2&&unescape(cook[2])=="1"){flag=true;}} var userAgent = navigator.userAgent; if(userAgent){ userAgent = userAgent.toUpperCase();if(userAgent.indexOf("PAD")>-1){return;} var mobilePhoneList = ["IOS","IPHONE","ANDROID","WINDOWS PHONE"];for(var i=0,len=mobilePhoneList.length;i<len;i++){ if(userAgent.indexOf(mobilePhoneList[i])>-1){var url="http://m.jd.com/product/"+pageConfig.product.skuid+".html";if(flag){pageConfig.product.showtouchurl=true;}else{window.location.href = url;}break;}}}})((function(){var json={"6881":3,"1195":3,"10011":3,"6980":3,"12360":3};if(json[pageConfig.product.cat[0]+""]==1||json[pageConfig.product.cat[1]+""]==2||json[pageConfig.product.cat[2]+""]==3){return false;}else{return true;}})());}catch(e){}</script>
<!-- header start -->
<jsp:include page="commons/header.jsp" />
<!-- header end -->
<div class="w">
	<div class="breadcrumb">
		<strong><a href="#">校园二手</a></strong>
	</div>
</div><!--breadcrumb end-->
<div class="w">
	<div id="product-intro" >
		<div id="name">
			<h1>${item.itemname }</h1>
			<%-- <strong>${item.sellPoint}</strong> --%>
		</div><!--name end-->
		<script type='text/javascript'>var warestatus = 1; var eleSkuIdKey =[];</script>
		<div class="clearfix" clstag="shangpin|keycount|product|share">
<script type="text/javascript">pageConfig.product.marketPrice='';</script>
<ul id="summary">
	<li id="summary-price">
		<div class="dt">价格：</div>
		<div class="dd">
			<strong class="p-price"  id="jd-price">￥<fmt:formatNumber groupingUsed="false" maxFractionDigits="2" minFractionDigits="2" value="${item.itemprice }"/> </strong>
			<a id="notice-downp" href="#none" target="_blank" clstag="shangpin|keycount|product|jiangjia">(降价通知)</a>
		</div>
	</li>
	<li id="summary-market"><div class="dt">商品编号：</div><div class="dd"><span>${item.itemid }</span></div></li>
<!-- 商品评分-->
	<li id="summary-stock" style="display: none;">
		<div class="dt">配&nbsp;送&nbsp;至：</div>
		<div class="dd">
			<div id="store-selector" class="">
				<div class="text"><div></div><b></b></div>
				<div class="content">			
					<span class="clr"></span>
				</div>
				<div class="close" onclick="$('#store-selector').removeClass('hover')"></div>
			</div><!--store-selector end-->
			<div id="store-prompt"></div><!--store-prompt end--->
		</div>
		<span class="clr"></span>
	</li>
	<li id="summary-service" class="hide">
		<div class="dt">服&#x3000;&#x3000;务：</div>
		<div class="dd">由 开张网 发货并提供售后服务。</div>
	</li>
	<li id="summary-tips"  class="hide">
		<div class="dt">温馨提示：</div>
		<div class="dd"></div>
	</li>
	<li id="summary-gifts"  class="hide">
		<div class="dt">赠&#x3000;&#x3000;品：</div>
		<div class="dd"></div>
	</li>
	<li id="summary-promotion-extra" class="none">
		<div class="dt">促销信息：</div>
		<div class="dd"></div>
	</li>
</ul><!--summary end-->
		<div id="brand-bar" clstag="shangpin|keycount|product|btn-coll">
	<dl class="slogens">
		<dt>开张网·正品保证</dt>
		<dd class="fore1">
			<a target="_blank" href="http://help.360buy.com/help/question-67.html"><b></b><span>货到</span><span>付款</span></a>
		</dd>
		<dd class="fore2"></dd>
		<dd class="fore3"><a target="_blank" href="http://help.360buy.com/help/question-65.html"><b></b><span>满39</span><span>免运费</span></a></dd>
		<dd class="fore4"></dd>
		<dd class="fore5"><a target="_blank" href="http://help.360buy.com/help/question-97.html"><b></b><span>售后</span><span>上门</span></a></dd>
	</dl>
	 <div class="seller hide">
		    <p class="seller-link"></p>
			<p id="evaluate">
		        <em class="dt">服务评价：</em>
		        <span class="heart-white"><span class="heart-red h4">&nbsp;</span></span>
		        <em class="evaluate-grade"></em>
	        </p>
	    </div> 
</div><!--brand-bar-->
			<ul id="choose" clstag="shangpin|keycount|product|choose">
				<li id='choose-type'></li><script type="text/javascript"> var ColorSize = [{"SkuId":1221882,"Size":"","Color":""}];</script>
								<li id="choose-amount">
					<div class="dt">购买数量：</div>
					<div class="dd">
						<div class="wrap-input">
								<a class="btn-reduce" href="javascript:;" >减少数量</a>
								<a class="btn-add" href="javascript:;" >增加数量</a>
								<input class="text" id="buy-num" value="1" onkeyup="setAmount.modify('#buy-num');"/>
						</div>
					</div>
				</li>
		        <li id="choose-result"><div class="dt"></div><div class="dd"></div></li>
				<li id="choose-btns">
					<div id="choose-btn-append"  class="btn">
							<%-- <a class="btn-append " id="InitCartUrl" href="/cart/add/${item.id}?num=1.html" clstag="shangpin|keycount|product|initcarturl">加入购物车<b></b></a> --%>
						<!-- <a class="btn-append " id="InitCartUrl" href="javascript:buy()" clstag="shangpin|keycount|product|initcarturl" >购买<b class="sbuy" ></b></a> -->
						<a id="InitCartUrl" href="javascript:buy()" clstag="shangpin|keycount|product|initcarturl" ><img src="../../images/secondOne.png" /></a>
					</div>
					<div id="choose-btn-easybuy" class="btn"></div>
					<div id="choose-btn-divide" class="btn"></div>
				</li>
			</ul><!--choose end-->
			<span class="clr"></span>
		</div>
		
		<div id="preview">
			<div id="spec-n1" class="jqzoom" clstag="shangpin|keycount|product|spec-n1">
				<img data-img="1" width="350" height="350" src="${item.img}" alt="${item.itemname}"  jqimg="${item.img}"/>
			</div>
					
			<div id="spec-list" clstag="shangpin|keycount|product|spec-n5">
				<a href="javascript:;" class="spec-control" id="spec-forward"></a>
				<a href="javascript:;" class="spec-control" id="spec-backward"></a>
				<div class="spec-items">
					<ul class="lh">   
						<c:forEach items="${item.img}" var="pic" varStatus="status">  
							<c:choose>
								<c:when test="${status.index == 0 }">
									<li>
										<img data-img="1" class="img-hover"  alt="${item.itemname}" src="${pic}" width="50" height="50" data-url="${pic}">
									</li>
								</c:when>
								<c:otherwise>
									<li>
										<img data-img="1" alt="${item.itemname}" src="${pic}" width="50" height="50" data-url="${pic}">
									</li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div id="short-share">
				<div id="view-bigimg" class="fl"><b></b><a href="${item.img}" target="_blank">查看大图</a></div>
				<div id="share-list" style="left: 112px;" class="share-list" clstag="shangpin|keycount|product|share">
	<div class="share-bd">
		<em class="share-hd">分享到：</em>
		<ul class="share-list-item clearfix">
			<li><a href="javascript:;" id="site-sina" title="分享到新浪微博">新浪微博</a></li>
			<li><a href="javascript:;" id="site-qq" title="分享到给QQ好友">QQ</a></li>
			<li><a href="javascript:;" id="site-qzone" title="分享到腾讯微博">腾讯微博</a></li>
			<li><a href="javascript:;" id="site-renren" title="分享到人人网">人人网</a></li>
			<li><a href="javascript:;" id="site-kaixing" title="分享到开心网">开心网</a></li>
			<li><a href="javascript:;" id="site-douban" title="分享到豆瓣">豆瓣</a></li>
			<li><a href="javascript:;" id="site-msn" title="分享给MSN好友">MSN</a></li>
			<li><a href="javascript:;" id="site-email" title="邮件分享给好友">邮件</a></li>
		</ul>
	</div>
	<div class="share-ft"><b></b></div>
</div>
<div class="clb"></div>				
			</div>
		</div><!--preview end-->
	</div><!--product-intro end-->
</div>
<div class="w" style="width: 982px;">
	<div class="right">
		<div id="product-detail" class="m m1" data-widget="tabs" clstag="shangpin|keycount|product|detail">
			<div class="mt">
				<ul class="tab">
	<li clstag="shangpin|keycount|product|pinfotab" data-widget="tab-item" class="curr"><a href="javascript:;" >商品介绍</a></li>
	<li clstag="shangpin|keycount|product|pcanshutab" data-widget="tab-item"><a href="javascript:;" >规格参数</a></li>
	<li clstag="shangpin|keycount|product|packlisttab" data-widget="tab-item"><a href="javascript:;" >包装清单</a></li>
	<li clstag="shangpin|keycount|product|pingjiatab" data-widget="tab-item"><a href="javascript:;" >商品评价</a></li>
	<li clstag="shangpin|keycount|product|psaleservice" data-widget="tab-item"><a href="javascript:;" >售后保障</a></li>
	<li clstag="shangpin|keycount|product|zhinan" data-widget='tab-item'><a href='javascript:;'>京博士</a></li>
</ul>
			</div>
			<div class="mc" data-widget="tab-content" id="product-detail-1">
				<ul class="detail-list">
					<li title="${item.itemname }">商品名称：${item.itemname }</li>
					<li>商品编号：${item.itemid}</li>
  					<li id="time">上架时间：</li>
				
				</ul>
				<div id="item-desc" class="detail-content">
						商品描述: <!-- 商品描述 -->
				</div>
			</div>
			<div class="mc hide" data-widget="tab-content" id="product-detail-2">
				
			</div>
				<div class="mc  hide" data-widget="tab-content" id="product-detail-3">
				<div class="item-detail">液晶电视×1、底座×1、遥控器×1、使用说明书×1、电源线×1</div></div><div class="mc  hide" data-widget="tab-content" id="product-detail-4"></div><div class="mc hide " data-widget="tab-content" id="product-detail-5"><div class="item-detail">本产品校园学生提供，享受开张网政策，<br />自收到商品之日起，如您所购买商品出现质量问题，请先联系卖家 。开张网承诺您：3天内可为您退货或换货，5天内无需修理直接换货。<br /><br />
						<br/>售后服务电话：18200584144<br/>
						</div></div><div id="product-detail-6" class="mc hide" data-widget="tab-content"></div>
			<!--知识库二级标签、标题-->
            <div id="promises">
	<strong>服务承诺：</strong><br />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开张网向您保证所售商品均为正品行货，开张网自营商品开具机打发票或电子发票。凭质保证书及开张网发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由开张网联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。开张网还为您提供具有竞争力的商品价格和运费政策，请您放心购买！
	<br /><br />
	注：因卖家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本网站不能确保客户收到的货物与商城图片、产地、附件说明完全一致。
</div>
<div id="state">
	<strong>权利声明：</strong><br />开张网上的所有商品信息、商品咨询等内容，是开张网重要的经营资源，未经许可，禁止非法转载使用。
	<p><b>注：</b>本站商品信息均来自于合作方，其真实性、准确性和合法性由信息拥有者（合作方）负责。本站不提供任何保证，并不承担任何法律责任。</p>
</div>
		</div><!--product-detail end-->
	</div>
	<span class="clr"></span>
</div>
<!-- footer start -->
<jsp:include page="commons/footer.jsp" />
<!-- footer end -->
<script type="text/javascript" src="/js/jquery-1.6.4.js"></script>
<script type="text/javascript" src="/js/lib-v1.js"></script>
<script type="text/javascript" src="/js/product.js"></script>
<script type="text/javascript" src="/js/iplocation_server.js"></script>
<script type="text/javascript">
$(function(){   	   
	   var time=${item.uptime};	   
	   var xx=  formatDate(time);
	   $("#time").append(xx);	   	   
	   $("#p-con-attr").hide();
	   $("#p-con-list").hide();
	   $("#p-con-comm").hide();
	   $(".research").hide();
	   /* $("#InitCartUrl").hover(function(){
		    $("#InitCartUrl").html("<img src='../../images/secondTwo.png'/>");
		} */
});


var buyxx=false;
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



function buy(){
	
	var itemid=${item.itemid};
	var sellerid=${item.userid};
	if(buyxx==true){
		alert("购买成功，请到个人中心-->二手订单查询购买！");
	}else{
	$.ajax({
	    url: "/personalCenter/buySeItem.action",    //请求的url地址
	    dataType: "json",   //返回格式为json
	    async: true, //请求是否异步，默认为异步，这也是ajax重要特性
	    data: {"itemId": itemid ,
	    	  "sellerId":sellerid
	    	},    //参数值
	    type: "post",   //请求方式
	    success: function(date) {
		alert("购买成功，请到个人中心-->二手订单查询购买！");
		buyxx=true;
	    }
});
	}		
}




  
</script>
</body>
</html>