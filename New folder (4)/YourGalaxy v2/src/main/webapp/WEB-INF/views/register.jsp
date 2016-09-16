<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<form:form action="registerUser" commandName="reg">
Username:<form:input path="username"/>
Emailid:<form:input path="emailid"/>
Password:<form:password path="password"/>
<input type="submit" value="Register"/>
</form:form>
</body>
</html>