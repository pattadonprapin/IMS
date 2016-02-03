package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Ingredient;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface IngredientDao {
    List<Ingredient> getIngredients();
    Ingredient getIngredient(Long ingredientID);
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient deleteIngredient(Ingredient ingredient);
    Ingredient updateIngredient(Ingredient ingredient);

}
