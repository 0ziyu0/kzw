<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<title>个人中心</title>
<script type="text/javascript" src="/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript"
	src="/js/jquery_easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="/js/jquery_easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="/js/jquery_easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="/js/jquery_easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css"
	href="/js/jquery_easyui/themes/demo1.css" />

<style type="text/css">
.edui-popup-content.edui-default {
	height: auto !important;
}

</style>

<body>
	<div class="easyui-layout" style="width:100%;height:500px;">

		<div data-options="region:'west',split:true" title="应用选择"
			style="width:100%;" class="panel-body layout-body">
			<div>
				<a
					style="width:68%;padding-left:25%;padding-top:7px;padding-bottom:7px"
					class="easyui-linkbutton" data-options="plain:true" id="feedback">意见反馈</a>
				<hr />
				<a
					style="width:68%;padding-left:25%;padding-top:7px;padding-bottom:7px"
					class="easyui-linkbutton" data-options="plain:true" id="commonque">常见问题</a>
				<hr />
				<a
					style="width:68%;padding-left:25%;padding-top:7px;padding-bottom:7px"
					class="easyui-linkbutton" data-options="plain:true" id="module">应用管理</a>
				<hr />
			</div>
		</div>


		<div style="text-align:center;" data-options="region:'center'">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td valign="top">

						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							id="rightdiv">
							<tr>
								<td valign="top">

									<div class="box_tit01" width="100%">
										<h3>意见反馈</h3>
									</div>

									<div style="height: 25px;margin-top: 10px;">

										<div class="fll ml10" style="font-size: 12px;width: 200px;">
											应 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;用： <select id="module_sel"
												style="width:120px;height: 20px;">
												<option>全部</option>
												<c:forEach var="modulename" items="${module}">
													<option>${modulename.MODULE_NAME}</option>
												</c:forEach>
											</select>
										</div>

										<div class="fll ml10" style="font-size: 12px;width: 200px;">
											反馈类型： <select id="freedbacktype"
												style="width: 120px;height: 20px;">
												<option value='0'>全部</option>
												<option value='1'>系统问题</option>
												<option value='2'>更新意见</option>
												<option value='3'>新需求</option>
												<option value='4'>其它</option
											</select> </select>
										</div>

										<div class="fll ml10" style="font-size: 12px;width: 200px;">
											所属机构： <input id="ss_unit" class="easyui-combotree"
												style="width:132px;" />
										</div>

										<div class="fll ml10" style="font-size: 12px;width: 200px;">
											是否回复： <select id="replystate"
												style="width:120px;height: 20px;">
												<option value='0'>全部</option>
												<option value='1'>是</option>
												<option value='2'>否</option>
											</select>
										</div>

									</div>
								</td>
							</tr>

							<tr>
								<td valign="top">


									<div class="fll ml10" style="font-size: 12px;width: 190px;">
										<label>创建时间：</label> <input id="CREATE_TIME" type="text"
											class='easyui-datebox' style="width: 120px;"
											data-options="editable:false">
									</div>

									<div class="fll ml10" style="font-size: 12px;width: 150px;">
										<label>至</label> <input id="CREATE_TIME_2" type="text"
											class='easyui-datebox' style="width: 120px;"
											data-options="editable:false">
									</div>

									<div class="fll ml10" style="font-size: 12px;width: 200px;">
										状 态： <select id="suggstate" style="width:120px;height: 20px;">
											<option value='0'>全部</option>
											<option value='1'>启用</option>
											<option value='2'>禁用</option>
										</select>
									</div>


									<div class="fll ml10"
										style="font-size: 12px;width: 240px;text-align:right">
										<a style="margin-bottom: 8px;" href="javascript:void(0)"
											class="easyui-linkbutton"
											data-options="iconCls:'icon-search'" id="feedquery">查询</a>
									</div>

								</td>
							</tr>

							<tr>
								<td>
									<table id="tt">
									</table>
								</td>
							</tr>


						</table>


					</td>
				</tr>
			</table>
		</div>








		<!-- 主界面结束 -->
		<!-- (点击新增弹出)编辑窗口 -->


		<!-- 意见反馈详情的对话框 -->
		<div id="dlg_2" class="easyui-dialog"
			data-options="title:'新增',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
			style="width:600px;height:400px;padding:10px 20px" closed="true"
			buttons="#dlg2-buttons">
			<div class="easyui-layout" data-options="fit:true">

				<div data-options="region:'north',split:true"
					style="width:100px;height:155px">
					<label>内容：</label>
					<div id="d_1" style="font-weight: normal;margin-top:10px;"></div>
					<div id="d_3" style="display: none;"></div>
					<div id="d_4" style="display: none;"></div>
				</div>

				<div data-options="region:'south',split:true"
					style="width:100px;height:155px;">
					
					<label>回复：</label>
					<div id="d_2" contenteditable="true"
						style="font-weight: normal;margin-top:10px;height:105px;overflow:auto;">
					</div>
					
				</div>
 			


			<div id="dlg2-buttons">
				 <a
					href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-save" onclick="save()">保存</a>
			</div>
		</div>



		<!-- 		新增联系人 -->
		<div id="dlg_4" class="easyui-dialog" title="新增联系人"
			style="width:520px;height:270px;"
			data-options="maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
			buttons="#dlg_4-buttons">
			<div data-options="region:'center'">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td valign="top">
							<div style="height: 25px;margin-top: 10px;">
								<div class="fll ml10" style="font-size: 12px;width: 230px;">
									姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名： <input
										type="text" id="module_username"
										style="width:131px;height: 20px;" class="easyui-validatebox"
										data-options="required:true" />
								</div>
								<div class="fll ml10" style="font-size: 12px;width: 230px;">
									手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机： <input
										type="text" id="module_phone"
										style="width:131px;height: 20px;" class="easyui-validatebox"
										data-options="required:true" validType="length[11,11]"
										missingMessage="请输入有效的手机号码" />
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top">
							<div style="height: 25px;margin-top: 10px;">
								<div class="fll ml10" style="font-size: 12px;width: 230px;">
									邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱： <input
										type="text" id="module_email"
										style="width:131px;height: 20px;" class="easyui-validatebox" />
								</div>

								<div class="fll ml10" style="font-size: 12px;width: 230px;">
									应&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用 ： <select
										id='module_selN' style='width:120px;height: 20px;'>

									</select>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top">
							<div style="height: 25px;margin-top: 10px;">
								<div class="fll ml10" style="font-size: 12px;width: 230px;">
									状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态： <select
										id="module_user_state" style="width:131px;height: 20px;">
										<option value="1">启用</option>
										<option value="0">禁用</option>
									</select>
								</div>
							</div>
						</td>
					</tr>
				</table>
			</div>
			<div data-options="region:'south'" style="height: 40px;">
				<div class="fll ml10 btn_css01"
					style="margin-top:57px;margin-left: 215px;">
					<a href="javascript:void(0)" id="new_submit_btn">保存</a>
				</div>
				<div class="fll ml10 btn_css01"
					style="margin-top: 57px;margin-left: 10px;">
					<a href="javascript:void(0)" id="new_cancel_btn">关闭</a>
				</div>

			</div>

		</div>


		<!-- 新增模块 -->
		<div id="dlg_5" class="easyui-dialog"
			data-options="title:'新增',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
			style="width:400px;height:120px;padding:10px 20px" closed="true"
			buttons="#dlg_2-buttons">
			<div class="easyui-layout" data-options="fit:true">


				新增应用：<input type="text" id="new_module_name"
					style="width:131px;height: 20px;" class="easyui-validatebox"
					data-options="required:true" />

			</div>
			<div id="dlg_2-buttons">
				<a id="module_save_but" href="javascript:void(0)"
					class="easyui-linkbutton" iconCls="icon-save"
					onclick="modulesave()">保存</a> <a id="module_ce_but"
					href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-add" onclick="modulecancel()">取消</a>
			</div>
		</div>


		<!-- 修改模块联系人-->
		<div id="dlg_3" class="easyui-dialog"
			style="width:500px;height:270px;padding:10px 20px"
			data-options="title:'联系人',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
			buttons="#dlg_3-buttons">

			<input type="hidden" id="module_hiddenid"> <input
				type="hidden" id="table_id">
			<table
				style="margin-left:25px;border-collapse:separate; border-spacing:20px;">
				<tr>
					<td>姓名：<input id="moduleuser_name" type="text"
						class="easyui-validatebox" data-options="required:true"
						style="width:131px;height: 20px;" />
					</td>
					<td>电话：<input id="moduleuser_phone" type="text"
						class="easyui-validatebox" data-options="required:true"
						style="width:131px;height: 20px;" validType="length[11,11]"
						missingMessage="请输入有效的手机号码" />
					</td>
				</tr>
				<tr>
					<td>应用：<span id="module_name1"
						type="width:131px;height: 20px;"></span></td>
					<td>邮箱：<input id="module_email1" type="text"
						data-options="required:true" style="width:131px;height: 20px;" />
					</td>
				</tr>
			</table>

			<div id="dlg_3-buttons">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-ok" onclick="confirm_savebut()">确定</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-cancel"
					onclick="javascript:$('#dlg_3').dialog('close')">取消</a>
			</div>

			<!-- 常见问题详情对话框 -->
			<div id="dlg_comque" class="easyui-dialog"
				data-options="title:'新增',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
				style="width:600px;height:400px;padding:10px 20px" closed="true">
				<div class="easyui-layout" data-options="fit:true">

					<div class="ftitle" style="height:20px;">
						<label> 发布者: </label> <span id="d_a"
							style="font-weight: normal;margin-top:10px;"></span>
					</div>
					<div class="ftitle" style="height:20px;">
						<label>发布时间：</label> <span id="d_b"
							style="font-weight: normal;margin-top:10px;"></span>
					</div>
					<div class="ftitle" style="height:40px;">
						<label>标题:</label> <span id="d_c"
							style="font-weight: normal;margin-top:10px;overflow:auto;"></span>
					</div>

				<div style="padding: 5px 0;margin-bottom: 10px;font-size: 14px;border-bottom: 1px sold #ccc;">
					<label style="font-weight: bold;font-weight: bold;">内容：</label>
					<div   class="chque"  id="d_d" style="overflow:auto;height:210px;text-indent:2.5em;"> 
					
					</div>
					
					
					</div>
				</div>
			</div>	

			<!--新增常见问题对话框 -->
			<div id="dlg_addcom" class="easyui-dialog"
				style="width:700px;height:550px;padding:10px 20px;top:1px"
				data-options="title:'新增',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
				buttons="#dlg-buttons1">
				<div class="ftitle">常见问题</div>
				<div class="fitem" style="height:25px;">
					<label>标题：</label> <input id="Title" name="Title"
						class="easyui-validatebox" required="true"
						style="width: 178px;height: 18px;" /> <br />
				</div>
			<!--<div class="fitem" style="height:25px;">
					<label>应用</label> <input id="module_selcom" name="Title"
						class="easyui-validatebox" required="true"
						style="width: 178px;height: 18px;" />
				</div>-->
				<div class="fitem" style="height:25px;">
					<label>状态</label> <select id="module_com_state"
						style="width:131px;height: 20px;">
						<option value="1">启用</option>
						<option value="0">禁用</option>
					</select>
				</div>


				<div class="fitem" style="height:120px;margin-top:10px">
					<label style="height:30px;">内容：</label>
					<textarea name="Context" id="myEditor">这里写你的初始化内容</textarea>
					<script type="text/javascript">
                                   var editor = new UE.ui.Editor();
                                   editor.render("myEditor");                               
                                   </script>
				</div>
				<div id="hiden_one" style="display:none"></div>

			</div>

			<div id="dlg-buttons1">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-ok" onclick="add_que()">提交</a>
			</div>
			
			<!-- 修改常见问题对话框 -->
			<div id="chdlg_addcom" class="easyui-dialog"
				style="width:700px;height:550px;padding:10px 20px;top:1px"
				data-options="title:'修改',maximizable:true,minimizable:true,iconCls:'icon-save',resizable:true,modal:true,closed:true"
				buttons="#dlg-buttonsch">
				<div class="ftitle">常见问题</div>
				<div class="fitem" style="height:25px;">
					<label>标题：</label> <input id="chTitle" name="Title"
						class="easyui-validatebox" required="true"
						style="width: 178px;height: 18px;" /> <br />
				</div>
			<!--/tydic-bi-portal3.0/WebRoot/pages/sys/suggestions/base.jsp
			<div class="fitem" style="height:25px;">
					<label>应用</label> <input id="chmodule_selcom" name="Title"
						class="easyui-validatebox" required="true"	style="width: 178px;height: 18px;" />			
			</div>-->
				<div class="fitem" style="height:25px;">
					<label>状态</label> <select id="chmodule_com_state"
						style="width:131px;height: 20px;">
						<option value="1">启用</option>
						<option value="0">禁用</option>
					</select>
				</div>


				<div class="fitem" style="height:120px;margin-top:10px">
					<label style="height:30px;">内容：</label>
					<textarea name="Context" id="chmyEditor">这里写你的初始化内容</textarea>
                                 <script type="text/javascript">
                                   var editor_1 = new UE.ui.Editor();
                                   editor_1.render("chmyEditor");                               
                                   </script>
				</div>
				<div id="chhiden_one" style="display:none"></div>
				<input id="chid" 	style="display:none" />

			</div>

			<div id="dlg-buttonsch">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-ok" onclick="chadd_que()">提交</a>
			</div>
			
			
			


