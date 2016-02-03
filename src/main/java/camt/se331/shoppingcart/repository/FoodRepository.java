package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface FoodRepository extends JpaRepository<Food,Long> {
}
