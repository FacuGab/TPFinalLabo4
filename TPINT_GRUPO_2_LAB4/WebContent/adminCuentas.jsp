<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.entidad.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
<style type="text/css">
	<jsp:include page="css/style.css"></jsp:include>
</style>
<title>Administrar Cuentas - Admin</title>

</head>
<body>
<% 
	Usuario usuario = new Usuario();
 	if(session.getAttribute("Usuario")!=null){	
 		usuario = (Usuario)session.getAttribute("Usuario");
 	}
	
	%>

<header class="header"> 
	<div>
		<a href="inicioAdmin.jsp">
			<img style = "float: left; margin: 2px 20px 10px 0; ; " src="img/logo.jpg"  alt="logo" width="50" height="50"  />
		</a>
	</div>
	<div class="logged">
		<span><%=usuario.getUsuario()%></span>
		<span>LOGGUEADO</span>
	</div>
</header>
 

<div class="menu">
<a href="inicioAdmin.jsp" class="volver"> <span class="volverIcon fa fa-home"></span> Volver</a>

<h1>Administrar Cuentas</h1>
<span>Seleccione la opci�n deseada: </span>
		<div class="opcionesMenu">
			<a href="adminAltaCuenta.jsp"> Alta nuevo Cuentas </a>
			<a href="adminBajaCuenta.jsp" > Dar de Baja Cuentas </a>
		</div>
</div>


</body>
</html>