package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.FoodIngredient;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface FoodIngredientService {

    List<FoodIngredient> getFoodIngredients();
    FoodIngredient getFoodIngredient(Long foodingredientID);
    FoodIngredient addFoodIngredient(FoodIngredient foodingredient);
    FoodIngredient deleteFoodIngredient(Long foodingredientID);
    FoodIngredient updateFoodIngredient(FoodIngredient foodingredient);
}
