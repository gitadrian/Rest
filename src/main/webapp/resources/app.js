var app = angular.module("app", []);

app.controller("ctrl", function($scope, $http) {
	$http.get("json").then(function(response) {
		$scope.persons = response.data;
	});
});