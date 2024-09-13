<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
.box{
		border-radius:15px;
		display:flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		height: 300px;
		background: rgba(255, 255, 255, 0.2); 
  		box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3); 
	}
	
	form{
		padding: 20px;
		display: flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		gap:20px;
		
	}
	
	input{
		width: 250px;
		border-radius:5px;
		padding: 10px;
		border: none;
		box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3); 
	}
	input:focus {
		  outline: none;
		}
	
	.save-btn{
		width: 100px;
		color: white;
		background: rgb(8, 103, 210);
		box-shadow: 2px 2px 4px rgba(25, 25, 25, 0.3);
		cursor: pointer;
		border: none;
	}
	
</style>

</head>
<body>
	<jsp:include page="AdminPage.jsp"/>
	<div class="container">
	<h1>EDIT ELECTION</h1>
	<div class="box">
		<form:form action="${pageContext.request.contextPath}/editelection/${election.id}" method="post" modelAttribute="election">
		<div>
			<input type="text" name="name" Placeholder="Election Name" required/>
		</div>
		<div>
			<input type="text" name="date" Placeholder="Election Date (yyyy-mm-dd)" required/>
		</div>
		<div>
			<input class="save-btn" type="submit" name="save" value="Update"/>
		</div>
		
	</form:form>	
	</div>
	</div>
		
</body>
</html>