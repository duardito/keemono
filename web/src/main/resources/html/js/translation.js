appModule.config(function($translateProvider) {
  $translateProvider.translations('en', {
  BUTTON_TEXT_DE:'english',
  BUTTON_TEXT_EN:'german',
    HEADLINE: 'Hello there, This is my awesome app!',
    INTRO_TEXT: 'And it has i18n support!',
	SHOP_TEXT : 'Shop',
	USER_NAME_TEXT  :'User name',
	SAVE_USER_NAME_TEXT:'Save',
	USER_NAV_TEXT :'Users',
	PAGE_NAME_TEXT:'Page name',
	BODY_PAGE_NAME_TEXT:'Body page',
	FOOTER_PAGE_NAME_TEXT:'Footer page',
	SAVE_PAGE_TEXT:'Save page',
	EMAIL_TEXT:'e-mail',
	ROLE_TEXT:'Role',
	SAVE_USER_TEXT:'Add user',
	HEAD_PAGE_NAME_TEXT:'Header page',
	 PASSWORD_TEXT:'Password',
	 USER_ADMIN_TEXT:'User Administration',
	 ADMINISTRATION_TEXT:'Administation',
	 CHOOSE_TEXT:'Choose',
	 USER_LIST_TEXT:'User list',
	 PAGE_ADMIN_TEXT:'Page administartion',
	 PAGE_LIST_TEXT: 'Page List',
	 LOGIN_TEXT: 'Login'
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
	
