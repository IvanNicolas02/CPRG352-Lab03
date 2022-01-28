<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 28, 2022, 1:30:35 AM
    Author     : ivanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator”</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_value" value="${firstValue}">
            <br>
            <label>Second:</label>
            <input type="text" name="second_value" value="${secondValue}">
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <p style="margin-bottom: 0;">Result: ${message}</p>
        <a href="http://localhost:8084/Lab03/age">Arithmetic Calculator</a>
    </body>
</html>
