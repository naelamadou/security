<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>List User</title>
		
	</head>
	<body>
		<jsp:include page="../welcome.jsp"></jsp:include>
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>First Name</th>
						<th>Last NameD</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${users }" var="user">
					<tr>
						<td>${user.id } </td>
						<td>${user.firstName }</td>
						<td>${user.lastName }</td>
						<td>${user.email }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class = "container">
			<form action="admin" method="post">
				<div class="mb-3">
			    	<label for="exampleInputEmail1" class="form-label">First Name</label>
			    	<input type="text" name ="firstName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			  	</div>
			 	 <div class="mb-3">
			    	<label for="exampleInputEmail1" class="form-label">Last Name</label>
			    	<input type="text" name="lastName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			 	 </div>
			 	  <div class="mb-3">
			    	<label for="exampleInputEmail1" class="form-label">Email address</label>
			    	<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			 	 </div>
			 	  <div class="mb-3">
			    	<label for="exampleInputEmail1" class="form-label">Password</label>
			    	<input type="password" name="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			 	 </div>
		  		<button type="submit" class="btn btn-primary">Enregistrer</button>
			</form>
		</div>
			 
	</body>
</html>