<!-- <script type="text/javascript">
			
			
			function chadd_que(){
				$.messager.confirm("确认", "您确定修改该条记录？", function(r){
				 var img=editor_1.getContent();
				 var chid=$("#chid").val();
				 
				 var date=new Date();
			// var datemm="";
			//	 if((parseInt(date.getMonth())+1)<10){
			//		datemm="0"+(parseInt(date.getMonth())+1).toString();
				//	} else{
			//		datemm=(parseInt(date.getMonth())+1).toString();
				//	}
			  	// var savedir=date.getFullYear()+"/"+datemm+"/"+date.getDate();
			  	var savedir=date.getFullYear()+"/"+(parseInt(date.getMonth())+1).toString()+"/"+date.getDate();
				  var suggestion=$.trim($("#chTitle").val()) ;
				 if(suggestion==""){
					 $.messager.alert('我的消息', "标题不能为空！", 'info');
					 return ;
				 }
				 if(suggestion.length>50){
					 $.messager.alert('我的消息', "标题不能超过50个字！", 'info');
					 return ; 
				 }
				var url3=""; 
			    var url1="";
			    if(img!=""){	 
			   	$("#chhiden_one").html(img);
			   	//图片处理
			   	var src="";
			   	var s="";
			   	var arry = new Array();	
			   	$("#chhiden_one img").each(function(i){
			   		if($(this).attr("src").indexOf("suggestion") <0 ){
			   			//如果包含子串，则返回大于等于0  如果没有包含，否则返回-1			   			
			   			arry[i]=$(this).attr("src");
			   		}   			   		
			   	})
			   	console.log($("#chhiden_one img").size());
			   	$("#chhiden_one img").each(function () {
			   		
			   		if($(this).attr("src").indexOf("suggestion") <0 ){
			   		 src = $(this).attr("src");
			   		 s=src.substring(26);
			   		 $(this).attr("src","http://61.188.4.139/upload/suggestion/"+savedir+s);
			   		} 			           
			           
			       // url3=url3+src+",";//s3是当前图片存在的位置	    	  			          
			       // $(this).attr("src",s);
			          $(this).attr("width","100%");         
			      });
			 
			   	img=$("#chhiden_one").html();
			    } 
				$.ajax({
					url : "/syssuggestionController/chSuggestionCommon",
					dataType: "json",
					traditional:"true",
					type: "POST", 
				    contentType: "application/x-www-form-urlencoded; charset=utf-8",
					data : {
						"state":$("#chmodule_com_state").find("option:selected").text(),
					//  "module":$('#chmodule_selcom').combobox('getText'),
						"img": img,
						"ID":chid,//问题Id
						"suggestion":suggestion,
						"arryurl":arry, //图片上传地址
				//		"url3":src//当前图片存放的位置
					},
					success : function(data) {
						$.messager.alert('我的消息', "修改成功！", 'info');		
						getUpData("#tt1");
					
					},
					error : function(data) {
						$.messager.alert('我的消息', "修改出错！", 'info');
					}
				});	
				});
			} 	
			

						

 function add_que(){
	  var img=editor.getContent();
	//  var datemm="";
	  var suggestion=$.trim($("#Title").val()) ;
	 var date=new Date();
	//if((parseInt(date.getMonth())+1)<10){
	//	datemm="0"+(parseInt(date.getMonth())+1).toString();
	//} else{
	//	datemm=(parseInt(date.getMonth())+1).toString();
	//}
  //	 var savedir=date.getFullYear()+"/"+datemm+"/"+date.getDate();
  var savedir=date.getFullYear()+"/"+(parseInt(date.getMonth())+1).toString()+"/"+date.getDate();
	 if(suggestion==""){
		 $.messager.alert('我的消息', "标题不能为空！", 'info');
		 return ;
	 }
	 if(suggestion.length>50){
		 $.messager.alert('我的消息', "标题不能超过50个字！", 'info');
		 return ; 
	 }
	var url3=""; 
    if(img!=""){	 
   	$("#hiden_one").html(img);
   	//图片处理
   	var src="";
   	var s="";
   	var arry = new Array();	
   	$("#hiden_one img").each(function(i){
   		arry[i]=$(this).attr("src");
   		
   	})
   	$("#hiden_one img").each(function () {
            src = $(this).attr("src");
           
            s=src.substring(26);
       	   url3=url3+src+",";//s3是当前图片存在的位置   
          $(this).attr("src","http://61.188.4.139/upload/suggestion/"+savedir+s);
          // $(this).attr("src",s);
          $(this).attr("width","100%");         
      });
 
   	
   	
   	img=$("#hiden_one").html();
    } 
	$.ajax({
		url : "/syssuggestionController/addSuggestionCommon",
		dataType: "json",
		traditional:"true",
		type: "POST", 
	    contentType: "application/x-www-form-urlencoded; charset=utf-8",
		data : {
			"state":$("#module_com_state").find("option:selected").text(),
			//"module":$('#module_selcom').combobox('getText'),
			"img": img,
			"suggestion":suggestion,
			"arryurl":arry//图片上传地址
			//"url3":src//当前图片存放的位置
		},
		success : function(data) {
			$.messager.alert('我的消息', "添加成功！", 'info');		
			getUpData("#tt1");
		
		},
		error : function(data) {
			$.messager.alert('我的消息', "添加出错！", 'info');
		}
	});	
} 
			
			
			
			
			
			

