appModule.config(function($translateProvider) {
  $translateProvider.translations('en', {
  BUTTON_TEXT_DE:'english',
  BUTTON_TEXT_EN:'german',
    HEADLINE: 'Hello there, This is my awesome app!',
    INTRO_TEXT: 'And it has i18n support!',
	SHOP_TEXT : 'Shop',
	USER_NAME_TEXT  :'User name',
	SAVE_USER_NAME_TEXT:'Save',
	USER_NAV_TEXT :'Users'
  })
  .translations('de', {
  BUTTON_TEXT_DE:'englisch',
  BUTTON_TEXT_EN:'deutsch',
    HEADLINE: 'Hey, das ist meine großartige App!',
    INTRO_TEXT: 'Und sie untersützt mehrere Sprachen!',
	SHOP_TEXT : 'Shoppen',
	USER_NAME_TEXT  :'Useren namen',
	SAVE_USER_NAME_TEXT:'Saven',
	USER_NAV_TEXT :'Usersen'
  });
  $translateProvider.preferredLanguage('en');
});

appModule.controller('TranslateController', function ($scope, $translate) {
  $scope.changeLanguage = function (key) {
    $translate.use(key);
  };
})
	
