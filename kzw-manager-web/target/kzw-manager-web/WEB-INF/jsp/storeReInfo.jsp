<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="/css/reset.css" type="text/css" rel="stylesheet">
<link href="/css/main.css" type="text/css" rel="stylesheet">
<link href="/css/uikit.css" type="text/css" rel="stylesheet">
<link href="/css/taotao.css" type="text/css" rel="stylesheet">

<script type="text/javascript" charset="utf-8" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/uikit.min.js"></script>


	<div class="hr_15"></div>
	<div class="comWidth clearfix products">
		<!-- <div style="width:795px;float:left;overflow:hidden;">
			<div id="showMessage" class="uk-alert hide" data-uk-alert>
				<a href="" class="uk-alert-close uk-close"></a>
				<p></p>
			</div> -->
			<hr/>

			<div style="width:600px;margin-bottom:10px;">
				<form id="updateStoreInfo" class="uk-form uk-form-horizontal" method="POST">
					<!-- 判断是否是店主登录 (店主可以修改信息) -->
					<input type="text" name="id" class="hide" value="${customShowStoreInf.storeInf.id }" />
					<c:choose> 
					 <c:when test="${not empty customShowStoreInf.limits}">   
						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺名称：</label>
							<div class="uk-form-controls">
								<input type="text" id="form-h-it"
									value="${customShowStoreInf.storeInf.storeName }" name="storeName"
									onblur="if(!this.value)this.value='${customShowStoreInf.storeInf.storeName }'" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">注册人：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it" placeholder="${customShowStoreInf.user.username }" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店主电话：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it" placeholder="${customShowStoreInf.user.phone }" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺地址：</label>
							<div class="uk-form-controls">
								<input type="text" id="form-h-it" value="${customShowStoreInf.storeInf.storeOther }" name="storeOther" 
									onblur="if(!this.value)this.value='${customShowStoreInf.storeInf.storeOther }'" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺描述：</label>
							<div class="uk-form-cont rols">
								<input type="text" id="form-h-it" value="${customShowStoreInf.storeInf.storeDesc }" name="storeDesc" 
									  style="margin-left: 0px;" onblur="if(!this.value)this.value='${customShowStoreInf.storeInf.storeDesc }'" />
							</div>
						</div>
						<!-- 有修改的话 提交  uk-button uk-button-primary -->
						<div style="padding:5px">
	    					<a href="javascript:void(0)" class="uk-button" style="margin-top:10px;margin-right:150px;float:right;" onclick="submitForm()">更新</a>
						</div>
						<!-- <button class="uk-button" type="button" style="margin-top:10px;margin-right:150px;float:right;">更新</button> -->
					<!-- 如果不是店主登录 (此时只能是看有关信息，不能更改) -->
					</c:when> 
					
					<c:when test="${empty customShowStoreInf.limits}"> 
						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺名称：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it"
									placeholder="${customShowStoreInf.storeInf.storeName }" />
							</div>
						</div> 

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">注册人：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it"
									placeholder="${customShowStoreInf.user.username }" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店主电话：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it"
									placeholder="${customShowStoreInf.user.phone }" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺地址：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it" name="storeOther" 
									placeholder="${customShowStoreInf.storeInf.storeOther }" />
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label" for="form-h-it">店铺描述：</label>
							<div class="uk-form-controls">
								<input disabled="true" type="text" id="form-h-it" style="margin-left: 0px;" placeholder="${customShowStoreInf.storeInf.storeDesc }" />
							</div>
						</div>
						<!-- <div style="padding:5px">
	    					<a href="javascript:void(0)" class="uk-button" style="margin-top:10px;margin-right:150px;float:right;" onclick="submitForm()">更新</a>
						</div> -->
					</c:when> 
					</c:choose>
				</form>
			</div>
			<br />
			<hr />
			<!-- 显示合伙人等信息 ->是店主登录可以进行修改 -->
			<c:if test="${empty customShowStoreInf.limits}">
				<div>
					<div class="uk-overflow-container">
						<table class="uk-table uk-table-hover">
							<thead>
								<tr id="row">
									<th>身份</th>
									<th>姓名</th>
									<th>地址</th>
									<th>电话</th>
									<th>股份</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${customShowStoreInf.partnerLists }"
									var="relationList">
									<tr>
										<td>${relationList.status }</td>
										<td>${relationList.user.username }</td>
										<td>${relationList.user.address }</td>
										<td>${relationList.user.phone }</td>
										<td>${relationList.partner.stockOther }</td>
										<td>
											<!-- <button disabled="true" class="uk-button uk-button-primary" type="button" data-uk-modal="{target:'#modal1'}">编辑</button> -->
											<button disabled="true" class="uk-button uk-button-danger">删除</button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
			</c:if>
			<!-- 显示合伙人等信息 ->是店主登录可以进行修改 -->
			<c:if test="${not empty customShowStoreInf.limits}">
				<div>
					<div class="uk-overflow-container">
						<table id="partnerTable" class="uk-table uk-table-hover">
							<thead>
								<tr id="row">
									<th>身份</th>
									<th>姓名</th>
									<th>地址</th>
									<th>电话</th>
									<th>股份</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${customShowStoreInf.partnerLists }"
									var="relationList">
									<tr>
										<td>${relationList.status }</td>
										<td>${relationList.user.username }</td>
										<td>${relationList.user.address }</td>
										<td>${relationList.user.phone }</td>
										<td>${relationList.partner.stockOther }</td>
										<td>
											<button class="uk-button uk-button-danger">
											    <a href="javascript:void(0)" id="${relationList.partner.id}" onclick="deleteUsers(this.id)">删除</a>
												<%-- <a href="<c:url value='/store/deletePartner'/>?id=${relationList.partner.id}">删除</a> --%>
											</button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
			</c:if>

			<c:if test="${not empty customShowStoreInf.limits}">
				<button class="uk-button" data-uk-modal="{target:'#modal6'}">添加一个合伙人</button>
			</c:if>
			<!-- 如果不是店主则不能点击 -->
			<%-- <c:if test="${empty customShowStoreInf.limits}">
				<button disabled="true" class="uk-button" data-uk-modal="{target:'#modal6'}">添加一个合伙人</button>
			</c:if> --%>

			<!-- 添加一个合伙人的模拟对话框-->
			<div id="modal6" class="uk-modal uk-open" aria-hidden="true" style="overflow-y: scroll; display:none;">
				<div class="uk-modal-dialog">
					<button type="button" class="uk-modal-close uk-close"></button>
					<div class="uk-modal-header">
						<h2>填写合伙人信息</h2>
					</div>
					<!--增加合伙人信息-->
					<form id="addPartner" class="uk-form uk-form-horizontal" method="POST">
					<input type="text" name="storeId" class="hide" value="${customShowStoreInf.storeInf.id }" />
					
						<div class="uk-form-row">
							<label class="uk-form-label" style="width:70px;margin-left:160px;" for="form-h-it">电话：</label>
							<div class="uk-form-controls">
								<input id="partnerPhone" onblur="checkData(this.value);" type="text" id="form-h-it" placeholder="合伙人电话" name="phone" />
								<span id="partnerError" class="hide" style="color: red; border: 0px;"></span>
							</div>
						</div>

						<div class="uk-form-row">
							<label class="uk-form-label"
								style="width:70px;margin-left:160px;" for="form-h-it">股份：</label>
							<div class="uk-form-controls">
								<input type="text" id="form-h-it" placeholder="如不占股份就为空"
									name="userStock" />
							</div>
						</div>
						
						<div class="uk-modal-footer uk-text-right">
							<button class="uk-button uk-modal-close">取消</button>
							<button id="partnerButton" class="uk-button uk-modal-close hide"></button>
							<!-- <button id="partnerButton" class="uk-button uk-button-primary hide">添加</button> -->
							<a href="javascript:void(0)" class="uk-button uk-button-primary" onclick="addUsers()">添加</a>
						</div>
					</form>
				</div>
			</div>

		</div>
	</div>
