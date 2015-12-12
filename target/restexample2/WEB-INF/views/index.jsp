<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/js/bootstrap.min.js">  

<script type="text/javascript" src="resources/js/jquery-1-11-3.min.js"></script>  
<script type="text/javascript" src="resources/js/angular.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>
<title>Insert title here</title>
</head>
<body data-ng-controller="ctrl">	
	<a href="json">JSON</a><br>
	<a href="xml">XML</a><br>
	<a href="file.csv">CSV</a><br><br>
	
	Search: <input type="text" data-ng-model="search"><br><br>
	
	
	<div data-ng-repeat="person in persons | filter: search">
		Name: {{person.name}}<br>
		Last Name: {{person.lastName}}<br>
		Age: {{person.age}}<br><br>
	</div>
	
	
</body>
</html>

