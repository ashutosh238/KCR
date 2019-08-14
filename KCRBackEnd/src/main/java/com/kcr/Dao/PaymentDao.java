/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.Dao;

import com.kcr.model.PaymentDetails;

/**
 *
 * @author sharma
 */
public interface PaymentDao {
   public boolean savePayment(PaymentDetails payDetails);
}
