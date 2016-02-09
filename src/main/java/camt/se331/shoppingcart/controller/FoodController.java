package camt.se331.shoppingcart.controller;

import camt.se331.shoppingcart.entity.Food;
import camt.se331.shoppingcart.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */

@RestController
@RequestMapping("/")
public class FoodController {

    @Autowired
    FoodService foodService;


    @RequestMapping(value = "getfood",method = RequestMethod.GET)
    public List<Food> list(){
        return foodService.getFoods();
    }

    @RequestMapping(value = "food/{foodID}",method = RequestMethod.GET)
    public  Food getFood(@PathVariable("foodID") Long foodID){
        return foodService.getFood(foodID);
    }


    @RequestMapping(value = "food",method = RequestMethod.POST)
    public @ResponseBody
    Food addFood(@RequestBody Food food, BindingResult bindingResult  ){

        return foodService.addFood(food);
    }

    @RequestMapping(value = "food/{foodID}",method = RequestMethod.PUT)
    public  Food updateFood(@PathVariable("foodID") Long foodID,@RequestBody Food food, BindingResult bindingResult){
        return foodService.updateFood(food);
    }

    @RequestMapping(value = "food/{foodID}",method = RequestMethod.DELETE)
    public  Food deleteFood(@PathVariable("foodID") Long foodID){
        return foodService.deleteFood(foodID);
    }


















}
