<%--
  Date: 11/07/2025
  Time: 9:37 am
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperature Converter</title>
</head>
<body>
    <h1>Celsius To Fahrenheit Conversion</h1>
    <form action="/convert" method="post">
        <input type="number" name="temperature">
        <input type="submit" value="submit">
    </form>
</body>
</html>
