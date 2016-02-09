/**
 * Created by TEN10 on 2/4/2016.
 */
'use strict'
var ingredientService = angular.module('ingredientServices',['ngResource']);


ingredientService.factory('ingredientService',function($resource){
    return $resource('/ingredient/:ingredientID', { ingredientID: '@_ingredientID' }, {
        update: {
            method: 'PUT' // this method issues a PUT request
        }});

})


