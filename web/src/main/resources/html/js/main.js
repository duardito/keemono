'use strict';

var appModule =
    angular.module('myApp',
        ['myApp.filters',
            'myApp.directives','ngRoute','pascalprecht.translate','ui.router','ngDragDrop','ngSanitize','ngResource']);

var filters = angular.module('myApp.filters', []);
var directives = angular.module('myApp.directives', []);

appModule.config(function($provide){
    appModule.register =
    {
        factory: $provide.factory,
        service: $provide.service,
        constant: $provide.constant
    };
});


// this is run after angular is instantiated and bootstrapped
appModule.run(function ($rootScope, $location, $http, $timeout, AuthService) {

    // *****
    // Eager load some data using simple REST client
    // *****


    // async load constants
    $rootScope.constants = [];


    // async load data do be used in table (playgound grid widget)
    $rootScope.listData = [];


    // *****
    // Initialize authentication
    // *****
    $rootScope.authService = AuthService;

    // text input for login/password (only)
    $rootScope.loginInput = 'user@gmail.com';
    $rootScope.passwordInput = 'complexpassword';

    $rootScope.$watch('authService.authorized()', function () {

        // if never logged in, do nothing (otherwise bookmarks fail)
        if ($rootScope.authService.initialState()) {
            // we are public browsing
            return;
        }

        // instantiate and initialize an auth notification manager
        $rootScope.authNotifier = new NotificationManager($rootScope);

        // when user logs in, redirect to home
        if ($rootScope.authService.authorized()) {
            $location.path("/");
            $rootScope.authNotifier.notify('information', 'Welcome ' + $rootScope.authService.currentUser() + "!");
        }

        // when user logs out, redirect to home
        if (!$rootScope.authService.authorized()) {
            $location.path("/");
            $rootScope.authNotifier.notify('information', 'Thanks for visiting.  You have been signed out.');
        }

    }, true);

    // TODO move this out to a more appropriate place
    $rootScope.faq = [
        {key: "What is Angular-Enterprise-Seed?", value: "A starting point for server-agnostic, REST based or static/mashup UI."},
        {key: "What are the pre-requisites for running the seed?", value: "Just an HTTP server.  Add your own backend."},
        {key: "How do I change styling (css)?", value:  "Change Bootstrap LESS and rebuild with the build.sh script.  This will update the appropriate css/image/font files."}
    ];


});


appModule.run(function(testFactory, AuthService){
console.log('AuthService.authorized() ' ,AuthService.authorized());

    testFactory.sayGoodbye('holaaa');
    console.log('siiiii', testFactory.sayGoodbye('holaaa'));
});




