<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<style>
#firstname, #lastname, #email, #phone, #birthdate, #register {
	width: 50%;
}

form .error {
	color: #ff0000;
}
</style>

<title>Please fill out the form to register.</title>

</head>

<body>
	<div class="container">
		<h2>Please fill out the form to register.</h2>

		<form action="add" name="registration" method="post">
			<!-- First Name -->
			<label for="firstname">First Name</label><br> <input type="text"
				id="firstname" name="firstname" placeholder="First Name" required></input><br><br>

			<!-- Last Name -->
			<label for="lastname">Last Name</label><br> <input type="text"
				id="lastname" name="lastname" placeholder="Last Name" required></input><br><br>

			<!-- Email -->
			<label for="email">Email</label><br> <input type="email"
				id="email" name="email" placeholder="Email" required></input><br><br>

			<!-- Phone Number -->
			<label for="phone">Phone Number</label> <br><input
				type="text" id="phone" name="phone" placeholder="###-###-####" required></input><br><br>
			<!-- TODO: Add validation for phone number; show error message... -->
			<!-- DOB -->
			<label for="birthdate">Date of Birth</label><br> <input
				type="date" id="birthdate" name="birthDate" required></input><br><br>
			<!-- TODO: Show error message if date of birth is not provided. -->

			<!-- Create rule for gender that prevents a user from registering if no radio button option is chosen. -->
			<!-- Gender -->
			<label for="gender">Gender</label><br><input type="radio"
				name="userGender" value="OTHER" required>Other <input
				type="radio" name="userGender" value="FEMALE">Female
			<input type="radio" name="userGender" value="MALE">Male<br><br>

			<!-- Submit Button -->
			<button type="submit">Register</button>
		</form>
	</div>
	<!-- JavaScript Code -->
	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script type="text/javascript" src="js/form-validation.js"></script>

</body>
</html>