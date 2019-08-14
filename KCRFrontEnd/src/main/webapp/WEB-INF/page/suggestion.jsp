<%-- 
    Document   : suggestion
    Created on : 14 Aug, 2019, 11:44:06 AM
    Author     : sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>Suggestion</h2><br>
<!--Make sure the form has the autocomplete function switched off:-->
<form autocomplete="off" action="suggestion" method="post">
    <div class="autocomplete" style="width:300px;">
        <input  type="text" placeholder="Subject" name="subject">
    </div>
    <br><br>
    <div class="md-form">
        <textarea  class="md-textarea form-control" rows="3" name="message"></textarea>
        <label for="form7">Add Your Suggestion</label>
    </div>
    <input type="submit">
</form>
