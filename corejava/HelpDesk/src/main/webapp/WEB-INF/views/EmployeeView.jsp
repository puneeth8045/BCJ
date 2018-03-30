<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
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
	jQuery(document).ready(
			function() {
				jQuery("#list").jqGrid(
						{
							url : "empcontrol",
							datatype : "json",
							mtype : 'POST',
							colNames : [ 'Id', 'Ticketreferenceno', 'Category',
									'SubCategory', 'Subject', 'Description',
									'Status', 'Comments' ],
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
							}, {
								name : 'description',
								index : 'description',
								width : 200,
								editable : false
							}, {
								name : 'status',
								index : 'status',
								width : 100,
								editable : false
							}, {
								name : 'comments',
								index : 'comments',
								width : 200,
								editable : false
							} ],
							pager : '#pager',
							rowNum : 10,
							rowList : [ 10, 20, 30 ],
							sortname : 'invid',
							sortorder : 'desc',
							viewrecords : true,
							gridview : true,
							multiselect : true,
							caption : 'Pending Tickets',
							jsonReader : {
								repeatitems : false,
							},
							editurl : "empcontrol"
						});
				jQuery("#list").jqGrid('navGrid', '#pager', {
					edit : true,
					add : true,
					del : true,
					search : true
				});
			});
</script>
<script type="text/javascript">
	jQuery(document).ready(
			function() {
				jQuery("#list1").jqGrid(
						{
							url : "empapprove",
							datatype : "json",
							mtype : 'POST',
							colNames : [ 'Id', 'Ticketreferenceno', 'Category',
									'SubCategory', 'Subject', 'Description',
									'Status', 'Comments' ],
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
							}, {
								name : 'description',
								index : 'description',
								width : 200,
								editable : false
							}, {
								name : 'status',
								index : 'status',
								width : 100,
								editable : false
							}, {
								name : 'comments',
								index : 'comments',
								width : 200,
								editable : false
							} ],
							pager : '#pager1',
							rowNum : 10,
							rowList : [ 10, 20, 30 ],
							sortname : 'invid',
							sortorder : 'desc',
							viewrecords : true,
							gridview : true,
							multiselect : false,
							caption : 'Approved Tickets',
							jsonReader : {
								repeatitems : false,
							},
							editurl : "empapprove"
						});
				jQuery("#list1").jqGrid('navGrid', '#pager1', {
					edit : true,
					add : true,
					del : true,
					search : true
				});
			});
</script>
<script type="text/javascript">
	jQuery(document).ready(
			function() {
				jQuery("#list2").jqGrid(
						{
							url : "empreject",
							datatype : "json",
							mtype : 'POST',
							colNames : [ 'Id', 'Ticketreferenceno', 'Category',
									'SubCategory', 'Subject', 'Description',
									'Status', 'Comments' ],
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
							}, {
								name : 'description',
								index : 'description',
								width : 200,
								editable : false
							}, {
								name : 'status',
								index : 'status',
								width : 100,
								editable : false
							}, {
								name : 'comments',
								index : 'comments',
								width : 200,
								editable : false
							} ],
							pager : '#pager2',
							rowNum : 10,
							rowList : [ 10, 20, 30 ],
							sortname : 'invid',
							sortorder : 'desc',
							viewrecords : true,
							gridview : true,
							multiselect : false,
							caption : 'Rejected Tickets',
							jsonReader : {
								repeatitems : false,
							},
							editurl : "empreject"
						});
				jQuery("#list2").jqGrid('navGrid', '#pager2', {
					edit : true,
					add : true,
					del : true,
					search : true
				});
			});
</script>

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
		<h2>Pending Ticket details</h2>
	</div>
	<table align="center" id="list">
		<tr>
			<td />
		</tr>
	</table>
	<div id="pager"></div>
	<button type="button" class="btn btn-info" id="approve">Approve</button>
	<button type="button" class="btn btn-info" id="reject">Reject</button>
	</div>
	<br>
	<br>
	<div class="container">
	<div class="jumbotron">
		<h2>Approved Ticket details</h2>
	</div>
	<table align="center" id="list1">
		<tr>
			<td />
		</tr>
	</table>
	<div id="pager1"></div>
	</div>
		<br>
	<br>
	<div class="container">
	<div class="jumbotron">
<h2>Rejected Ticket details</h2>
	</div>
	<table align="center" id="list2">
		<tr>
			<td />
		</tr>
	</table>
	<div id="pager2"></div>
	</div>
<br>
<br>
	<footer class="container-fluid bg-4 text-center">
	<p>Ektha Solutions</p>
	</footer>
	<script type="text/javascript">
		jQuery("#approve").click(
				function() {
					var selRowArr = jQuery("#list").getGridParam('selrow');
					var comments = prompt("Please enter the comments");
					var celValue = $('#list').jqGrid('getCell', selRowArr,
							'ticketreferenceno');
					var xhttp = new XMLHttpRequest();
					xhttp.onreadystatechange = function() {
						if (this.readyState == 4 && this.status == 200) {
							jQuery("#list").trigger("reloadGrid");
							jQuery("#list1").trigger("reloadGrid");
						}
					};
					xhttp.open("POST", "empupdate?val=" + celValue
							+ "&comments=" + comments, true);
					xhttp.send();
				});
	</script>
	<script type="text/javascript">
		jQuery("#reject").click(
				function() {
					var selRowArr = jQuery("#list").getGridParam('selrow');
					var comments = prompt("Please enter the comments");
					var celValue = $('#list').jqGrid('getCell', selRowArr,
							'ticketreferenceno');
					var xhttp = new XMLHttpRequest();
					xhttp.onreadystatechange = function() {
						if (this.readyState == 4 && this.status == 200) {
							jQuery("#list").trigger("reloadGrid");
							jQuery("#list2").trigger("reloadGrid");
						}
					};
					xhttp.open("POST", "empgridreject?val=" + celValue
							+ "&comments=" + comments, true);
					xhttp.send();
				});
	</script>
</body>
</html>