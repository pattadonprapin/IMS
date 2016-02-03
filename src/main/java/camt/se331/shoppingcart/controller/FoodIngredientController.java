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
    FoodIngredientService foodIngredientService;



    @RequestMapping(value = "getfoodingredient",method = RequestMethod.GET)
    public List<FoodIngredient> list(){
        return foodIngredientService.getFoodIngredients();
    }

    @RequestMapping(value = "foodingredient/{foodIngredientID}",method = RequestMethod.GET)
    public  FoodIngredient getFoodIngredient(@PathVariable("foodIngredientID") Long foodIngredientID){
        return foodIngredientService.getFoodIngredient(foodIngredientID);
    }


    @RequestMapping(value = "foodingredient",method = RequestMethod.POST)
    public @ResponseBody
    FoodIngredient addFoodIngredient(@RequestBody FoodIngredient foodIngredient, BindingResult bindingResult){
        return foodIngredientService.addFoodIngredient(foodIngredient);
    }

    @RequestMapping(value = "foodingredient/{foodIngredientID}",method = RequestMethod.PUT)
    public  FoodIngredient updateFoodIngredient(@PathVariable("foodIngredientID") Long foodIngredientID,@RequestBody FoodIngredient foodIngredient, BindingResult bindingResult) {
        return foodIngredientService.updateFoodIngredient(foodIngredient);

    }

        @RequestMapping(value = "foodingredient/{foodIngredientID}", method = RequestMethod.DELETE)
        public FoodIngredient deleteFood (@PathVariable("foodIngredientID") Long foodIngredientID){
            return foodIngredientService.deleteFoodIngredient(foodIngredientID);
        }


    }
