<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="/css/reset.css" type="text/css" rel="stylesheet">
<link href="/css/main.css" type="text/css" rel="stylesheet">
<link href="/css/uikit.css" type="text/css" rel="stylesheet">
<link href="/css/taotao.css" type="text/css" rel="stylesheet">
<link href="/css/components/upload.css" type="text/css" rel="stylesheet">
<link href="/css/components/form-advanced.css" type="text/css" rel="stylesheet">

<script type="text/javascript" charset="utf-8" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/uikit.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/components/upload.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/components/lightbox.js"></script>

<div id="info">

                  <table class="uk-table uk-table-hover" hidden>
                   <thead>
                        <tr>
                          	<th class="uk-text-center"></th>
                            <th class="uk-text-center">类别</th>
                            <th class="uk-text-center">名称</th>
                            <th class="uk-text-center">数量</th>
                        </tr>
                    </thead>
               
                  <tbody>
                   		<%-- <c:forEach items="${list.strategyVoLists }" var="strategyVoLists">
                        	<tr>
                        		<td class="uk-text-center">${strategyVoLists.strategy.way }</td>
                        		<td class="uk-text-center">${strategyVoLists.strategy.sex }</td>
                        		<td class="uk-text-center">${strategyVoLists.strategy.dong }</td>
                        		<td class="uk-text-center">${strategyVoLists.strategy.floor }</td>
                           </tr>
                    	</c:forEach> --%>
                 </tbody>
                   </table>
                   <div id ="time">
                  <table class="uk-table uk-table-hover" hidden>
                    <thead>
                        <tr>
                          	
                        </tr>
                    </thead>
               
                  <tbody>
                  <c:forEach items="${list.strategyVoLists }" var="strategyVoLists">

                        	<tr>
                        <c:forEach items="${strategyVoLists.timesList }" var="timesList">
                        		<td class="uk-text-center">${timesList.endTime }</td>
						</c:forEach>  
                            </tr>
                            </c:forEach>
                    </tbody>
                   </table>
				</div>
</div>

<div style="width:795px;float:left;overflow:hidden;">
	<h3 id="times">店铺策略</h3> <hr/>
	<form id="strategyFrom" class="uk-form" method="post">
	<input type="text" class="hide" name="storeId" value="${storeId }"/>
		<!-- c配送方式:&nbsp;&nbsp;&nbsp;易贷</label>
    	<input type="radio" id="select1" onchange="select1_onchange(this);" value="易贷" name="strategy.way"/>    
    		   &nbsp; &nbsp;  自定义<input type="radio" id="select2" onchange="select2_onchange(this);" value="自定义" name="strategy.way"/><br/><br/>
    		      
    	红蓝区<input type="text" name="strategy.area"/><br/>
    	<div id="yidai1">
    	性    别：&nbsp;&nbsp;全部<input id="sex_all" type="radio" value="全部" name="strategy.sex"/> 
    		     &nbsp;&nbsp;  男<input id="sex_boy" type="radio" value="男" name="strategy.sex"/> 
    		     &nbsp;&nbsp;  女<input id="sex_girl" type="radio" value="女" name="strategy.sex"/><br/><br/>
    		       
    	服务对象：&nbsp;&nbsp;全校<input id="dong_all" type="radio" value="全校" name="strategy.dong"/> 
    		      &nbsp;&nbsp; 本栋<input id="dong_one" type="radio" value="本栋" name="strategy.dong"/><br/><br/>
		</div>
		  	<div id="yidai2">	       
    	配送范围：&nbsp;到寝室&nbsp;<input id="floor_qs" type="radio" value="到寝室" name="strategy.floor"/> 
    		      &nbsp;  到楼栋&nbsp;<input id="floor_ld" type="radio" value="到楼栋" name="strategy.floor"/><br/><br/>
    	</div> --> 
			<label class="uk-form-label uk-form-stacked" for="">	开店时间：</label>
			<table class="uk-table">
                <tbody>
                  <tr>
                     <td class="uk-text-large">07-08:&nbsp;<input id="8" type="checkbox" name="timesList[0].beginTime" value="7"/></td>
                     <td class="uk-text-large">08-09:&nbsp;<input id="9" type="checkbox" name="timesList[1].beginTime" value="8"/></td>
                     <td class="uk-text-large">09-10:&nbsp;<input id="10" type="checkbox" name="timesList[2].beginTime" value="9"/></td>
                  </tr>
                  <tr>
                     <td class="uk-text-large">10-11:&nbsp;<input id="11" type="checkbox" name="timesList[3].beginTime" value="10"/></td>
                     <td class="uk-text-large">11-12:&nbsp;<input id="12" type="checkbox" name="timesList[4].beginTime" value="11"/></td>
                     <td class="uk-text-large">12-13:&nbsp;<input id="13" type="checkbox" name="timesList[5].beginTime" value="12"/></td>
                  </tr>                                                                                      
                  <tr>                                                                                       
                     <td class="uk-text-large">13-14:&nbsp;<input id="14" type="checkbox" name="timesList[6].beginTime" value="13"/></td>
                     <td class="uk-text-large">14-15:&nbsp;<input id="15" type="checkbox" name="timesList[7].beginTime" value="14"/></td>
                     <td class="uk-text-large">15-16:&nbsp;<input id="16" type="checkbox" name="timesList[8].beginTime" value="15"/></td>
                  </tr>
                  <tr>
                     <td class="uk-text-large">16-17:&nbsp;<input id="17" type="checkbox" name="timesList[9].beginTime" value="16"/></td>
                     <td  class="uk-text-large">17-18:&nbsp;<input id="18" type="checkbox" name="timesList[10].beginTime" value="17"/></td>
                     <td class="uk-text-large" > 18-19:&nbsp;<input id="19" type="checkbox" name="timesList[11].beginTime" value="18"/></td>
                  </tr>
                  <tr>
                     <td class="uk-text-large">19-20:&nbsp;<input id="20" type="checkbox" name="timesList[12].beginTime" value="19"/></td>
                     <td class="uk-text-large">20-21:&nbsp;<input id="21" type="checkbox" name="timesList[13].beginTime" value="20"/></td>
                     <td class="uk-text-large">21-22:&nbsp;<input id="22" type="checkbox" name="timesList[14].beginTime" value="21"/></td>
                  </tr>
                  <tr>
                     <td class="uk-text-large">22-23:&nbsp;<input id="23" type="checkbox" name="timesList[15].beginTime" value="22"/></td>
                     <td class="uk-text-large">23-07:&nbsp;<input id="24" type="checkbox" name="timesList[16].beginTime" value="23"/></td>
                  </tr>
           </tbody>
       </table>

    	服务周期：&nbsp;星期一&nbsp;<input id="xq1" onClick="clickInfo(1);" type="radio" value="星期一" name="strategy.other"/> 
    		      &nbsp;  星期二&nbsp;<input onClick="clickInfo(2);" type="radio" value="星期二" name="strategy.other"/> 
    		       &nbsp; 星期三&nbsp;<input onClick="clickInfo(3);" type="radio" value="星期三" name="strategy.other"/> 
    		     &nbsp;   星期四&nbsp;<input onClick="clickInfo(4);" type="radio" value="星期四" name="strategy.other"/> 
    		     &nbsp;   星期五&nbsp;<input onClick="clickInfo(5);" type="radio" value="星期五" name="strategy.other"/> 
    		   &nbsp;     星期六&nbsp;<input onClick="clickInfo(6);" type="radio" value="星期六" name="strategy.other"/> 
    		     &nbsp;   星期日&nbsp;<input onClick="clickInfo(7);" type="radio" value="星期日" name="strategy.other"/> <br/><br/>
    	
    	<input  class="uk-button uk-button-primary" type="button" onclick="submitForm()" value="提交"/>
    </form>
