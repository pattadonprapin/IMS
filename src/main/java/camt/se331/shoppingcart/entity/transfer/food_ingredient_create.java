package camt.se331.shoppingcart.entity.transfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Entity
public class food_ingredient_create {
    @Id
    @GeneratedValue
    Long foodingredientID;
   Double foodingredientAmount;
    Date foodingredientCreatedate;
    Date foodingredientUpdatedate;

    public food_ingredient_create(Long foodingredientID, Double foodingredientAmount, Date foodingredientCreatedate, Date foodingredientUpdatedate) {
        this.foodingredientID = foodingredientID;
        this.foodingredientAmount = foodingredientAmount;
        this.foodingredientCreatedate = foodingredientCreatedate;
        this.foodingredientUpdatedate = foodingredientUpdatedate;
    }

    public Long getFoodingredientID() {
        return foodingredientID;
    }

    public void setFoodingredientID(Long foodingredientID) {
        this.foodingredientID = foodingredientID;
    }

    public Double getFoodingredientAmount() {
        return foodingredientAmount;
    }

    public void setFoodingredientAmount(Double foodingredientAmount) {
        this.foodingredientAmount = foodingredientAmount;
    }

    public Date getFoodingredientCreatedate() {
        return foodingredientCreatedate;
    }

    public void setFoodingredientCreatedate(Date foodingredientCreatedate) {
        this.foodingredientCreatedate = foodingredientCreatedate;
    }

    public Date getFoodingredientUpdatedate() {
        return foodingredientUpdatedate;
    }

    public void setFoodingredientUpdatedate(Date foodingredientUpdatedate) {
        this.foodingredientUpdatedate = foodingredientUpdatedate;
    }
}