<script type="text/javascript">
$(function(){
	var trList = $("tbody").children("tr");
	console.info(trList);
	for (var i = 0; i < trList.length; i++) {
		var tdArr = trList.eq(i).children("td");
		var name = tdArr.eq(0).text();
		if(name == '店主') {
			tdArr.eq(5).find("button").addClass('hide');
		}
		
	}
});
	
function submitForm(){
	
	$.post("/store/updateStore",$("#updateStoreInfo").serialize(), function(data){
		
		if(data.status == 200){
			$.messager.alert('提示',data.data);
			/* $("p").html(data.data);
			$("#showMessage").removeClass('hide'); */
		}
	});
	
	
}

function addUsers(){
	
	if($("#partnerError").attr("class") == "hide" && $("#partnerPhone").val() != "") {
		$.post("/store/addPartner",$("#addPartner").serialize(), function(data){
			if(data.status == 200) {
				 $.messager.confirm('提示', data.data,function(){
					$("#partnerButton").click();
					var t = $("#tabs");
					var mytab = t.tabs('getSelected');  // 获取选择的面板   
			        t.tabs('update', {   
			            tab: mytab,   
			            options: {   
			                title: '店铺管理',   
			                content: '/store/storeReInfo'  // 新内容的URL   
			            }   
			        });
	        	}); 
				
				
			}
		});
	} else {
		alert("页面参数填写有误");
	}
	
}
// 校验合伙人
function checkData(phone) {
	var url = "/store/checkPartner/"+phone;
	$.ajax({
  	    url : url,
  	    type: "GET",
  	    dataType: "json",
     	success : function(data) {
     		if(data.status != 200) {
     			$("#partnerError").removeClass('hide');
     			$("#partnerError").text(data.msg);
     		} else {
     			$("#partnerError").addClass('hide');
     		}
     	}
  	});
}

// 删除
function deleteUsers(id) {
	var url = "/store/deletePartner?id=" + id;
	$.get(url, function(data){
		$.messager.confirm('提示', data.data,function(){
			var t = $("#tabs");
			var mytab = t.tabs('getSelected');  // 获取选择的面板   
	        t.tabs('update', {   
	            tab: mytab,   
	            options: {   
	                title: '店铺管理',   
	                content: '/store/storeReInfo'  // 新内容的URL   
	            }   
	        });
	   });
	});
}
	
</script>










