package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.FoodIngredientDao;
import camt.se331.shoppingcart.entity.FoodIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */

@Service
public class FoodIngredientServiceImpl implements FoodIngredientService {

    @Autowired
    FoodIngredientDao foodingredientDao;

    @Override
    public List<FoodIngredient> getFoodIngredients() {
        return foodingredientDao.getFoodIngredients();
    }

    @Override
    public FoodIngredient getFoodIngredient(Long foodingredientID) {
        return foodingredientDao.getFoodIngredient(foodingredientID);
    }

    @Override
    public FoodIngredient addFoodIngredient(FoodIngredient foodingredient) {
        return foodingredientDao.addFoodIngredient(foodingredient);
    }

    @Override
    public FoodIngredient deleteFoodIngredient(Long foodingredientID) {
        FoodIngredient foodIngredient = getFoodIngredient(foodingredientID);
        return foodingredientDao.deleteFoodIngredient(foodIngredient);
    }

    @Override
    public FoodIngredient updateFoodIngredient(FoodIngredient foodingredient) {
        return foodingredientDao.updateFoodIngredient(foodingredient);
    }
}
