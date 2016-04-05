(function(){
	var app = angular.module("directivesModule",[]);
	
	app.directive("mainMenu", function(){
		return{
			restrict: "E",
			templateUrl: "mainMenu.html"
		};
	});
	
	app.directive("characterEquipments", function(){
		return {
			restrict: "A",
			templateUrl: "characterEquipment.html"
		}
	});
	
	app.directive("characterSkills", function(){
		return {
			restrict: "A",
			templateUrl: "characterSkills.html"
		};
	});
	
	app.directive("characterPassiveSkills", function() {
		return {
			restrict: "A",
			templateUrl: "characterPassiveSkills.html"
		};
	});
	
	app.directive("characterShoulderModal", function() {
		return {
			restrict: "A",
			templateUrl: "shoulderModal.html"
		};
	});
	
})();