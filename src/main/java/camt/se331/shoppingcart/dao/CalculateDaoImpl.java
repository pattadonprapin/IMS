package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Calculate;
import camt.se331.shoppingcart.repository.CalculateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by TEN10 on 2/5/2016.
 */

@Repository
public class CalculateDaoImpl implements  CalculateDao {

    @Autowired
    CalculateRepository calculateRepository;

    @Override
    public Calculate addCalculate(Calculate calculate) {
        return calculateRepository.save(calculate);
    }

}
