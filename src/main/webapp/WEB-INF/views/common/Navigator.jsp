<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Portfolio</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Gallery</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <c:choose>      
	      <c:when test="${empty session}">	      
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
	        <li><a id="a_join"><span class="glyphicon glyphicon-log-in"></span>Join</a></li>
	      </ul>
	      </c:when>
	      <c:when test="${session.accessCode eq 'admin'}">
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>connecting</a></li>
	        <li><a id="a_join"><span class="glyphicon glyphicon-log-in"></span>disconnect</a></li>
	      </ul>
	      </c:when>
	      <c:otherwise>
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Logout</a></li>
	        <li><a id="a_join"><span class="glyphicon glyphicon-log-in"></span>Delete</a></li>
	      </ul>
	      </c:otherwise>
      </c:choose>
    </div>
  </div>
</nav>
<script>
$('#a_join').click(function(e){
	e.preventDefault()
	alert("Join")
	location.href = `${context}/location/user/Join`
	
})
</script>