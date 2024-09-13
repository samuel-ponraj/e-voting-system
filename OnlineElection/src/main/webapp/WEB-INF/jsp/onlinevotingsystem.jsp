<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting System</title>
<style>
	html{
		background: url('e-voting.jpg') no-repeat center center fixed;
		background-size: cover;
	}
	
	h1{
		color: white;
		font-size: 25px;
	}
	
	p{
		color: white;
	}
	
	a{
		text-decoration: none;
		color:rgb(8, 103, 210);
		font-weight:500;
		
	}
	
	.container{
		width:50%;
		height:90vh;
		display: flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		
		
	}
	form{
		padding: 20px;
		display: flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		gap:20px;
		
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
	
	button{
		height:34px;
		width: 100px;
		color: white;
		background: rgb(8, 103, 210);
		box-shadow: 2px 2px 4px rgba(25, 25, 25, 0.3);
		cursor: pointer;
		border: none;
		border-radius: 10px;
	}
	
</style>


</head>
<body>

	<div class="container">
	<h1>E-VOTING SYSTEM</h1>
	<div class="box">
	<form action="login" method="post">
	<div>
		<input type="text" id="username" name="username" Placeholder="User Name" required/>
	</div>
	<div>
		<input type="text" name="password" Placeholder="Password" required/>
	</div>
	<div>
		<button class="login-btn" type="submit" name="login" value="Login">Login</button>
	</div>
	</form>
	
	<div>
	<p>Not registered? <a href="/register">Create an account</a></p>
	</div>
	</div>
	</div>
	
	
</body>
</html>