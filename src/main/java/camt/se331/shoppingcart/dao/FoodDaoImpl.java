package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Food;
import camt.se331.shoppingcart.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Repository
public class FoodDaoImpl implements  FoodDao{
    @Autowired
    FoodRepository foodRepository;
    @Override
    public List<Food> getFoods() {
        return foodRepository.findAll();
    }

    @Override
    public Food getFood(Long foodID) {
        return foodRepository.findOne(foodID);
    }

    @Override
    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food deleteFood(Food food) {
        foodRepository.delete(food);
        food.setFoodID(null);
        return food;
    }

    @Override
    public Food updateFood(Food food) {
        return foodRepository.save(food);
    }
}
