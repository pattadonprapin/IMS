package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Calculate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TEN10 on 2/5/2016.
 */
public interface CalculateRepository   extends JpaRepository<Calculate,Long> {
}
