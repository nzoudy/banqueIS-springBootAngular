
var app=angular.module("myBanqueApp",[]);

app.controller("myBanqueController",function($scope, $http){
	
	$scope.compte=null;
	$scope.codeCompte=null;
	$scope.operation={type:"versement", montant:0}
	$scope.pageOperations=[];
	$scope.chargerCompte=function(){
		$http.get("/comptes/"+$scope.codeCompte)
		.success(function(data){
			$scope.compte=data;
			$scope.chargerOperations();
		});
	};
	
	$scope.chargerOperations=function(){
		$http.get("/operations?codeCompte="+$scope.codeCompte+"&page=0&size=3")
		.success(function(data){
			$scope.pageOperations=data;
		});
	};
	
	$scope.saveOperation=function(){
		$http({
			method  : 'PUT',
			url     : $scope.operation.type,
			data    : "code="+$scope.codeCompte+"&montant="+$scope.operation.montant+"&codeEmp=1",
			headers : {'Content-Type': 'application/x-www-form-urlencoded'}
		})
		.success(function(data){
			$scope.chargerCompte();
		//	$scope.saveOperation();
		});
	};
	
	
});
