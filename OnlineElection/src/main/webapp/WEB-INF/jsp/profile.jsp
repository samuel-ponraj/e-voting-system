<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="java.util.List" %>
      
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
		margin-top:-20px;
		display: flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
	}
	
	.key{
		color: white;
	}
	
	input{
		width: 200px;
		border-radius:5px;
		padding: 10px;
		border: none;
		box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3); 
	}
	
	input:focus {
		  outline: none;
		}
	
	form{
		width: auto;
		padding: 30px;
		display: grid;
		grid-template-columns: 1fr 1fr;
		align-items:center;
		justify-content:center;
		gap:20px;
		border-radius:15px;
		background: rgba(255, 255, 255, 0.3); 
  		box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
  		
		
	}
	
	.reg-btn{
		margin-top: 20px;
		width: 100px;
		color: white;
		background: rgb(8, 103, 210);
		box-shadow: 2px 2px 4px rgba(25, 25, 25, 0.3);
		cursor: pointer;
		border: none;
		display:grid;
		grid-column-start:1;
		grid-column-end:2;
	}
	</style>
	

</head>
<body>
<jsp:include page="UserPage.jsp"/>
	<div class="container">
	<h1>MY PROFILE</h1>
	<div class="reg-box">
	<form action="/updateprofile" method="post">
	 
	<div class="key">ID</div>
	<div><input type="text" name="first_name" value="${user.id}" readonly/></div>
	 
	<div class="key">First Name</div>
	<div><input type="text" name="first_name" value="${user.first_name}"/></div>
	
	<div class="key">Last Name</div>
	<div><input type="text" name="last_name" value="${user.last_name}"/></div>
	
	<div class="key">User Name</div>
	<div><input type="text" name="username" value="${user.username}"/></div>
	
	<div class="key">Password</div>
	<div><input type="text" name="password" value="${user.password}"/></div>
	
	<div class="key">Date of Birth</div>
	<div><input type="text" name="dob" value="${user.dob}"/></div>
	
	<div class="key">Mobile number</div>
	<div><input type="text" name="mobile_no" value="${user.mobile_no}"/></div>
	
	<div class="key">Gender</div>
	<div><input type="text" name="gender" value="${user.gender}"/></div>
	
	<div class="key">
	<input class="reg-btn" type="submit" name="updateprofile" value="Update"/>
	</div>
	</form>
	
	</div>
	</div>
</body>
</html>