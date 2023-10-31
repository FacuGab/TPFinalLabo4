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

    <h2>Listado de Cuentas</h2>
    <table border="1">
        <tr>
            <th>ID de Cuenta</th>
            <th>ID de Cliente</th>
            <th>Tipo de Cuenta</th>
            <th>Número de Cuenta</th>
            <th>Acciones</th>
        </tr>
        <tr>
            <td>1</td>
            <td>1</td>
            <td>Caja de ahorro</td>
            <td>12345-67890</td>
            <td>
                <button onclick="modificarCuenta(1, 1, 'Caja de ahorro', '12345-67890')">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
    </table>
</body>
</html>