//模块修改弹出框
function change(id){
	var id="#"+id;
  	var row = $(id).datagrid("getSelected");
  	if (!row){
  		$.messager.alert('我的消息', "请选择一条记录进行操作！", 'info');
  		return;
  	}
 if(id=="#tt2"){
	 $("#moduleuser_name").val(row.USERNAME);
		$("#moduleuser_phone").val(row.PHONE);
	  	$("#module_name1").html(row.MODULE_NAME);
	  	$("#module_email1").val(row.EMAIL);
	  	$("#module_hiddenid").val(row.ID);
	  	$("#table_id").val("#tt2");  	
		$("#dlg_3").window("open");
	 
 }if(id=="#tt1"){
	 getcombobox("#chmodule_selcom"); 
	 $('#chmodule_selcom').combobox('select', row.MODULE_NAME);
	 $("#chTitle").val(row.SUGGESTION);
	 var ss= document.getElementById('chmodule_com_state');
	 if(row.STATE==1){
		 ss[0].selected = true;//选中 
	 }
	 if(row.STATE==0){
		 ss[1].selected = true;//选中 
	 }
	 $("#chid").val(row.ID);
	 var reply="";
	 if( typeof(row.REPLY) == "undefined"){
		 reply="  ";
	 }else{
		 reply=row.REPLY;
	 }
	 $("#chmyEditor").val(reply);
	  editor_1.setContent(reply);

	  $('#chdlg_addcom').dialog(
				  {
					  onOpen:function(){
						  $(".window-mask").css("z-index","800");
						  $(".panel").css("z-index","900");
						  $(".window-shadow").css("z-index","899");
					  }, 
				      onMove:function(left,top){ 
				    	  $(".window-mask").css("z-index","800");
						  $(".panel").css("z-index","900");
						  $(".window-shadow").css("z-index","899");
				      },
				      onResize:function(width,height){
				    	  $(".window-mask").css("z-index","800");
						  $(".panel").css("z-index","900");
						  $(".window-shadow").css("z-index","899");
				      }
				  });
			
		  $('#chdlg_addcom').dialog('open').dialog('setTitle','修改问题');
	  
	  
	  
	  
	  
	// $("#chdlg_addcom").window("open");
	 
 }
	

}

