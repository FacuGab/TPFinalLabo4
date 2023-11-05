<%@page import="DatosImpl.TipoCuentaDaoImpl"%>
<%@page import="Entidad.Cuenta"%>
<%@page import="Entidad.TipoCuenta"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>Gestion de Cuentas</title>
<%@ include file="menuAdmin.jsp"%>
</head>
<body>
	<h1>Gestion de Cuentas</h1>

	<form id="formAgregarCuenta" action="ServletCuenta" method="get">
		<h2>Agregar Nueva Cuenta</h2>
		<label>ID del Cliente: </label> <input type="text" name="idCliente"><br>
		<label>Tipo de Cuenta:</label> <select name="tipoCuenta">
			<% 
            TipoCuentaDaoImpl tcDao = new TipoCuentaDaoImpl();
            ArrayList<TipoCuenta> tiposCuenta = tcDao.ListarTodas();
            if (tiposCuenta != null) {
                for (TipoCuenta tipo : tiposCuenta) { %>
			<option value="<%= tipo.getIdTipoCuenta() %>"><%= tipo.getDescripcion() %></option>
			<% }
            } %>
		</select><br> <input type="submit" value="Agregar Cuenta"
			name="btnAceptar">
	</form>

	<%
    boolean agregado = false;
    if(request.getAttribute("agregado")!=null)
        agregado = (boolean)request.getAttribute("agregado");

    %>

	<% if(agregado == true) 
    {
    %>
	Cuenta asignada correctamente
	<%} %>

	<% String mensaje = (String) request.getAttribute("mensaje");
       if (mensaje != null && !mensaje.isEmpty()) { %>
	<p><%= mensaje %></p>
	<% } %>

	<br>
	<form method="post" action="ServletCuenta">
		<input type="submit" name="btnMostrarCuentas" value="Mostrar cuentas">
	</form>
	<div id="listaCuentas">
		<h2>Listado de Cuentas</h2>

		<% 
        ArrayList<Cuenta> listaCuentas= null;
        if(request.getAttribute("listaCuentas")!=null)
        {
            listaCuentas= (ArrayList<Cuenta>) request.getAttribute("listaCuentas");
        }
        %>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>IDCliente</th>
				<th>Cliente</th>
				<th>Fecha de Alta</th>
				<th>Tipo de Cuenta</th>
				<th>Numero de Cuenta</th>
				<th>CBU</th>
				<th>Saldo</th>
				<th></th>
				<th></th>
			</tr>
			<%  if(listaCuentas!=null)
            for(Cuenta cuenta : listaCuentas) 
            {
        %>
			<tr>
				<form action="ServletCuenta" method="post">
				<td id="idCuenta"><%=cuenta.getIdCuenta() %> <input
					type="hidden" name="idUsuario" value="<%=cuenta.getIdCuenta() %>"></td>
				<td id="idCliente"><%=cuenta.getCliente().getIdCliente() %> <input
					type="hidden" name="idCliente" value="<%=cuenta.getIdCuenta() %>"></td>
				<td><%=cuenta.getCliente().getApeliido().concat(" ").concat(cuenta.getCliente().getNombre()) %></td>
				<td><%=cuenta.getFechaAlta() %></td>
				<td><%=cuenta.getTipoC().getDescripcion() %></td>
				<td><%=cuenta.getNumeroCuenta() %></td>
				<td><%=cuenta.getCbu() %></td>
				<td><%=cuenta.getSaldo() %></td>
				<td><input type="submit" name="btnEliminar" value="Eliminar">
				</td>
				<td><input type="submit" name="btnModificar"
					value="Modificar Cuenta" class="btnModificarCuenta"></td>
				</form>
			</tr>
			<%  } %>
		</table>
	</div>

	<form id="formModificarCuenta" action="ServletCuenta" method="post"
		style="display: none;">
		<h2>Modificar Cuenta</h2>
		<label>ID de la Cuenta a Modificar:</label> <input type="text"
			name="idCuentaModificar" id="idCuentaModificar" readonly> <br>
		<label>ID del Cliente:</label> <input type="text"
			name="idClienteModificar" id="idClienteModificar"> <br>
		<label>Tipo de Cuenta:</label> <select name="tipoCuentaMod"
			id="tipoCuentaModificar">
			<% 
            if (tiposCuenta != null) {
                for (TipoCuenta tipo : tiposCuenta) { %>
			<option value="<%= tipo.getIdTipoCuenta() %>"><%= tipo.getDescripcion() %></option>
			<% }
            } %>
		</select> <br> <label>Numero de Cuenta:</label> <input type="text"
			name="numeroCuentaModificar" id="numeroCuentaModificar"
			placeholder="Número de Cuenta"> <br> <label>CBU
			de la Cuenta:</label> <input type="text" name="cbuCuentaModificar"
			id="cbuCuentaModificar" placeholder="CBU de la Cuenta"> <br>
		<label>Saldo de la Cuenta:</label> <input type="text"
			name="saldoCuentaModificar" id="saldoCuentaModificar"
			placeholder="Saldo de la Cuenta"> <br> <input
			type="submit" name="btnConfirmarModificacion"
			value="Confirmar Modificacion">
	</form>

	<%
    boolean modificado = false;
    if(request.getAttribute("modificado")!=null)
        modificado = (boolean)request.getAttribute("modificado");
    %>

	<% if(modificado == true) 
    {
    %>
	Cuenta modificado correctamente
	<%} %>

	<script>
        document.addEventListener('DOMContentLoaded', function() {
            const btnModificarCuenta = document.querySelectorAll('.btnModificarCuenta');
            const formModificarCuenta = document.getElementById('formModificarCuenta');

            function mostrarFormularioModificacion(event) {
                event.preventDefault();
                formModificarCuenta.style.display = 'block';

                // Captura el ID de la cuenta desde el botón presionado
                const idCuentaModificar = document.getElementById('idCuenta').value;

                // Obtener los datos de la fila seleccionada
                const row = this.closest('tr'); 

                const cells = row.getElementsByTagName('td');
                const idcm = cells[0].innerText;
                const nombreCliente = cells[1].innerText; 
                const tipoCuenta = cells[4].innerText;
                const numeroCuenta = cells[5].innerText;
                const cbu = cells[6].innerText;
                const saldo = cells[7].innerText;

                // Asignar los datos al formulario de modificación
                document.getElementById('idCuentaModificar').value = idcm;
                document.getElementById('idClienteModificar').value = nombreCliente;
                document.getElementById('numeroCuentaModificar').value = numeroCuenta;
                document.getElementById('cbuCuentaModificar').value = cbu;
                document.getElementById('saldoCuentaModificar').value = saldo;
                
                const selectTipoCuenta = document.getElementById('tipoCuentaModificar');

                // Iterar sobre las opciones del select
                const tipoCuentaValue = tipoCuenta; // Asignando el valor de tipoCuenta a tipoCuentaValue

                for (let i = 0; i < selectTipoCuenta.options.length; i++) {
                    if (selectTipoCuenta.options[i].text === tipoCuentaValue) {
                        selectTipoCuenta.selectedIndex = i;
                        break;
                    }
                }

            }

            // Asignar evento clic a cada botón "Modificar Cuenta"
            for (let i = 0; i < btnModificarCuenta.length; i++) {
                btnModificarCuenta[i].addEventListener('click', mostrarFormularioModificacion);
            }
        });
    </script>
</body>
</html>
