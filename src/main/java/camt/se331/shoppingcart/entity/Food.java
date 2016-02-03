package camt.se331.shoppingcart.entity;



import org.hibernate.annotations.Cascade;

import javax.persistence.*;
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
    Date foodCreatedate;
    Date foodUpdateDate;






    public Food(Long foodID, String foodName, Date foodCreatedate, Date foodUpdateDate) {
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

    public Date getFoodCreatedate() {
        return foodCreatedate;
    }

    public void setFoodCreatedate(Date foodCreatedate) {
        this.foodCreatedate = foodCreatedate;
    }

    public Date getFoodUpdateDate() {
        return foodUpdateDate;
    }

    public void setFoodUpdateDate(Date foodUpdateDate) {
        this.foodUpdateDate = foodUpdateDate;
    }

    public Food() {
    }
}
