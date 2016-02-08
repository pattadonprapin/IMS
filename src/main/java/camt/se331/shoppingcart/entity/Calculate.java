package camt.se331.shoppingcart.entity;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by TEN10 on 2/5/2016.
 */
@Entity
public class Calculate {

    @Id
    @GeneratedValue
    Long calculateID;
    int dishAmount;
    Date date;

    public Calculate(Long calculateID, int dishAmount, Date date) {
        this.calculateID = calculateID;
        this.dishAmount = dishAmount;
        this.date = date;
    }


    public Calculate() {
    }


    public Long getCalculateID() {
        return calculateID;
    }

    public void setCalculateID(Long calculateID) {
        this.calculateID = calculateID;
    }

    public int getDishAmount() {
        return dishAmount;
    }

    public void setDishAmount(int dishAmount) {
        this.dishAmount = dishAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculate calculate = (Calculate) o;

        if (dishAmount != calculate.dishAmount) return false;
        if (calculateID != null ? !calculateID.equals(calculate.calculateID) : calculate.calculateID != null)
            return false;
        if (date != null ? !date.equals(calculate.date) : calculate.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = calculateID != null ? calculateID.hashCode() : 0;
        result = 31 * result + dishAmount;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
