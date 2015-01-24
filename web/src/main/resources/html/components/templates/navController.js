
appModule.controller('navUrlController',function($scope, $http) {
    $http.get('http://localhost:9000/keemono/page/findAll').
        success(function(data) {
            $scope.urls=data;
            // this callback will be called asynchronously
            // when the response is available
        }).
        error(function(data) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });

});

appModule.controller('empty',function($scope, $http,$resource, $location) {


    var theId = $location.path();
    var lastParam = theId.substring(1, theId.size);
    var value = $resource('http://localhost:9000/keemono/page/findByName/:name');
    $scope.empty =value.get({
        name: lastParam
    }, function(resp) {

     }, function(err) {

     });

    return $scope.empty;
});