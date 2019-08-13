/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.Dao;

import com.kcr.model.UserDetail;

/**
 *
 * @author sharma
 */
public interface UserDao {
    public boolean saveUser(UserDetail user);
}
