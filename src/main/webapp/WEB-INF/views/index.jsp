<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="resources/angular.js"></script>
<script type="text/javascript" src="resources/app.js"></script>
<title>Insert title here</title>
</head>
<body data-ng-controller="ctrl">	
	<a href="json">JSON</a><br>
	<a href="xml">XML</a><br>
	<a href="csv">CSV</a><br><br>
	
	<div data-ng-repeat="person in persons">
		Name: {{person.name}}<br>
		Last Name: {{person.lastName}}<br>
		Age: {{person.age}}<br><br>
	</div>
	
	<input type="text" ng-model="test"><br>
	{{test}}
</body>
</html>

