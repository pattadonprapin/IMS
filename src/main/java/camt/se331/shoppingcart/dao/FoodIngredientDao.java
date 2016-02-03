package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.FoodIngredient;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface FoodIngredientDao {
    List<FoodIngredient> getFoodIngredients();
    FoodIngredient getFoodIngredient(Long foodIngredientID);
    FoodIngredient addFoodIngredient(FoodIngredient foodIngredient);
    FoodIngredient deleteFoodIngredient(FoodIngredient foodIngredient);
    FoodIngredient updateFoodIngredient(FoodIngredient foodIngredient);

}
