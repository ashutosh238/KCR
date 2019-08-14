
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet"  href="/resources/default.css" type="text/css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="/resources/vallidate.js" type="text/javascript"></script>
        <script src="/resources/js/payment.js" type="text/javascript"></script>
        <script src="/resources/js/suggestion.js" type="text/javascript"></script>
    </head>
    <body>

<h4><em><mark>${msg}</mark></em></h4>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark navmargin">
  <div class="collapse navbar-collapse navbar-dark bg-dark" id="navbarNavDropdown"> 
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="register">Register</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login">Login</a>
      </li>
    </ul>
  </div>
</nav>

<div>
        <c:if test="${isUserClickedRegister==true}">
		<jsp:include page="register.jsp"></jsp:include>
	</c:if>
    <c:if test="${isUserClickedLogin==true}">
        <jsp:include page="login.jsp"></jsp:include>
    </c:if>
    <c:if test="${isSuccess==true}">
        <jsp:include page="success.jsp"></jsp:include>
    </c:if>
    <c:if test="${isError==true}">
        <jsp:include page="error.jsp"></jsp:include>
    </c:if>
</div>
</body>
</html>
