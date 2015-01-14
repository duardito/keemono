var appModule = angular.module('myApp', ['ngRoute','pascalprecht.translate']);
	
	appModule.config(['$routeProvider',
	  function($routeProvider) {

		$routeProvider
		  .when('/nav1', {
			templateUrl: 'nav1.html'
		  })
		  .when('/user', {
			templateUrl: 'pages/users/user.html'
		  })
		  .otherwise({
			redirectTo: '/'
		  });

	  }
	]);

	appModule.config(function($translateProvider) {
  $translateProvider.translations('en', {
  BUTTON_TEXT_DE:'english',
  BUTTON_TEXT_EN:'german',
    HEADLINE: 'Hello there, This is my awesome app!',
    INTRO_TEXT: 'And it has i18n support!',
	SHOP_TEXT : 'Shop'
  })
  .translations('de', {
  BUTTON_TEXT_DE:'englisch',
  BUTTON_TEXT_EN:'deutsch',
    HEADLINE: 'Hey, das ist meine großartige App!',
    INTRO_TEXT: 'Und sie untersützt mehrere Sprachen!',
	SHOP_TEXT : 'Shoppen'
  });
  $translateProvider.preferredLanguage('en');
});

appModule.controller('TranslateController', function ($scope, $translate) {
  $scope.changeLanguage = function (key) {
    $translate.use(key);
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
                console.log('$scope.shop' ,$scope.shop);
                console.log('$scope.shop.value' ,$scope.shop.value);
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
                //
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
	