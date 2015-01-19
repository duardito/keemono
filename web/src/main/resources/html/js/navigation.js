appModule.config(['$routeProvider',
	  function($routeProvider) {

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
			templateUrl: 'components/pages/pageList.html'
		  })
		  .when('/page', {
			templateUrl: 'components/pages/page.html'
		  })
		  .otherwise({
			redirectTo: '/welcome'
		  });

	  }
	]);