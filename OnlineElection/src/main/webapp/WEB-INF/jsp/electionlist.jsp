
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page import="com.example.OnlineElection.Elections" %>
 <%@ page import="java.util.List" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Elections</title>
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
		padding: 20px;
		border-radius:15px;
		display:flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		height: auto; /* Remove fixed height to allow content to expand */
   		max-height: 400px; 
		background: rgba(255, 255, 255, 0.2); 
  		box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3); 
  		overflow-y: auto;
  		width:auto;
  		overflow: hidden;
	}
	
	
	
	table {
	
    width: 100%; /* Ensure table takes up full width of container */
    border-collapse: collapse;
   font-size: 15px;
   color: #0A2342;
    
	}
	
	th{
		color: white;
		font-size: 18px;
		text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.8);
		background: rgba(36,36,114, 0.3);
		
	}
	
	
	
	th, td {
	
	    padding: 10px;
	    border-bottom: 1px solid rgba(255, 255, 255, 0.2);
	    text-align: center;
	}
	
	.edit-btn , .delete-btn{
		width: 100px;
		color: white;
		background: rgb(8, 103, 210);
		box-shadow: 2px 2px 4px rgba(25, 25, 25, 0.3);
		cursor: pointer;
		border: none;
		padding: 5px 30px;
		border-radius: 10px;
	}
	
	
    
   
    
    </style>
</head> 
<body>
<jsp:include page="AdminPage.jsp"/>

	<div class="container">
    <h1>LIST OF ELECTIONS</h1>
    
    <div class="box">
    
    <table class="table">
        <thead>
            <tr>
            	<th>Election ID</th>
                <th>Election Name</th>
                <th>Date</th>
                <th>Edit</th>
                <th>Delete</th>
                
            </tr>
        </thead>
        <tbody>
     	 <% 
            // Assuming 'voters' is a List<Voters> attribute added to the request or session in your controller
            List<Elections> elections = (List<Elections>) request.getAttribute("elections");
            if (elections != null) {
                for (Elections election : elections) { 
            %>
                <tr>
                	<td><%= election.getId() %></td>
                    <td><%= (election.getName()).substring(0,1).toUpperCase() + (election.getName()).substring(1).toLowerCase() %></td>
                    <td><%= election.getDate() %></td>
                    
                    <td>
                        <a class="edit-btn" href="/editelection/<%= election.getId() %>">Edit</a>
                        
                    </td>
                    <td>
                        <a class="delete-btn" href="/deleteelection/<%= election.getId() %>">Delete</a>
                    </td>
                </tr>
             <% 
                } 
            } 
            %>
            
        </tbody>
    </table>
    </div>
    </div>
</body>
</html>
