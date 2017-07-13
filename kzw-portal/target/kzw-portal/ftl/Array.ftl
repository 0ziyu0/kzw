<html>
	<head>
		<title>${title}</title>
	</head>
	
	<body>
		<label>学号:</label>${student.id}</br>
		<label>姓名:</label>${student.name}</br>
		<label>住址:</label>${student.address}</br>		
	</body>
	
	<div>this is Array List </div>
	
	</br></br></br></br>
	
	<#list students as stu>
		<label>num:</label>${stu_index}</br>
		<label>id:</label>${stu.id}</br>
		<label>name:</label>${stu.name}</br>
		<label>address:</label>${stu.address}	</br>
	</#list>
	
<html>




















