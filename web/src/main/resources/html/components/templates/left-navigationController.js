
	appModule.controller('urlController',function($scope, $http) {
            $scope.urls = [
                {"name":"login","description":"Login"},
                {"name":"user","description":"User admin"},
                {"name":"page","description":"Pages admin"},
				{"name":"userList","description":"User list"},
				{"name":"pageList","description":"Page list"}
            ];
        });