<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
    <h2>Inicio de Sesión</h2>
    <form action="loginCheck.jsp" method="post">
        <label for="username">Usuario:</label>
        <input type="text" name="username" id="username"><br><br>
        
        <label for="password">Contraseña:</label>
        <input type="password" name="password" id="password"><br><br>
        
        <input type="submit" value="Iniciar sesión">
    </form>
</body>
</html>

