<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/redmond/jquery-ui.min.css
	">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.14.0/css/ui.jqgrid.min.css
	">

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js
	"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.14.0/jquery.jqgrid.min.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		jQuery("#list").jqGrid({
			url : "ticketgrid",
			datatype : "json",
			mtype : 'POST',
			colNames : [ 'id', 'Ticketreferenceno','Category','SubCategory','Subject','Description','Status','Comments' ],
			colModel : [ {
				name : 'id',
				index : 'id',
				width : 100
			}, {
				name : 'ticketreferenceno',
				index : 'ticketreferenceno',
				width : 150,
				editable : false
			}, {
				name : 'category',
				index : 'category',
				width : 150,
				editable : false
			}, {
				name : 'subCategory',
				index : 'subCategory',
				width : 100,
				editable : false
			}, {
				name : 'subject',
				index : 'subject',
				width : 100,
				editable : false
			},{
				name : 'description',
				index : 'description',
				width : 200,
				editable : false
			},{
				name : 'status',
				index : 'status',
				width : 100,
				editable : false
			},{
				name : 'comments',
				index : 'comments',
				width : 200,
				editable : false
			}
			],
			pager : '#pager',
			rowNum : 10,
			rowList : [ 10, 20, 30 ],
			sortname : 'invid',
			sortorder : 'desc',
			viewrecords : true,
			gridview : true,
			multiselect : false,
			caption : 'Ticket details',
			jsonReader : {
				repeatitems : false,
			},
			editurl : "ticketgrid"
		});
		jQuery("#list").jqGrid('navGrid', '#pager', {
			edit : true,
			add : true,
			del : true,
			search : true
		});
	});
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
			<%--  <li><a href="Registration"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> --%>
			<li><a href="logout"><span
					class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
		</ul>
	</div>
	</nav>
	<div class="container">
<div class="jumbotron">
				<h2>Ticket details</h2>
			</div>
	<table align="center" id="list">
		<tr>
			<td />
		</tr>
	</table>
	<div id="pager"></div>
	<br>
	
	<div class="container">
		<a href="createticket" class="btn btn-info" role="button">Create
			Ticket</a>
	</div>
</div>
	<footer class="container-fluid bg-4 text-center">
	<p>Ektha Solutions</p>
	</footer>
</body>
</html>