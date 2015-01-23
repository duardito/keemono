var appModule = angular.module('myApp', ['ngRoute','pascalprecht.translate','ui.router','ngDragDrop','ngSanitize']);

appModule.controller('oneCtrl', function($scope, $timeout) {
        $scope.list1 = [];
        $scope.list2 = [];
        $scope.list3 = [];
        $scope.list4 = [];
        
        $scope.list5 = [
          { 'title': 'Item 1', 'drag': true },
          { 'title': 'Item 2', 'drag': true },
          { 'title': 'Item 3', 'drag': true },
          { 'title': 'Item 4', 'drag': true },
          { 'title': 'Item 5', 'drag': true },
          { 'title': 'Item 6', 'drag': true },
          { 'title': 'Item 7', 'drag': true },
          { 'title': 'Item 8', 'drag': true }
        ];

        // Limit items to be dropped in list1
        $scope.optionsList1 = {
          accept: function(dragEl) {
            if ($scope.list1.length >= 1) {
              return false;
            } else {
              return true;
            }
          }
        };
      });

	appModule.controller('rest',function($scope, $http) {
            $scope.selected = {};
            $http.get('http://31.200.241.46:8080/newvalia/product/findAll').
                    success(function(data) {
                        $scope.products = data;
                    }).error(function(data) {
                        console.log("error");
                    });
        });
		

        appModule.controller('saveProductController',function($scope, $http) {
            $scope.submit = function() {
                $http.post('http://31.200.241.46:8080/newvalia/product/save',
                        {"name": $scope.nameProduct,"shopList":[{"name":$scope.shop.id,"productAttr":[{"price":$scope.price,"date":$scope.date}]}]}).
                        success(function(data, status, headers, config) {
                            // this callback will be called asynchronously
                            // when the response is available
                        }).
                        error(function(data, status, headers, config) {
                            // called asynchronously if an error occurs
                            // or server returns response with an error status.
                        });
            };
            $http.get('http://31.200.241.46:8080/newvalia/shop/findAll').
                    success(function(data) {
                        $scope.shops = data;
                        console.log("out shop", $scope.shops);
                    }).error(function(data) {
                        console.log("error");
                    });
        });


        appModule.controller('rest',function($scope, $http) {
            $scope.selected = {};
            $scope.selectedShop = {};
            $http.get('http://31.200.241.46:8080/newvalia/product/findAll').
                    success(function(data) {
                        $scope.products = data;
                        console.log("out ", $scope.products);
                    }).error(function(data) {
                        console.log("error");
                    });



        });

        appModule.controller('saveShopController',function($scope, $http) {
            $scope.submitShop = function() {
                $http.post('http://31.200.241.46:8080/newvalia/shop/save',
                        {"name": $scope.nameShop, "id": $scope.nameShop}).
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
	