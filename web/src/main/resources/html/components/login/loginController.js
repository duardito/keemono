	appModule.controller('loginController',function($scope, $http, $route) {
	$scope.submit = function() {
		$http.post('http://31.200.241.46:8080/newvalia/product/findAll',
				{"username": $scope.username, "password": $scope.password}).
				success(function(data, status, headers, config) {
				console.log('reloadddd');
					$route.reload();
					// this callback will be called asynchronously
					// when the response is available
				}).
				error(function(data, status, headers, config) {
				console.log('errrrrrrr');
				$route.reload();
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
	};
});
