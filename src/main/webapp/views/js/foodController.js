'use strict';

var foodMainController = angular.module('foodMainController', ['foodServices']);

foodMainController.controller('addFoodController', ['$scope', '$http', '$location', '$rootScope', 'foodService',
    function ($scope, $http, $location, $rootScope, foodService) {
        $scope.food = {};
        $scope.ingredients = {};

        $scope.addPerson = true;
        $scope.editPerson = false;


        $http.get("/ingredient/").success(function (data) {
            $scope.ingredients = data;
        });


        $scope.foodingredients = [$scope.ingredients];

        $scope.addNewChoice = function () {
            var newItemNo = $scope.foodingredients.length + 1;
            $scope.foodingredients[newItemNo].push( $scope.ingredients);
        };

        $scope.removeChoice = function () {
            var lastItem = $scope.foodingredients.length - 1;
            $scope.foodingredients.splice(lastItem);
        };


        $scope.addFood = function (flowFiles) {

            foodService.save($scope.food, function (data) {
                // after adding the object, add a new picture
                // get the product id which the image will be addded
                var foodID = data.foodID;
                //// set location
                flowFiles.opts.target = '/foodImage/add';
                flowFiles.opts.testChunks = false;
                flowFiles.opts.query ={foodID:foodID};
                flowFiles.upload();

                $rootScope.addSuccess = true;
                $location.path("listFood");
                $scope.$apply();
            });


        };





    }]);

foodMainController.controller('listFoodController', ['$scope', '$http', '$rootScope', 'foodService', '$route',
    function ($scope, $http, $rootScope, foodService, $route) {
        //$http.get("/product/").success(function (data) {
        var data = foodService.query(function () {
            // $scope.totalNetPrice= totalCalService.getTotalNetPrice(data);
            $scope.foods = data;
        });


        $scope.$on('$locationChangeStart', function (event) {
            $rootScope.addSuccess = false;
            $rootScope.editSuccess = false;
            $rootScope.deleteSuccess = false;
        });

        $scope.deleteFood = function (foodID) {
            var answer = confirm("Do you want to delete the product?");
            if (answer) {
                productService.delete({foodID: foodID}, function () {
                    $rootScope.deleteSuccess = true;
                    $route.reload();
                })
            }
        }

        //$scope.searchProduct = function(name){
        //    queryProductService.query({name:name},function(data) {
        //        $scope.products = data;
        //    });
        //}

    }]);

foodMainController.controller('editFoodController', ['$scope', '$http', '$routeParams', '$location', '$rootScope', 'foodService',
    function ($scope, $http, $routeParams, $location, $rootScope, foodService) {
        $scope.addPerson = false;
        $scope.editPerson = true;
        var foodID = $routeParams.foodID;
        $http.get("/food/" + foodID).success(function (data) {
            $scope.food = data;
        });

        $scope.editFood = function () {
            //$http.put("/product", $scope.product).then(function () {
            foodService.update({id: $scope.product.id}, $scope.product, function () {
                $rootScope.editSuccess = true;
                $location.path("listFood");
            });
        }
    }]);