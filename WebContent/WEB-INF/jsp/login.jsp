<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
	<table align='center' border='1' cellspacing='0'>
	<title>登陆</title>
		<h4>请登陆</h4>
			<div class="row">
		    	<div class="col-md-2">
		        	<form action="login" method="post">
		        	    <div class="form-group">
		        	        <input class="form-control" type="text" name="name" placeholder="user name" id="username" style="width:150px"/>
		        	    </div>
		        	    <div class="form-group">
		        	        <input class="form-control" type="password" name="pw" placeholder="password" id="password" style="width:150px"/>
		        	    </div>
		        	    <button class="btn btn-default" type="submit" style="margin-top: 15px" id="login">登陆</button>
		        	</form>
		        	<a href='register'><button class="btn btn-default">注册</button></a>
		    	</div>
			</div>
	</table>
</html>  
