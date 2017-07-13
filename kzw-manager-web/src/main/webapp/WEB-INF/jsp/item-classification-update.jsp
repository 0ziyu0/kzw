<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
</br></br>
</br></br>
	<span>&nbsp;&nbsp;&nbsp;&nbsp;分类id:</span>
	<input type="text" id="id" style="border:1px solid #95B8E7;"/>
	<input type="button" value="搜索" onclick="searchItem()"/>
	<input type="button" value="删除" onclick="deleteClassification()"/>
	
	</br></br>
	<span>&nbsp;&nbsp;&nbsp;分类名称:</span>
	<input type="text" id="name" style="border:1px solid #95B8E7;"/>
	<input type="button" value="修改" onclick="update()"/>
	
</br></br>
</br></br>
</br></br>
</br></br>
</div>
<script>

    // 搜索
    function searchItem(){
		
    	var id = $("#id").val();
    	if(id == null) {
    		alert("不能为空");
    	}
    	var url = "/classification/search?id=" + id;
		$.ajax({
      	    url : url,
      	    type: "GET",
      	    dataType: "json",
         	success : function(data) {
         		var name = data.data.name;
         		$("#name").val(name);
         	}
      	});
    }
    
    // 删除
    function deleteClassification(){
		
    	var id = $("#id").val();
    	if(id == null) {
    		alert("不能为空");
    	}
    	var url = "/classification/delete?id=" + id;
		$.ajax({
      	    url : url,
      	    type: "GET",
      	    dataType: "json",
         	success : function(data) {
         		if(data.status == 200) {
         			alert("删除成功...");
         		}
         	}
      	});
    }
    
   // 修改
   function update(){
	   var id = $("#id").val();
   		if(id == null) {
   			alert("id不能为空");
   		}
   		var name = $("#name").val();
   		if(name == null) {
   			alert("名称不能为空");
   		}
   		var url = "/classification/update?id=" + id + "&name=" + name;
		$.ajax({
     	    url : url,
     	    type: "GET",
     	    dataType: "json",
        	success : function(data) {
        		if(data.status == 200) {
        			alert("修改成功...");
        		}
        	}
     	});
    	
    	
    }
</script>



















