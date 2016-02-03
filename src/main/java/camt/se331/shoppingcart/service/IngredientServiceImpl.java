package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.IngredientDao;
import camt.se331.shoppingcart.entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredientDao ingredientDao;

    @Override
    public List<Ingredient> getIngredients() {
        return ingredientDao.getIngredients();
    }

    @Override
    public Ingredient getIngredient(Long ingredientID) {
        return ingredientDao.getIngredient(ingredientID);
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientDao.addIngredient(ingredient);
    }

    @Override
    public Ingredient deleteIngredient(Long ingredientID) {
        Ingredient ingredient = getIngredient(ingredientID);
        return ingredientDao.deleteIngredient(ingredient);
    }

    @Override
    public Ingredient updateIngredient(Ingredient ingredient) {
        return ingredientDao.updateIngredient(ingredient);
    }
}
