<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	h1{
		color: white;
		font-size: 25px;
	}
	
	.container{
		
		display: flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;	
	}
	
</style>
</head>
<body>
	<jsp:include page="UserPage.jsp"/>
	<div class="container">
	<h1>You have successfully Voted!</h1>
	</div>
</body>
</html>