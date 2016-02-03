package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Ingredient;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface IngredientService {

    List<Ingredient>getIngredients();
    Ingredient getIngredient(Long ingredientID);
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient deleteIngredient(Long ingredientID);
    Ingredient updateIngredient(Ingredient ingredient);

}
