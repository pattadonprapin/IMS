package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.CalculateDao;
import camt.se331.shoppingcart.entity.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TEN10 on 2/5/2016.
 */
@Service
public class CalculateServiceImpl implements CalculateService {

    @Autowired
    CalculateDao calculateDao;

    @Override
    public Calculate addCalculate(Calculate calculate) {
        return calculateDao.addCalculate(calculate);
    }
}
