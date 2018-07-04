<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Tangerine">

<title>Welcome to GC Coffee!</title>
</head>

<body>
	<div class="container">
		<h1>Welcome to GC COFFEE!</h1>
		<form id="login" action="login" method="post">
			<!-- User Name -->
			<label for="username"></label><input type="text"
				name="emailaddress" placeholder="Email Address" required></input>
			<!-- Password -->
			<label for="password"></label><input type="password"
				name="pword" placeholder="Password" required></input> <input
				type="submit" value="Login"></input>
		</form>
		<a href="/registration">Need to register? Please click here.</a> <br> <br>
		<div class="container">
			<form id="search" action="search" method="post">
				<input type="text" name="name"> <input type="submit"
					value="Search"><br>
			</form>
			<br>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					<tr>
						<td>${item.name}</td>
						<td>${item.description}</td>
						<td>$${item.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>