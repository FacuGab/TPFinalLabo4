<!DOCTYPE html>
<html>
<head>
    <title>Autorización y Listado de Préstamos</title>
        <%@ include file="menuAdmin.jsp" %>
</head>
<body>
    <h1>Autorización y Listado de Préstamos</h1>

    <button onclick="mostrarPendientes()">Préstamos Pendientes de Autorizar</button>
    <button onclick="mostrarPrestamos()">Listado de Préstamos</button>

    <!-- Listado de Préstamos Pendientes de Autorización -->
    <div id="pendientes" class="hidden">
        <h2>Listado de Préstamos Pendientes de Autorización</h2>
        <table border="1">
            <tr>
                <th>ID Préstamo</th>
                <th>ID Cliente</th>
                <th>Monto Solicitado</th>
                <th>Estado</th>
                <th>Acciones</th>
            </tr>
            <!-- Ejemplo de préstamo rechazado -->
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
            <!-- Ejemplo de préstamo pendiente -->
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

    <!-- Listado de Préstamos Autorizados y Rechazados -->
    <div id="prestamos" class="hidden">
        <h2>Listado de Préstamos</h2>
        <table border="1">
            <tr>
                <th>ID Préstamo</th>
                <th>ID Cliente</th>
                <th>Monto</th>
                <th>Estado</th>
            </tr>
            <!-- Ejemplo de préstamo autorizado -->
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
