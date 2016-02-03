package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TEN10 on 2/3/2016.
 */
public interface IngredientRepository extends JpaRepository<Ingredient,Long> {



}
