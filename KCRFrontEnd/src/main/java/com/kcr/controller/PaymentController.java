/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.controller;

import com.kcr.Dao.PaymentDao;
import com.kcr.model.PaymentDetails;
import java.text.ParseException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sharma
 */
@Controller
public class PaymentController {
    @Autowired
    private PaymentDao paymentDAO;
    @PostMapping("/payment")
		public ModelAndView savePayment(
				@RequestParam String concept,
                                @RequestParam String description,
                                @RequestParam String amount,
                                @RequestParam String status,
                                @RequestParam String date,
                                HttpSession session
				) throws ParseException {
                    ModelAndView mv=new ModelAndView("home");
			PaymentDetails payDetail=new PaymentDetails();
                        payDetail.setConcept(concept);
                        payDetail.setCreditAmount(Double.valueOf(amount));
                        payDetail.setDueDate(date);
                        payDetail.setEmailId((String)session.getAttribute("username"));
                        payDetail.setPaiddate(date);
                        payDetail.setDescription(description);
                        payDetail.setDueAmount(Double.valueOf(amount));
                        payDetail.setStatus(status);
                        
			if (paymentDAO.savePayment(payDetail)) {
				mv.addObject("msg", "Payment details saved successfully .");
				return mv;
			} else {
				mv.addObject("msg", "Could not save details please try again .");

			}
			return mv;
		
                }	

}
