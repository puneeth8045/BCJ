<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Create Ticket</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function change() {
		var val = document.getElementById('Category').value;
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (xhttp.readyState == 4 && xhttp.status == 200) {
				document.getElementById('subcategory').innerHTML = xhttp.responseText;
			}
		};
		xhttp.open("POST", "subcategory?valajax=" + val, true);
		xhttp.send();
	}
</script>
<style type="text/css">
footer {
	position: absolute;
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
			<li class="active"><a href="TicketManagement">Home</a></li>
			<li><a href="TicketManagement">Ticket Management</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout"><span
					class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
		</ul>
	</div>
	</nav>

	<form modelAttribute="Ticket" action="createticketprocess"
		method="post" class="form-horizontal" >
		<div class="container">
			<div class="jumbotron">
				<h2>Create Ticket</h2>
			</div>

			<div class="form-group">
				<fieldset>
					<label class="control-label col-sm-2" for="Category">Category:</label>
					<div class="col-sm-3">
						<select class="form-control" id="Category" name="Category"
							onchange="change()">
							<option>-------------------------------</option>
							 ${category}
						</select>
					</div>
				</fieldset>
			</div>

			<div class="form-group">
				<fieldset>
					<label class="control-label col-sm-2" for="subcategory">SubCategory:</label>
					<div class="col-sm-3">
						<select class="form-control" id="subcategory" name="subcategory">
						<option>-------------------------------</option>
							${ticketSubCategory}
						</select>
					</div>
				</fieldset>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="subject">Subject:</label>
				<div class="col-sm-7">
					<input class="form-control" id="subject" name="subject" type="text">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="description">Description:</label>
				<div class="col-sm-7">
					<textarea class="form-control" rows="5" id="Description"
						name="Description"></textarea>
				</div>
			</div>

			<!-- </div> -->
			<div class="container">
				<input type="submit" class="btn btn-info" name="Create Ticket"
					value="Create Ticket">
			</div>
		</div>
		</form>

		<footer class="container-fluid bg-4 text-center">
		<p>Ektha Solutions</p>
		</footer> 
</body>
</html>