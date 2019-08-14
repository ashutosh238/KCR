/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.controller;

import com.kcr.Dao.UserDao;
import com.kcr.model.UserDetail;
import javax.servlet.http.HttpSession;
import org.h2.engine.SessionRemote;
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
public class UserController {
    @Autowired
    private UserDao userDao;
//    @Autowired
//    private HttpSession session;
    @PostMapping("/perform_login")
    public ModelAndView login(@RequestParam String username,@RequestParam String password,HttpSession session){
       String page="";
       ModelAndView mv=new ModelAndView("home");
        UserDetail user=new UserDetail();
        user=userDao.getUser(username);
        if(user.getPassword().equals(password)){
            mv.addObject("isSuccess",true);
            session.setAttribute("username", username);
        }
        else{
            mv.addObject("isError",true);
        }
        return mv;
    }
}
