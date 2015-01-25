'use strict';
appModule.filter('unsafe', function($sce) { return $sce.trustAsHtml; });
