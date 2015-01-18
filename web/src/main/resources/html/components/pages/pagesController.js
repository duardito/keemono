	appModule.controller('savePageController',function($scope, $http) {
	$scope.submit = function() {
		$http.post('http://31.200.241.46:8080/admin/page/save',
				{"pagename": $scope.pagename,
				"headpage": $scope.headpage,
				"bodypage" : $scope.bodypage, 
				"footerpage" :$scope.footerpage}).
				success(function(data, status, headers, config) {
					// this callback will be called asynchronously
					// when the response is available
				}).
				error(function(data, status, headers, config) {
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
	};
});
