package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.FoodIngredientDao;
import camt.se331.shoppingcart.entity.FoodIngredient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public class FoodIngredientServiceImpl implements FoodIngredientService {
    @Autowired
    FoodIngredientDao foodIngredientDao;

    @Override
    public List<FoodIngredient> getFoodIngredients() {
        return foodIngredientDao.getFoodIngredients();
    }

    @Override
    public FoodIngredient getFoodIngredient(Long foodingredientID) {
        return foodIngredientDao.getFoodIngredient(foodingredientID);
    }

    @Override
    public FoodIngredient addFoodIngredient(FoodIngredient foodingredient) {
        return foodIngredientDao.addFoodIngredient(foodingredient);
    }

    @Override
    public FoodIngredient deleteFoodIngredient(Long foodingredientID) {
        FoodIngredient foodIngredient = getFoodIngredient(foodingredientID);
        return foodIngredientDao.deleteFoodIngredient(foodIngredient);
    }

    @Override
    public FoodIngredient updateFoodIngredient(FoodIngredient foodingredient) {
        return foodIngredientDao.updateFoodIngredient(foodingredient);
    }
}
