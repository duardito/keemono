appModule.config(['$routeProvider',
	  function($routeProvider) {

		$routeProvider
		  .when('/nav1', {
			templateUrl: 'nav1.html'
		  })
		  .when('/user', {
			templateUrl: 'pages/users/user.html'
		  })
		  .when('/pages', {
			templateUrl: 'pages/pages/page.html'
		  })
		  .otherwise({
			redirectTo: '/nav1'
		  });

	  }
	]);