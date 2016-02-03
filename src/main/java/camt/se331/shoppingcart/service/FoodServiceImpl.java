package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.FoodDao;
import camt.se331.shoppingcart.dao.IngredientDao;
import camt.se331.shoppingcart.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodDao foodDao;

    @Override
    public List<Food> getFoods() {
        return foodDao.getFoods();
    }

    @Override
    public Food getFood(Long foodID) {
        return foodDao.getFood(foodID);
    }

    @Override
    public Food addFood(Food food) {
        return foodDao.addFood(food);
    }

    @Override
    public Food deleteFood(Long foodID) {
        Food food = getFood(foodID);
        return foodDao.deleteFood(food);
    }

    @Override
    public Food updateFood(Food food) {
        return foodDao.updateFood(food);
    }
}
