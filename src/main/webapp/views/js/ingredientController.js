'use strict';

var ingredientMainController = angular.module('ingredientMainController', ['ingredientServices','ui.bootstrap']);

ingredientMainController.controller('addIngredientController', ['$scope', '$http', '$location', '$rootScope','ingredientService', '$timeout',
    function ($scope, $http, $location, $rootScope,ingredientService,$timeout) {
        $scope.ingredient = {};
        $scope.addPerson = true;
        $scope.editPerson = false;
        $scope.addIngredient = function () {
            ingredientService.save($scope.ingredient,function(data){
                // after adding the object, add a new picture
                // get the product id which the image will be addded
                var ingredientID = data.ingredientID;
                // set location
                //flowFiles.opts.target = '/productImage/add';
                //flowFiles.opts.testChunks = false;
                //flowFiles.opts.query ={productid:productid};
                //flowFiles.upload();

                $rootScope.addSuccess = true;
                $location.path("listProduct");
                $scope.$apply();
            });
        };


        $scope.start = new Date('11/20/13');
        $scope.end = new Date();

        $scope.minStartDate = 0; //fixed date
        $scope.maxStartDate = $scope.end; //init value
        $scope.minEndDate = $scope.start; //init value
        $scope.maxEndDate = $scope.end; //fixed date same as $scope.maxStartDate init value

        $scope.$watch('start', function(v){
            $scope.minEndDate = v;
        });
        $scope.$watch('end', function(v){
            $scope.maxStartDate = v;
        });

        $scope.openStart = function() {
            $timeout(function() {
                $scope.startOpened = true;
            });
        };

        $scope.openEnd = function() {
            $timeout(function() {
                $scope.endOpened = true;
            });
        };

        $scope.dateOptions = {
            'year-format': "'yy'",
            'starting-day': 1
        };

    }]);



ingredientMainController.controller('listIngredientController', ['$scope', '$http', '$rootScope','ingredientService','$route',
    function ($scope, $http, $rootScope,ingredientService,$route) {
        //$http.get("/product/").success(function (data) {
        var data = ingredientService.query(function(){
            // $scope.totalNetPrice= totalCalService.getTotalNetPrice(data);
            $scope.ingredients = data;
        });


        $scope.$on('$locationChangeStart', function (event) {
            $rootScope.addSuccess = false;
            $rootScope.editSuccess = false;
            $rootScope.deleteSuccess = false;
        });

        $scope.deleteIngredient = function (ingredientID) {
            var answer = confirm("Do you want to delete the product?");
            if (answer) {
                ingredientService.delete({ingredientID:ingredientID},function(){
                    $rootScope.deleteSuccess = true;
                    $route.reload();
                })
            }
        }



    }]);

ingredientMainController.controller('editIngredientController', ['$scope', '$http', '$routeParams', '$location', '$rootScope','ingredientService',
    function ($scope, $http, $routeParams, $location, $rootScope,ingredientService) {
        $scope.addPerson = false;
        $scope.editPerson = true;
        var ingredientID = $routeParams.ingredientID;
        $http.get("/ingredient/" + ingredientID).success(function (data) {
            $scope.ingredient = data;
        });

        $scope.editIngredient = function () {
            //$http.put("/product", $scope.product).then(function () {
            ingredientService.update({ingredientID:$scope.ingredient.ingredientID},$scope.ingredient,function(){
                $rootScope.editSuccess = true;
                $location.path("listIngredient");
            });
        }
    }]);