<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 9:29:28 AM
    Author     : 808278
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value=${first}><br/>
            Second: <input type="text" name="second" value=${second}><br/>
            <input type="submit" name="calculate" value="+">
            <input type="submit" name="calculate" value="-">
            <input type="submit" name="calculate" value="*">
            <input type="submit" name="calculate" value="%">
        </form>
        <div>Result: ${message}</div>
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
