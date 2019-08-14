/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr;

import com.kcr.Dao.UserDao;
import com.kcr.model.UserDetail;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author sharma
 */
public class userTest {
	
	 static UserDao userDAO;
@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.kcr");
		context.refresh();
                userDAO = (UserDao)context.getBean("userDAO");
                System.out.println("dkfhisodhfiosdhfo");
        }
        
        public void save(){
           UserDetail user=new UserDetail();
            user.setEmailId("avfdvfc@vvvvxvxvgmail.com");
            user.setHouseNumber(696);
            user.setName("Afsh");
            user.setPassword("passd");
            user.setPhoneNumber("735108");
            user.setSecurityAnswer("secubfgbnswer");
            user.setSecurityQuestion("securbfgestion");
            boolean result=userDAO.saveUser(user);
            Assert.assertEquals("save user",true,result );
        }
}
