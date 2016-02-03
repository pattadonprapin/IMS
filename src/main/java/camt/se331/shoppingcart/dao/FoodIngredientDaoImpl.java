package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.FoodIngredient;
import camt.se331.shoppingcart.repository.FoodIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public class FoodIngredientDaoImpl implements  FoodIngredientDao {

    @Autowired
    FoodIngredientRepository foodingredientRepository;

    @Override
    public List<FoodIngredient> getFoodIngredients() {
        return foodingredientRepository.findAll();
    }

    @Override
    public FoodIngredient getFoodIngredient(Long foodIngredientID) {
        return foodingredientRepository.findOne(foodIngredientID);
    }

    @Override
    public FoodIngredient addFoodIngredient(FoodIngredient foodIngredient) {
        return foodingredientRepository.save(foodIngredient);
    }

    @Override
    public FoodIngredient deleteFoodIngredient(FoodIngredient foodIngredient) {
        foodingredientRepository.delete(foodIngredient);
        foodIngredient.setFoodIngredientID(null);
        return foodIngredient;
    }

    @Override
    public FoodIngredient updateFoodIngredient(FoodIngredient foodIngredient) {
        return foodingredientRepository.save(foodIngredient);
    }
}
