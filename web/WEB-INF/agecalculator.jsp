<%-- 
    Document   : agecalculator
    Created on : Jan 28, 2022, 12:24:51 AM
    Author     : ivanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="user_age" value=""><br>
            <input type="submit" value="Age next birthday">
        </form>
         <p style="margin: 0;">${message}</p>
         <a href="http://localhost:8084/Lab03/arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
