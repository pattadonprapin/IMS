package camt.se331.shoppingcart.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

/**
 * Created by TEN10 on 2/3/2016.
 */
@Entity
public class Ingredient {


    @Id
    @GeneratedValue
    Long ingredientID;
    String ingredientName;
    String ingredientType;
    Double ingredientAmount;
    Date purchaseDate;
    Date expiredDate;

    @OneToMany(fetch= FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    List<FoodIngredient> foodingredients=new ArrayList<FoodIngredient>();


    public Ingredient(Long ingredientID, String ingredientName, String ingredientType, Double ingredientAmount, Date purchaseDate, Date expiredDate, List<FoodIngredient> foodingredients) {
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
        this.ingredientAmount = ingredientAmount;
        this.purchaseDate = purchaseDate;
        this.expiredDate = expiredDate;
        this.foodingredients = foodingredients;
    }

    public Ingredient() {
    }

    public Long getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(Long ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public Double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(Double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public List<FoodIngredient> getFoodingredients() {
        return foodingredients;
    }

    public void setFoodingredients(List<FoodIngredient> foodingredients) {
        this.foodingredients = foodingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (expiredDate != null ? !expiredDate.equals(that.expiredDate) : that.expiredDate != null) return false;
        if (foodingredients != null ? !foodingredients.equals(that.foodingredients) : that.foodingredients != null)
            return false;
        if (ingredientAmount != null ? !ingredientAmount.equals(that.ingredientAmount) : that.ingredientAmount != null)
            return false;
        if (ingredientID != null ? !ingredientID.equals(that.ingredientID) : that.ingredientID != null) return false;
        if (ingredientName != null ? !ingredientName.equals(that.ingredientName) : that.ingredientName != null)
            return false;
        if (ingredientType != null ? !ingredientType.equals(that.ingredientType) : that.ingredientType != null)
            return false;
        if (purchaseDate != null ? !purchaseDate.equals(that.purchaseDate) : that.purchaseDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ingredientID != null ? ingredientID.hashCode() : 0;
        result = 31 * result + (ingredientName != null ? ingredientName.hashCode() : 0);
        result = 31 * result + (ingredientType != null ? ingredientType.hashCode() : 0);
        result = 31 * result + (ingredientAmount != null ? ingredientAmount.hashCode() : 0);
        result = 31 * result + (purchaseDate != null ? purchaseDate.hashCode() : 0);
        result = 31 * result + (expiredDate != null ? expiredDate.hashCode() : 0);
        result = 31 * result + (foodingredients != null ? foodingredients.hashCode() : 0);
        return result;
    }
}
