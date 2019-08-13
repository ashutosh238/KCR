/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.controller;

import com.kcr.Dao.UserDao;
import com.kcr.model.UserDetail;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sharma
 */
@Controller
public class HomeController {
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private UserDao userDAO;
	
	@Autowired
	private UserDetail user;
	@GetMapping("/")
	//@RequestMapping(value="/",   method = RequestMethod.GET)
	public ModelAndView homePage()
	{
            ModelAndView mv = new ModelAndView("home");
			         System.out.println("dihfuiobvionvgiofbnotinbfgmnbkfsb;lm;lfdb");
		//categories should be available in all resources
		//httpSession.setAttribute("categories", categories);
		return mv;
		
			
	}

	//http://localhost:8080/shoppingcart/register
		@GetMapping("/register")	
		
	public ModelAndView registration()
	{
			//if the user click register, this method will call
			//--discuss tomorrow.
			//Model,  ModelAndView
			//navigate to home page
		ModelAndView mv= new ModelAndView("home");	
		
		//carry the data
		//mv.addObject("msg", "Thank you for registration");
		mv.addObject("isUserClickedRegister", true);
			
		
		return mv;
	}
	
		
		
		@PostMapping("/save")
		public ModelAndView saveUser(
				@RequestParam String emailid, 
				@RequestParam String firstname,
                                @RequestParam String lastname,
				@RequestParam String number,
				@RequestParam String address,
				//@RequestParam Character role,
				@RequestParam String password,
				@RequestParam String confirmpassword,
                                @RequestParam String question,
                                @RequestParam String answer,
                                @RequestParam String housenumber
				
				) {
                    System.out.println(emailid+":"+firstname+":"+question);
			ModelAndView mv = new ModelAndView("home");
			user.setEmailId(emailid);
                        user.setHouseNumber(Integer.parseInt(housenumber));
                        user.setName(firstname+" "+lastname);
                        user.setPassword(password);
                        user.setPhoneNumber(password);
                        user.setSecurityAnswer(answer);
                        user.setSecurityQuestion(question);
                        user.setAddress(address);
			//String value should be converted into integer
			
			// need to write one more condition.
			if (userDAO.saveUser(user)) {
				mv.addObject("msg", "user created Successfully :"+firstname+lastname);
				return mv;
			} else {
				mv.addObject("msg", "Could not create product.");

			}
			return mv;
		
                }	

}