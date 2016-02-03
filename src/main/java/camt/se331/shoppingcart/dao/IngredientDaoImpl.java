package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Ingredient;
import camt.se331.shoppingcart.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Repository
public class IngredientDaoImpl implements IngredientDao {

    @Autowired
    IngredientRepository ingredientRepository;
    @Override
    public List<Ingredient> getIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient getIngredient(Long ingredientID) {
        return ingredientRepository.findOne(ingredientID);
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient deleteIngredient(Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
        ingredient.setIngredientID(null);
        return ingredient;

    }

    @Override
    public Ingredient updateIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
