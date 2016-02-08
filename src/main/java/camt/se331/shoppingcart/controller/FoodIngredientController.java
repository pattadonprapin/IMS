package camt.se331.shoppingcart.controller;

import camt.se331.shoppingcart.entity.FoodIngredient;
import camt.se331.shoppingcart.service.FoodIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */

@RestController
@RequestMapping("/")
public class FoodIngredientController {

    @Autowired
    FoodIngredientService foodingredientService;



    @RequestMapping(value = "getfoodingredient",method = RequestMethod.GET)
    public List<FoodIngredient> list(){
        return foodingredientService.getFoodIngredients();
    }

    @RequestMapping(value = "foodingredient/{foodIngredientID}",method = RequestMethod.GET)
    public  FoodIngredient getFoodIngredient(@PathVariable("foodIngredientID") Long foodIngredientID){
        return foodingredientService.getFoodIngredient(foodIngredientID);
    }


    @RequestMapping(value = "foodingredient",method = RequestMethod.POST)
    public @ResponseBody
    FoodIngredient addFoodIngredient(@RequestBody FoodIngredient foodIngredient, BindingResult bindingResult){
        return foodingredientService.addFoodIngredient(foodIngredient);
    }

    @RequestMapping(value = "foodingredient/{foodIngredientID}",method = RequestMethod.PUT)
    public  FoodIngredient updateFoodIngredient(@PathVariable("foodIngredientID") Long foodIngredientID,@RequestBody FoodIngredient foodIngredient, BindingResult bindingResult) {
        return foodingredientService.updateFoodIngredient(foodIngredient);

    }

        @RequestMapping(value = "foodingredient/{foodIngredientID}", method = RequestMethod.DELETE)
        public FoodIngredient deleteFood (@PathVariable("foodIngredientID") Long foodIngredientID){
            return foodingredientService.deleteFoodIngredient(foodIngredientID);
        }


    }