function confirm_savebut(){	
	var USERNAME=$("#moduleuser_name").val();
  	if (!USERNAME){
		$.messager.alert('我的消息', "请填写姓名！", 'info');
		return;
	}
  	var PHONE=$("#moduleuser_phone").val();
	if (!PHONE){
		$.messager.alert('我的消息', "请输入有效的手机号码！", 'info');
		return;
	}
	
  	var module_email=$("#module_email1").val();
  	var module_hiiddenid=$("#module_hiddenid").val();
  	var tableid=$("#table_id").val();
  	$.ajax({
		url : "/syssuggestionController/ChModuleuser",
		dataType: "json",  
		type: "POST", 
	    contentType: "application/x-www-form-urlencoded; charset=utf-8",
		data : {
			"USERNAME":USERNAME,
			"PHONE":PHONE,
			"module_email":module_email,
			"module_hiiddenid":module_hiiddenid
		},
		success : function(data) {
			$.messager.alert('我的消息', "修改成功！", 'info');
			getUpData(tableid);
		
		},
		error : function(data) {
			$.messager.alert('我的消息', "修改出错！", 'info');
		}
  		
  		
  		
  	})
  	
	
}



function modulesave(){
	var module_name=$("#new_module_name").val();
	var id="#tt2";
	if (!module_name){
		$.messager.alert('我的消息', "填写应用名再保存！", 'info');
		return;
	}
	
	$.ajax({
		url : "/syssuggestionController/addmodule",
								dataType : "json",
								type : "POST",
								contentType : "application/x-www-form-urlencoded; charset=utf-8",
								data : {
									"module_name" : module_name
								},
								success : function(data) {
									$.messager.alert('我的消息', "添加成功！", 'info');
									getUpData(id);

								},
								error : function(data) {
									$.messager.alert('我的消息', "添加出错！", 'info');
								}
							});

				}

