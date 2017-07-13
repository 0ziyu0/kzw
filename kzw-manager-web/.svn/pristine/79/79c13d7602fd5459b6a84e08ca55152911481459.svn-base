<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table class="easyui-datagrid" id="itemList" title="店铺订单配送" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/store/order',method:'get',pageSize:30,toolbar:toolbar">
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

	var flage = false;

    function getSelectionsIds(){
    	var itemList = $("#itemList");
    	var sels = itemList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].order_id);
    		if(sels[i].status != 1) {
    			flage = true;
    		}
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'发货',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中商品!');
        		return ;
        	}
        	if(flage) {
        		flage = false;
        		$.messager.alert('提示','选中的商品中已有发货的!');
        		return ;
        	}
        	$.messager.confirm('确认','确定发货ID为 '+ids+' 的商品吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/store/delivery",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','商品发货成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
    
</script>



















