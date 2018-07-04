<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous"></link>
<style>
#firstname, #lastname, #email, #phonenumber, #birthdate, #register {
	width: 50%;
}

form .error {
	color: #ff0000;
}
</style>
<title>Add Item</title>
</head>
<body>
	<div class="container">
		<h2>Add a New Item</h2>
		<form action="additem">
			Name<br><input type="text" name="name" placeholder="Name"></input><br><br>
			Description<br><input type="text" name="description" placeholder="Description"></input><br><br> 
			Quantity<br><input type="number" name="quantity" placeholder="Quantity"></input><br><br> 
			Price<br><input type="number" step="0.01" name="price" placeholder="Price"></input><br><br>
			<input type="submit" value="Submit"></input><br>
		</form>
	</div>
</body>
</html>