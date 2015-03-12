	appModule.controller('savePageController',function($scope, $http,$route) {
        $scope.layouts=[{id:'1',name: 'layout 1', img :'assets/img/Desert-mini.jpg'},{id:'2',name: 'layout 2',img :'assets/img/Desert-mini.jpg'}];

	$scope.submit = function() {
		$http.post('http://localhost:9000/keemono/page/save',
				{"name": $scope.pagename,
				"headerPage": {headerContent:$scope.headpage},
				"bodyPage" :  {bodyContent : $scope.bodypage},
				"footerPage" :{footerContent:$scope.footerpage}}).
				success(function(data, status, headers, config) {
					$route.reload();
					// this callback will be called asynchronously
					// when the response is available
				}).
				error(function(data, status, headers, config) {
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
	};
});
