<%@ page language="java" contentType="text/html; charset=UTF-8"

 pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration form</title>

 </head>
 <body>
    <h1>Hello Enter the details for registering</h1>
    <form action="register" method="post">
        <label for="id">ID:</label><br>
        <input type="text" name="id"><br>
        <label for="name">Name:</label><br>
        <input type="text" name="name"><br>
        <label for="city">City:</label><br>
        <input type="text" name="city"><br>
        <label for="clg">College:</label><br>
        <input type="text" name="college"><br>

       <button name="submit">Submit</button>


    </form>

    <form action="delete" method="post">
        <label for="op">OP:</label><br>
        <input type="text" name="op"><br>

       <button name="submit">Submit</button>


    </form>













</body>
</html>