</div>


<script>
	function getD1(){
		// 获取当前时间
		var date = new Date();
		// 格式化时间
		var d1 = date.toLocaleString();
		// 获取div 
		var div1 = document.getElementById("times");
		var day = date.getDay();
		if(day == 0) {
			day = 7;
		}
		div1.innerHTML = "店铺策略 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + d1 + "&nbsp&nbsp&nbsp&nbsp" + "星期" + day; 
	}
	setInterval("getD1();",1000);
	
	$(document).ready(function(){
		 
		$("#xq1").attr('checked','true');
		clickInfo(1);

		
		});

	function clickInfo(i) {
		i = i - 1;
		var str =  $("#info tr:gt("+i+")").find("td").eq(0).html();
		 if(str == "易贷") {
			 $("#select1").prop('checked','true');
				var select1 = $('#yidai1');
				var select2 = $('#yidai2');
				select1.hide();
				select2.hide();
		 } else if (str == "自定义"){
			 $("#select2").prop('checked','true');
				var select1 = $('#yidai1');
				var select2 = $('#yidai2');
				select1.show();
				select2.show();
				
				var sex =  $("#info  tr:gt("+i+")").find("td").eq(1).html();
				if(sex == "男") $('#sex_boy').prop('checked','true');
				if(sex == "女") $('#sex_boy').prop('checked','true');
				if(sex == "全部") $('#sex_boy').prop('checked','true');
				
				var dong =  $("#info  tr:gt("+i+")").find("td").eq(2).html();
				if(dong == "全校") $('#dong_all').prop('checked','true');
				if(dong == "本栋") $('#dong_one').prop('checked','true');
				
				var dong =  $("#info  tr:gt("+i+")").find("td").eq(3).html();
				if(dong == "到楼栋") $('#floor_ld').prop('checked','true');
				if(dong == "到寝室") $('#floor_qs').prop('checked','true');

				
		 }
		 
		 $("input[type='checkbox']").each(function(){
			   $(this).prop("checked",false);
			  });
		 
		 $("#time tr:gt("+i+"):eq(0) td").each(function () {
		   
		        var num = $(this).text();
		        $("#"+num+" ").prop('checked','true');
		 });
	}

		function select1_onchange(obj) {
			var select1 = $('#yidai1');
			var select2 = $('#yidai2');
			select1.hide();
			select2.hide();
		}
			function select2_onchange(obj) {
			var select1 = $('#yidai1');
			var select2 = $('#yidai2');
			select1.show();
			select2.show();
		}
			
		function submitForm(){
				// action="/store/updateStrategy"
				$.post("/store/updateStrategy",$("#strategyFrom").serialize(), function(data){
					if(data.status == 200){
						$.messager.alert('提示','策略修改成功!','info',function(){
							var t = $("#tabs");
							var mytab = t.tabs('getSelected');  // 获取选择的面板   
					        t.tabs('update', {   
					            tab: mytab,   
					            options: {   
					                title: '店铺策略',   
					                content: '/store/strategyList'  // 新内容的URL   
					            }   
					        });
						});
					}
				});
				
				
			}
  </script>










