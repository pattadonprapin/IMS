package camt.se331.shoppingcart.controller;

import camt.se331.shoppingcart.entity.Ingredient;
import camt.se331.shoppingcart.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */

@RestController
@RequestMapping("/")
public class IngredientController {


    @Autowired
    IngredientService ingredientService;


    @RequestMapping(value = "ingredient",method = RequestMethod.GET)
    public List<Ingredient> list(){
        return ingredientService.getIngredients();
    }

    @RequestMapping(value = "ingredient/{ingredientID}",method = RequestMethod.GET)
    public  Ingredient getIngredient(@PathVariable("ingredientID") Long ingredientID){
        return ingredientService.getIngredient(ingredientID);
    }


    @RequestMapping(value = "ingredient",method = RequestMethod.POST)
    public @ResponseBody
    Ingredient addIngredient(@RequestBody Ingredient ingredient, BindingResult bindingResult){
        return ingredientService.addIngredient(ingredient);
    }

    @RequestMapping(value = "ingredient/{ingredientID}",method = RequestMethod.PUT)
    public  Ingredient updateIngredient(@PathVariable("ingredientID") Long ingredientID,@RequestBody Ingredient ingredient, BindingResult bindingResult){
        return ingredientService.updateIngredient(ingredient);
    }

    @RequestMapping(value = "ingredient/{ingredientID}",method = RequestMethod.DELETE)
    public  Ingredient edit(@PathVariable("ingredientID") Long ingredientID){
        return ingredientService.deleteIngredient(ingredientID);
    }














}
