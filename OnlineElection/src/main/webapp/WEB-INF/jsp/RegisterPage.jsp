<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	html{
		background: url('e-voting.jpg') no-repeat center center fixed;
		background-size: cover;
	}
	h1{
		color: white;
		font-size: 30px;
	}
	.container{
		width:50%;
		height:90vh;
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
		width: 400px;
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
		grid-column-end:3;
		
	}


</style>
</head>
<body>

	<div class="container">
	<h1>REGISTRATION</h1>
	<div class="reg-box">
	<form action="/register" method="post">
	 
	<div class="key">First Name</div>
	<div><input type="text" name="first_name" Placeholder="Enter Fisrt Name"/></div>
	
	<div class="key">Last Name</div>
	<div><input type="text" name="last_name" Placeholder="Enter Last Name"/></div>
	
	<div class="key">User Name</div>
	<div><input type="text" name="username" Placeholder="Enter User Name"/></div>
	
	<div class="key">Password</div>
	<div><input type="text" name="password" Placeholder="Enter Password"/></div>
	
	<div class="key">Date of Birth</div>
	<div><input type="text" name="dob" placeholder="yyyy-mm-dd"/></div>
	
	<div class="key">Mobile number</div>
	<div><input type="text" name="mobile_no" Placeholder="Enter Mobile no"/></div>
	
	<div class="key">Gender</div>
	<div><input type="text" name="gender" Placeholder="Enter Gender"/></div>
	
	<div class="key">
	<input class="reg-btn" type="submit" name="usersave" value="SAVE"/>
	</div>
	</form>
	
	</div>
	</div>
</body>
</html>