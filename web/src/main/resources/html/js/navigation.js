appModule.config(['$routeProvider',
	  function($routeProvider) {

		$routeProvider
		  .when('/login', {
			templateUrl: 'components/login/login.html'
		  })
		  .when('/user', {
			templateUrl: 'components/users/user.html'
		  })
		  .when('/pages', {
			templateUrl: 'components/pages/page.html'
		  })
		  .otherwise({
			redirectTo: '/'
		  });

	  }
	]);