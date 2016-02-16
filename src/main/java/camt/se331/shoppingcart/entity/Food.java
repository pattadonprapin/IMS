package camt.se331.shoppingcart.entity;



import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

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

    @OneToMany(fetch= FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    List<FoodIngredient> foodingredients=new ArrayList<FoodIngredient>();

    @OneToMany(fetch= FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    Set<Image> images = new HashSet<>();

    public Food(String foodName, LocalDate foodCreatedate, LocalDate foodUpdateDate, List<FoodIngredient> foodingredients, Set<Image> images) {
        this.foodName = foodName;
        this.foodCreatedate = foodCreatedate;
        this.foodUpdateDate = foodUpdateDate;
        this.foodingredients = foodingredients;
        this.images = images;
    }

    public Food() {
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

    public List<FoodIngredient> getFoodingredients() {
        return foodingredients;
    }

    public void setFoodingredients(List<FoodIngredient> foodingredients) {
        this.foodingredients = foodingredients;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (foodCreatedate != null ? !foodCreatedate.equals(food.foodCreatedate) : food.foodCreatedate != null)
            return false;
        if (foodID != null ? !foodID.equals(food.foodID) : food.foodID != null) return false;
        if (foodName != null ? !foodName.equals(food.foodName) : food.foodName != null) return false;
        if (foodUpdateDate != null ? !foodUpdateDate.equals(food.foodUpdateDate) : food.foodUpdateDate != null)
            return false;
        if (foodingredients != null ? !foodingredients.equals(food.foodingredients) : food.foodingredients != null)
            return false;
        if (images != null ? !images.equals(food.images) : food.images != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = foodID != null ? foodID.hashCode() : 0;
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        result = 31 * result + (foodCreatedate != null ? foodCreatedate.hashCode() : 0);
        result = 31 * result + (foodUpdateDate != null ? foodUpdateDate.hashCode() : 0);
        result = 31 * result + (foodingredients != null ? foodingredients.hashCode() : 0);
        result = 31 * result + (images != null ? images.hashCode() : 0);
        return result;
    }
}
