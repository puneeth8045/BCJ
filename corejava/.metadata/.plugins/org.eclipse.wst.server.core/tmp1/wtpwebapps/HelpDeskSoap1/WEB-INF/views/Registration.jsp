<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
footer {
	position: relative;
	bottom: 0;
	width: 100%;
	   height: 60px;
	background-color: #555;
	color: white;
	padding: 15px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="TicketManagement">Ticket Management</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="registration"><span
					class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
		</ul>
	</div>
	</nav>


	<form id="regForm" modelAttribute="register"
		action="registrationprocess" method="post" class="form-horizontal">
		<div class="container">
			<div class="jumbotron">
				<h2>Personal details</h2>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="firstName">Firstname:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="firstName" name="firstName" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="lastName">Lastname:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="lastName" name="lastName" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="email" name="email" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="phnNo">PhoneNumber:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="phnNo" name="phnNo" required>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="jumbotron">
				<h2>Address</h2>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="address.addressLine1">AddressLine1:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="address.addressLine1" name="address.addressLine1" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="address.addressLine2">AddressLine2:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="address.addressLine2" name="address.addressLine2" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="address.city">City:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="address.city" name="address.city" required>
				</div>
			</div>
			<div class="form-group">
				<fieldset>
					<label class="control-label col-sm-2" for="state">State:</label>
					<div class="col-sm-3">
						<select class="form-control" id="address.state" name="address.state" required>
							<option>-------------------------------</option> ${stateData}
						</select>
					</div>
				</fieldset>
			</div>



			<div class="form-group">
				<label class="control-label col-sm-2" for="address.zipCode">ZipCode:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="address.zipCode" name="address.zipCode" required>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="jumbotron">
				<h2>Login Details</h2>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="login.username">Username:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="login.username" name="login.username" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="login.password">Password:</label>
				<div class="col-sm-3">
					<input type="password" class="form-control" id="login.password" name="login.password" required>
				</div>
			</div>
			<div class="form-group">
				<fieldset>
					<label class="control-label col-sm-2" for="login.usertype">Usertype:</label>
					<div class="col-sm-3">
						<select class="form-control" id="login.usertype" name="login.usertype" required>
							<option>-------------------------------</option> ${usertype}
						</select>
					</div>
				</fieldset>
			</div>
		</div>

		<div class="container">
			<input type="submit" class="btn btn-info" name="register"
				value="Register">
		</div>

	</form>
	<br>
	<br>
	<footer class="container-fluid bg-4 text-center">
	<p>Ektha Solutions</p>
	</footer>
</body>
</html>