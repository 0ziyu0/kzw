<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<span>订单编号:</span>
	<input type="text" id="order_id" style="border:1px solid #95B8E7;"/>
	<span>&nbsp;商品标题:</span>
	<input type="text" id="title" style="border:1px solid #95B8E7;"/>
	<span>&nbsp;买家电话:</span>
	<input type="text" id="phone" style="border:1px solid #95B8E7;"/>
	<span>&nbsp;开始时间:</span>
	<input class="easyui-datetimebox" name="createtime"/>
	<span>&nbsp;结束时间:</span>
	<input class="easyui-datetimebox" name="updatetime"/>
	<a href="javascript:searchItem()" class="easyui-linkbutton" iconCls="icon-search" plain="true"></a>
</div>
<table class="easyui-datagrid" id="storeHistoryOrder" title="店铺历史订单" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/store/historyOrder',method:'post',pageSize:30">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'order_id',width:60">订单编号</th>
            <th data-options="field:'title',width:120">商品标题</th>
            <th data-options="field:'num',width:70">购买数量</th>
            <th data-options="field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice">单价</th>
            <th data-options="field:'total_fee',width:70,align:'right',formatter:TAOTAO.formatPrice">总价</th>
            <th data-options="field:'status',width:100,align:'center',formatter:TAOTAO.formatStoreOrder">订单状态</th>
            <th data-options="field:'username',width:120,align:'center'">买家名称</th>
            <th data-options="field:'address',width:140,align:'center'">买家地址</th>
            <th data-options="field:'phone',width:100,align:'center'">买家电话</th>
            <th data-options="field:'email',width:100,align:'center'">买家邮箱</th>
            <th data-options="field:'payment_type',width:100,align:'center',formatter:TAOTAO.formatPayType">支付类型</th>
            <th data-options="field:'create_time',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建时间</th>
        </tr>
    </thead>
</table>

<script>
    
    // 搜索
    function searchItem(){
		var title = $("#title").val();
		var order_id = $("#order_id").val();
		var phone = $("#phone").val();
		var createtimeStr = $("input[name='createtime']").val();
		var updatetimeStr = $("input[name='updatetime']").val();
		$("#storeHistoryOrder").datagrid('load', {
			title : title,
			order_id : order_id,
			phone : phone,
			createtimeStr : createtimeStr,
			updatetimeStr : updatetimeStr
		});
    }
</script>



