function modulecancel() {
					$("#dlg_5").window("close");
				}

				//新增联系人

$("#new_submit_btn").bind("click",function() {

									var module_username = $("#module_username")
											.val();
									if (!module_username) {
										$.messager.alert('我的消息', "请填写姓名！",
												'info');
										return;
									}

									var module_phone = $("#module_phone").val();
									if (!module_phone) {
										$.messager.alert('我的消息', "请填写手机号码！",
												'info');
										return;
									}

									var module_email = $("#module_email").val();

									var module_selN = $('#module_selN')
											.combobox('getText');
									if (!module_selN) {
										return;
									}
									var module_user_state = $(
											"#module_user_state").val();
									if (!module_user_state) {
										$.messager.alert('我的消息', "请选择用户状态！",
												'info');
										return;
									}
									$.ajax({
										url :"/syssuggestionController/moduleuser",
												dataType : "json",
												type : "POST",
												contentType : "application/x-www-form-urlencoded; charset=utf-8",
												data : {
													"module_username" : module_username,
													"module_selN" : module_selN,
													"module_phone" : module_phone,
													"module_email" : module_email,
													"module_user_state" : module_user_state
												},
												success : function(data) {
													$.messager.alert('我的消息',
															"添加成功！", 'info');
													getUpData("#tt2");

												},
												error : function(data) {
													$.messager.alert('我的消息',
															"添加出错！", 'info');
												}
											});

								});
				$("#new_cancel_btn").bind("click", function() {
					$("#dlg_4").window("close");
				});
			</script>
-->
		</div>
</body>
</html>
