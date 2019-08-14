/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author sharma
 */
@Entity
@Table(name="USER")
@Component
public class UserDetail implements Serializable{
    public UserDetail(){
        
    }

private int seqId;	
private String name;
private String emailId;
private String password;
private String phoneNumber;
private String securityQuestion;
private String securityAnswer;
private int houseNumber;
private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

@GeneratedValue(strategy = GenerationType.AUTO)
public int getSeqId() {
	return seqId;
}
public void setSeqId(int seqId) {
	this.seqId = seqId;
}
@Column(name = "name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Id
@Column(name = "emailid")
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Column(name = "password")
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name = "phonenumber")
public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Column(name = "securityQuestion")
public String getSecurityQuestion() {
	return securityQuestion;
}
public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}
@Column(name = "securityAnswer")
public String getSecurityAnswer() {
	return securityAnswer;
}
public void setSecurityAnswer(String securityAnswer) {
	this.securityAnswer = securityAnswer;
}
@Column(name = "houseNumber")
public int getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
}



}
