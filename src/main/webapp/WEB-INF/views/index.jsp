<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/js/bootstrap.min.js">
<link rel="stylesheet" href="resources/css/style.css">

<script type="text/javascript" src="resources/js/jquery-1-11-3.min.js"></script>
<script type="text/javascript" src="resources/js/angular.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>

<title>Insert title here</title>
</head>
<body data-ng-controller="ctrl">

	<div class="row">
		<div class="col-md-4">
			
		</div>
		
		<div class="col-md-4" > 
			
				<form:form commandName="person" method="POST" action="personAdd">
					Name <form:input path="name" class="form-control" cssErrorClass="error" />
					<br>
					Last Name <form:input path="lastName" class="form-control" cssErrorClass="error" />
					<br>
					
					Age <form:input path="age" class="form-control" cssErrorClass="error" />
					
					<br>
					<input type="submit" class="btn btn-primary"/>
				</form:form>
			
			<br>
			<br>
			Search:
			<input type="text" data-ng-model="search" class="form-control">
			<br>
			<br>
			<div >
			
			
			<table class="table table-bordered">
				<tr>
					<th>Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
				<tr data-ng-repeat="person in persons | filter: search">
					<td>{{person.name}}</td>
					<td>{{person.lastName}}</td>
					<td>{{person.age}}</td>
				</tr>
			</table><br><br>
			<a href="json">JSON</a> <br> 
			<a href="xml">XML</a> <br> 
			<a href="file.csv">CSV</a> <br> <br>
			
				
			</div>
		</div>
	
		<div class="col-md-4">
			
		
		</div>
	</div>
</body>
</html>

