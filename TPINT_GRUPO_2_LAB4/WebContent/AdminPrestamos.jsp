<!DOCTYPE html>
<html>
<head>
    <title>Autorizaci�n y Listado de Pr�stamos</title>
        <%@ include file="menuAdmin.jsp" %>
</head>
<body>
    <h1>Autorizaci�n y Listado de Pr�stamos</h1>

    <button onclick="mostrarPendientes()">Pr�stamos Pendientes de Autorizar</button>
    <button onclick="mostrarPrestamos()">Listado de Pr�stamos</button>

    <!-- Listado de Pr�stamos Pendientes de Autorizaci�n -->
    <div id="pendientes" class="hidden">
        <h2>Listado de Pr�stamos Pendientes de Autorizaci�n</h2>
        <table border="1">
            <tr>
                <th>ID Pr�stamo</th>
                <th>ID Cliente</th>
                <th>Monto Solicitado</th>
                <th>Estado</th>
                <th>Acciones</th>
            </tr>
            <!-- Ejemplo de pr�stamo rechazado -->
            <tr>
                <td>1</td>
                <td>1</td>
                <td>$1000.00</td>
                <td>Rechazado</td>
                <td>
                    <button onclick="autorizarPrestamo(1)">Autorizar</button>
                    <button onclick="rechazarPrestamo(1)">Rechazar</button>
                </td>
            </tr>
            <!-- Ejemplo de pr�stamo pendiente -->
            <tr>
                <td>2</td>
                <td>2</td>
                <td>$500.00</td>
                <td>Pendiente</td>
                <td>
                    <button onclick="autorizarPrestamo(2)">Autorizar</button>
                    <button onclick="rechazarPrestamo(2)">Rechazar</button>
                </td>
            </tr>
        </table>
    </div>

    <!-- Listado de Pr�stamos Autorizados y Rechazados -->
    <div id="prestamos" class="hidden">
        <h2>Listado de Pr�stamos</h2>
        <table border="1">
            <tr>
                <th>ID Pr�stamo</th>
                <th>ID Cliente</th>
                <th>Monto</th>
                <th>Estado</th>
            </tr>
            <!-- Ejemplo de pr�stamo autorizado -->
            <tr>
                <td>3</td>
                <td>3</td>
                <td>$800.00</td>
                <td>Autorizado</td>
                
            </tr>
            <tr>
                <td>4</td>
                <td>4</td>
                <td>$1200.00</td>
                <td>Rechazado</td>
            </tr>
        </table>
    </div>

    <script>
        function mostrarPendientes() {
            document.getElementById('pendientes').classList.remove('hidden');
            document.getElementById('prestamos').classList.add('hidden');
        }

        function mostrarPrestamos() {
            document.getElementById('pendientes').classList.add('hidden');
            document.getElementById('prestamos').classList.remove('hidden');
        }

    </script>
</body>
</html>
