<%@page import="Entidad.Cuenta"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Cuentas</title>
        <%@ include file="menuAdmin.jsp" %>
    <script>
        function modificarCuenta(idCuenta, idCliente, tipoCuenta, numeroCuenta) {
            document.getElementById("idCuentaModificar").value = idCuenta;
            document.getElementById("idClienteModificar").value = idCliente;
            document.getElementById("tipoCuentaModificar").value = tipoCuenta;
            document.getElementById("numeroCuentaModificar").value = numeroCuenta;

            document.getElementById("formModificarCuenta").style.display = "block";

            document.getElementById("formAgregarCuenta").style.display = "none";
        }
    </script>
</head>
<body>
    <h1>Gestión de Cuentas</h1>

    <form id="formAgregarCuenta" action="" method="post">
        <h2>Agregar Nueva Cuenta</h2>
        <label>ID del Cliente: </label>
        <input type="text" name="idClienteAgregar"><br>
        <label>Tipo de Cuenta:</label>
        <select name="tipoCuentaAgregar">
            <option value="Caja de ahorro">Caja de ahorro</option>
            <option value="Cuenta corriente">Cuenta corriente</option>
        </select><br>
        <input type="text" name="numeroCuentaAgregar" placeholder="Número de Cuenta"><br>
        <input type="submit" name="action" value="Agregar Cuenta">
    </form>

    <form id="formModificarCuenta" action="" method="post" style="display: none;">
        <h2>Modificar Cuenta</h2>
        <label>ID de la Cuenta a Modificar: </label>
        <input type="text" name="idCuentaModificar" id="idCuentaModificar" readonly><br>
        <label>ID del Cliente: </label>
        <input type="text" name="idClienteModificar" id="idClienteModificar"><br>
        <label>Tipo de Cuenta:</label>
        <select name="tipoCuentaModificar" id="tipoCuentaModificar">
            <option value="Caja de ahorro">Caja de ahorro</option>
            <option value="Cuenta corriente">Cuenta corriente</option>
        </select><br>
        <input type="text" name="numeroCuentaModificar" id="numeroCuentaModificar" placeholder="Número de Cuenta"><br>
        <input type="submit" name="action" value="Modificar Cuenta">
    </form>
<br>
<form method="post" action="ServletCuenta">
    <input type="submit" name="btnMostrarCuentas" value="Mostrar cuentas">
</form>
    <div id="listaCuentas" >
    <h2>Listado de Cuentas</h2>
      
    <% 
	ArrayList<Cuenta> listaCuentas= null;
	if(request.getAttribute("listaCuentas")!=null)
	{
		listaCuentas= (ArrayList<Cuenta>) request.getAttribute("listaCuentas");
	}

 %>

<table border="1">
	<tr> <th>ID</th>  <th>Cliente</th>  <th>Fecha de Alta</th> <th>Tipo de Cuenta</th> <th>Numero de Cuenta</th> <th>CBU</th> <th>Saldo</th> <th></th> </tr>
	<%  if(listaCuentas!=null)
		for(Cuenta cuenta : listaCuentas) 
		{
	%>
	<tr>  
	     <form action="servletUsuario" method="post">
	     <td><%=cuenta.getIdCuenta() %> <input type="hidden" name="idUsuario" value="<%=cuenta.getIdCuenta() %>"> </td>
	     <td><%=cuenta.getCliente().getApeliido().concat(" ").concat(cuenta.getCliente().getNombre()) %></td>    
	     <td><%=cuenta.getFechaAlta() %></td>
	     <td><%=cuenta.getTipoC().getDescripcion() %></td> 
	     <td><%=cuenta.getNumeroCuenta() %></td>
	     <td><%=cuenta.getCbu() %></td>
	     <td><%=cuenta.getSaldo() %></td>
	     <td> <input type="submit" name="btnEliminar" value="Eliminar"> </td>  
	     </form>  
	</tr>
	<%  } %>

</table>
 </div>
</body>
</html>
