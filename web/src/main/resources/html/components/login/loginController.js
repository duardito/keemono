appModule.controller('loginController',function($scope, $http, $route) {
			var currentUser = null;
			var authorized = false;

			// initMaybe it wasn't meant to work for mpm?ial state says we haven't logged in or out yet...
			// this tells us we are in public browsing
			var initialState = true;

			return {
				initialState:function () {
					return initialState;
				},
				login:function () {

					$http.post('http://localhost:8080/keemono/login',
						{"username": $scope.username, "password": $scope.password}).
						success(function(data, status, headers, config) {

							currentUser = name;
							authorized = true;
							//console.log("Logged in as " + name);
							initialState = false;

							console.log('reloadddd');
							$route.reload();
							// this callback will be called asynchronously
							// when the response is available
						}).
						error(function(data, status, headers, config) {

							currentUser = name;
							authorized = true;
							//console.log("Logged in as " + name);
							initialState = false;
							console.log('errrrrrrr');
							$route.reload();
							// called asynchronously if an error occurs
							// or server returns response with an error status.
						});

				},
				logout:function () {
					currentUser = null;
					authorized = false;
				},
				isLoggedIn:function () {
					return authorized;
				},
				currentUser:function () {
					return currentUser;
				},
				authorized:function () {
					return authorized;
				}
			};
		}
	);