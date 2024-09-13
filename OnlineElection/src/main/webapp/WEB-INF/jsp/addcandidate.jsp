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
	
	.add-btn{
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
	<h1>ADD CANDIDATE</h1>
	<div class="box">
		<form action="/addcandidate" method="post">
		<div>
			<input type="text" name="first_name" Placeholder="First Name" required/>
		</div>
		<div>
			<input type="text" name="last_name" Placeholder="Last Name" required/>
		</div>
		<div>
			<input type="text" name="party_name" Placeholder="Party Name" required/>
		</div>
		<div>
			<input type="text" name="gender" Placeholder="Gender" required/>
		</div>
		<div>
			<input class="add-btn" type="submit" name="add" value="Save"/>
		</div>
		
		</form>
	</div>
	</div>
		
</body>
</html>