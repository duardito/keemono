appModule.config(['$routeProvider','$locationProvider',
	  function($routeProvider, $locationProvider) {

		$routeProvider
		.when('/welcome', {
			templateUrl: 'home.html'
		  })
		  .when('/login', {
			templateUrl: 'components/login/login.html'
		  })
		  .when('/user', {
			templateUrl: 'components/users/user.html'
		  })
		  .when('/userList', {
			templateUrl: 'components/users/userList.html'
		  })
		  .when('/pageList', {
			templateUrl: 'components/pages/pageList.html',
			controller:'pageListController'
		  })
		  .when('/page', {
			templateUrl: 'components/pages/page.html'
		  }).when('/empty', {
				templateUrl: 'empty.html'
			}).when('/:name', {
				templateUrl: 'empty.html',
				controller: PagesController });

	  }
	]);

function PagesController($scope, $http, $route, $routeParams, $compile) {
	/**$route.current.templateUrl = '' + $routeParams.name + ".html";**/
	$route.current.templateUrl =  "empty.html";
	$http.get($route.current.templateUrl).then(function (msg) {
		$('#views').html($compile(msg.data)($scope));
	});
}
PagesController.$inject = ['$scope', '$http', '$route', '$routeParams', '$compile'];

