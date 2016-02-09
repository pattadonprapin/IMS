'use strict'
var foodService = angular.module('foodServices',['ngResource']);

foodService.factory('foodService',function($resource){
    return $resource('/food/:foodID', { foodID: '@_foodID' }, {
        update: {
            method: 'PUT' // this method issues a PUT request
        }});

})




//productService.service('totalCalService',function() {
//    this.getTotalNetPrice = function (products) {
//        var output = 0.0;
//
//        for (var index = 0; index < products.length;index++) {
//            var product = products[index];
//            output += parseFloat(product.netPrice);
//        }
//        return output;
//    }
//})
//
//productService.factory('queryProductService',function($resource){
//    return $resource('/getProduct/?name=:name',
//        {query:{method:'GET',params:{name:''},isArray:true}
//
//        });
//})