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
public class Ingredient {


    @Id
    @GeneratedValue
    Long ingredientID;
    String ingredientName;
    String ingredientType;
    Double ingredientAmount;
    Date purchaseDate;
    Date expiredDate;

    public Ingredient(String ingredientName, String ingredientType, Double ingredientAmount, Date purchaseDate, Date expiredDate) {
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
        this.ingredientAmount = ingredientAmount;
        this.purchaseDate = purchaseDate;
        this.expiredDate = expiredDate;
    }

    public Ingredient(long id,String ingredientName, String ingredientType, Double ingredientAmount, Date purchaseDate, Date expiredDate) {
        this.ingredientID=id;
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
        this.ingredientAmount = ingredientAmount;
        this.purchaseDate = purchaseDate;
        this.expiredDate = expiredDate;
    }

    public Ingredient(long l, String cheese, String s, double v, Date date, Date date1) {
        this.ingredientID=l;
        this.ingredientName = cheese;
        this.ingredientType = s;
        this.ingredientAmount = v;
        this.purchaseDate = date;
        this.expiredDate = date1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (expiredDate != null ? !expiredDate.equals(that.expiredDate) : that.expiredDate != null) return false;
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
        return result;
    }

    public Ingredient(Long ingredientID, String ingredientName, String ingredientType, Double ingredientAmount, Date purchaseDate, Date expiredDate) {
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
        this.ingredientAmount = ingredientAmount;
        this.purchaseDate = purchaseDate;
        this.expiredDate = expiredDate;
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
}
