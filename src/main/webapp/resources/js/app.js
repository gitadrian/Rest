var app = angular.module("app", []);

app.controller("ctrl", function($scope, $http, $filter) {
	$http.get("json").then(function(response) {
		$scope.persons = response.data;
	});
});