<%-- 
    Document   : register
    Created on : 13 Aug, 2019, 10:56:22 AM
    Author     : sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <form action="save" method="post" id="loginForm">      
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>KCR Society </p>
                        <br/>
                    </div>
                    
                    <div class="col-md-9 register-right">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Society Registration</h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" class="form-control" name="firstname" placeholder="First Name *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" name="lastname" placeholder="Last Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Password *" value="" name="password" id="password"/>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control"  placeholder="Confirm Password *" value="" name="confirmpassword" id="confirmpassword" />
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Your Email *" value="" name="emailid"/>
                                        </div>
                                        
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" value="male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" value="female">
                                                    <span>Female </span> 
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" minlength="10" maxlength="10" name="number" class="form-control" placeholder="Your Phone *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control"  name="question">
                                                <option class="hidden"  selected disabled>Please select your Sequrity Question</option>
                                                <option value="What is your Birthdate?">What is your Birthdate?</option>
                                                <option value="What is Your old Phone Number">What is Your old Phone Number</option>
                                                <option value="What is your Pet Name?">What is your Pet Name?</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Enter Your Answer *" value="" name="answer" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Enter Your Address *" value="" name="address" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="House Number *" value="" name="housenumber" />
                                        </div>
                                        <input type="submit" class="btnRegister"  value="Register" onClick="validatePassword();"/>
                                    </div>
                                </div>
                            </div>
                            

            </div>
</form>

</body>
</html>
