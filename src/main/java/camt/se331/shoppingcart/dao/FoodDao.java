package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Food;
import camt.se331.shoppingcart.entity.Image;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface FoodDao {
    List<Food> getFoods();
    Food getFood(Long foodID);
    Food addFood(Food food);
    Food deleteFood(Food food);
    Food updateFood(Food food);


}
