<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	html{
		background: url('e-voting-bg.jpg') no-repeat center center fixed;
		background-size: cover;
		padding:0;
		margin:0;
		box-sizing: border-box;
	}
	
	body{
	margin:0}
	
	.header{
		display: flex;
		justify-content: space-between;
		top:0;
		position: sticky;
		color:white;
		padding: 5px 30px;
		background-color: rgba(255, 255, 255, 0.05);
		box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5)
		
	}
	
	ul{
		display:flex;
		gap:30px
	}
	
	ul li{
		list-style: none;
	}
	
	a{
	text-decoration: none;
	color: white
	}
	
	h1{
	color: white}
	
	.admin-body{
	display: flex;
	flex-direction:column;
	align-items:center;
	justify-content:center;
	padding:40px;
	}
	
</style>


</head>
<body>
	<div class="admin-container">
	<div class="header">
	<p>Welcome Admin!</p>
	<ul>
		<li><a href="/userlist">User List</a></li>
		<li><a href="/addcandidate" role="button">Add Candidate</a></li>
		<li><a href="/candidatelist">Candidate List</a></li>
		<li><a href="/addelection">Add Election</a></li>
		<li><a href="/electionlist">Election List</a></li>
		<li><a href="/result">Result</a></li>	
	</ul>
	<p><a href="/onlinevotingsystem">Logout</a></p>
	</div>
	
	<div class=admin-body>
		
	</div>
	
	</div>
</body>
</html>