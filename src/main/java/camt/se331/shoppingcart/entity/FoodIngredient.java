package camt.se331.shoppingcart.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by TEN10 on 2/3/2016.
 */

@Entity
public class FoodIngredient {


    @Id
    @GeneratedValue
    Long     foodIngredientID;
    Double foodIngredientAmount;
    Date foodIngredientCreatedate;
    Date foodIngredientUpdatedate;

    @OneToMany(fetch= FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    List<Food> foods=new ArrayList<>();

    @OneToMany(fetch= FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    List<Ingredient> ingredients=new ArrayList<>();

    public FoodIngredient(Long foodIngredientID, Double foodIngredientAmount, Date foodIngredientCreatedate, Date foodIngredientUpdatedate) {
        this.foodIngredientID = foodIngredientID;
        this.foodIngredientAmount = foodIngredientAmount;
        this.foodIngredientCreatedate = foodIngredientCreatedate;
        this.foodIngredientUpdatedate = foodIngredientUpdatedate;
    }

    public FoodIngredient(Long foodIngredientID,Double foodIngredientAmount, Date foodIngredientCreatedate, Date foodIngredientUpdatedate, List<Food> foods, List<Ingredient> ingredients) {
        this.foodIngredientID = foodIngredientID;
        this.foodIngredientAmount = foodIngredientAmount;
        this.foodIngredientCreatedate = foodIngredientCreatedate;
        this.foodIngredientUpdatedate = foodIngredientUpdatedate;
        this.foods = foods;
        this.ingredients = ingredients;
    }

    public FoodIngredient() {
    }

    public Long getFoodIngredientID() {
        return foodIngredientID;
    }

    public void setFoodIngredientID(Long foodIngredientID) {
        this.foodIngredientID = foodIngredientID;
    }

    public Double getFoodIngredientAmount() {
        return foodIngredientAmount;
    }

    public void setFoodIngredientAmount(Double foodIngredientAmount) {
        this.foodIngredientAmount = foodIngredientAmount;
    }

    public Date getFoodIngredientCreatedate() {
        return foodIngredientCreatedate;
    }

    public void setFoodIngredientCreatedate(Date foodIngredientCreatedate) {
        this.foodIngredientCreatedate = foodIngredientCreatedate;
    }

    public Date getFoodIngredientUpdatedate() {
        return foodIngredientUpdatedate;
    }

    public void setFoodIngredientUpdatedate(Date foodIngredientUpdatedate) {
        this.foodIngredientUpdatedate = foodIngredientUpdatedate;
    }
}
