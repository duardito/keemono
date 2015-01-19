appModule.controller('navUrlController',function($scope, $http) {
            $scope.urls = [
                {"name":"welcome","description":"Home"}
            ];
        console.log('urls son', $scope.urls);
        });