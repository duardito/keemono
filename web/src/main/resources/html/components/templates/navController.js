appModule.controller('navUrlController',function($scope, $http) {
            $scope.urls = [
                {"name":"welcome","description":"Welcome"},
                {"name":"user","description":"User admin"},
                {"name":"pages","description":"Pages admin"}
            ];
        console.log('urls son', $scope.urls);
        });