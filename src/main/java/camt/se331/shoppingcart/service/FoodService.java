package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Food;
import camt.se331.shoppingcart.entity.Image;
import camt.se331.shoppingcart.entity.Ingredient;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface FoodService {

    List<Food> getFoods();
    Food getFood(Long foodID);
    Food addFood(Food food);
    Food deleteFood(Long foodID);
    Food updateFood(Food food);


}
