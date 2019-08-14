/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.controller;

import com.kcr.Dao.SuggestionDao;
import com.kcr.model.Suggestion;
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
public class SuggestionController {
    @Autowired
    private SuggestionDao suggestionDAO;
    
    @PostMapping("/suggestion")
    public ModelAndView addSuggestion(@RequestParam String subject,
                                      @RequestParam String message,HttpSession session ){
        ModelAndView mv=new ModelAndView("home");
        
        System.out.println("sessionUser:::::::::::::"+session.getAttribute("username"));
        Suggestion sug=new Suggestion();
        sug.setEmailid((String)session.getAttribute("username"));
        sug.setMessage(message);
        sug.setStatus("open");
        sug.setRemarks("Open");
        sug.setSubject(subject);
        suggestionDAO.saveSuggestion(sug);
        return mv;
    }
}
