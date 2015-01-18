
	appModule.controller('urlController',function($scope, $http) {
            $scope.urls = [
                {"name":"login","description":"Login"},
                {"name":"user","description":"User admin"},
                {"name":"pages","description":"Pages admin"}
            ];
        console.log('urls son', $scope.urls);
        });