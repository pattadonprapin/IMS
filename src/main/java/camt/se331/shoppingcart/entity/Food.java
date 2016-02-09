package camt.se331.shoppingcart.entity;



import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by TEN10 on 2/3/2016.
 */

@Entity
public class Food {
    @Id
    @GeneratedValue
    Long foodID;
    String foodName;
    LocalDate foodCreatedate;
    LocalDate foodUpdateDate;






    public Food(Long foodID, String foodName, LocalDate foodCreatedate, LocalDate foodUpdateDate) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodCreatedate = foodCreatedate;
        this.foodUpdateDate = foodUpdateDate;
    }

    public Long getFoodID() {
        return foodID;
    }

    public void setFoodID(Long foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public LocalDate getFoodCreatedate() {
        return foodCreatedate;
    }

    public void setFoodCreatedate(LocalDate foodCreatedate) {
        this.foodCreatedate = foodCreatedate;
    }

    public LocalDate getFoodUpdateDate() {
        return foodUpdateDate;
    }

    public void setFoodUpdateDate(LocalDate foodUpdateDate) {
        this.foodUpdateDate = foodUpdateDate;
    }

    public Food() {
    }
}
