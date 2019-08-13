/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.DaoImpl;

import com.kcr.Dao.UserDao;
import com.kcr.model.UserDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharma
 */
@Repository("userDAO")
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
    private SessionFactory sessionFactory;
	@Override
        public boolean saveUser(UserDetail user) {
		try {
            sessionFactory.getCurrentSession().save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
	}

