/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.DaoImpl;

import com.kcr.model.PaymentDetails;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.kcr.Dao.PaymentDao;

/**
 *
 * @author sharma
 */
@Repository("paymentDAO")
@Transactional
public class PaymentDetailDaoImpl implements PaymentDao{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public boolean savePayment(PaymentDetails payDetails) {
        try {
            sessionFactory.getCurrentSession().save(payDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
