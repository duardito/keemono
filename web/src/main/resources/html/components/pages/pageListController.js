	appModule.controller('pageListController',function($scope, $http) {
		$http.get('http://localhost:9000/keemono/page/findAll').
				success(function(data) {
				$scope.pagelist=data;
					// this callback will be called asynchronously
					// when the response is available
				}).
				error(function(data) {
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});

});
