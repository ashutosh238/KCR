/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.DaoImpl;

import com.kcr.Dao.SuggestionDao;
import com.kcr.model.Suggestion;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharma
 */
@Repository("suggestionDAO")
@Transactional
public class SuggestionDaoImpl implements SuggestionDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public boolean saveSuggestion(Suggestion suggestion) {
        try {
            sessionFactory.getCurrentSession().save(suggestion);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
