<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Clientes</title>
    <style>
        .oculto {
            display: none;
        }
    </style>
    <%@ include file="menuAdmin.jsp" %>
</head>
<body>
    <h1>Gestión de Clientes</h1>
    
    <button onclick="mostrarFormulario()">Agregar</button>

    <div id="formulario" class="oculto"> 
        <h2>Datos del cliente</h2> 
        <form method="post"> <!-- el action="" deberia ser un servlet para guardar al cliente-->
            <input type="hidden" id="idCliente" name="idCliente" value="">
            DNI: <input type="text" id="dni" name="dni"><br>
            CUIL: <input type="text" id="cuil" name="cuil"><br>
            Nombre: <input type="text" id="nombre" name="nombre"><br>
            Apellido: <input type="text" id="apellido" name="apellido"><br>
            Género: 
            <select id="genero" name="genero">
                <option value="masculino">Masculino</option>
                <option value="femenino">Femenino</option>
                <option value="otro">Otro</option>
            </select><br>
            Nacionalidad: <input type="text" id="nacionalidad" name="nacionalidad"><br>
            Fecha de Nacimiento: <input type="date" id="fechaNacimiento" name="fechaNacimiento"><br>
            Dirección: <input type="text" id="direccion" name="direccion"><br>
            Localidad: <input type="text" id="localidad" name="localidad"><br>
            Provincia: <input type="text" id="provincia" name="provincia"><br>
            Correo Electrónico: <input type="email" id="correoElectronico" name="correoElectronico"><br>
            Teléfono: <input type="text" id="telefono" name="telefono"><br>
            <input type="submit" value="Guardar Cliente">
        </form>
    </div>

    <h2>Listado de Clientes</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>DNI</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Acciones</th>
        </tr>
        <tr>
            <td>1</td>
            <td>11111111</td>
            <td>Homero</td>
            <td>Simpson</td>
            <td>
                <button onclick="editarCliente(1)">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
        <tr>
            <td>2</td>
            <td>22222222</td>
            <td>Marge</td>
            <td>Simpson</td>
            <td>
                <button onclick="editarCliente(2)">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
        <tr>
            <td>3</td>
            <td>33333333</td>
            <td>Bart</td>
            <td>Simpson</td>
            <td>
                <button onclick="editarCliente(3)">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
        <tr>
            <td>4</td>
            <td>44444444</td>
            <td>Lisa</td>
            <td>Simpson</td>
            <td>
                <button onclick="editarCliente(4)">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
        <tr>
            <td>5</td>
            <td>55555555</td>
            <td>Maggie</td>
            <td>Simpson</td>
            <td>
                <button onclick="editarCliente(5)">Modificar</button>
                <button>Eliminar</button>
            </td>
        </tr>
    </table>

    <script>
        function mostrarFormulario() {
            var formulario = document.getElementById('formulario');
            formulario.classList.remove('oculto');
        }

        function editarCliente(clienteID) {
            var dni, cuil, nombre, apellido, genero, nacionalidad, fechaNacimiento, direccion, localidad, provincia, correoElectronico, telefono;
            switch(clienteID) {
                case 1:
                    dni = "11111111";
                    cuil = "CUIL1111";
                    nombre = "Homero";
                    apellido = "Simpson";
                    genero = "masculino";
                    nacionalidad = "Estados Unidos";
                    fechaNacimiento = "1956-05-12";
                    direccion = "Avenida Siempreverde";
                    localidad = "Springfield";
                    provincia = "Estados Unidos";
                    correoElectronico = "homero@example.com";
                    telefono = "123456789";
                    break;
            }
            document.getElementById("idCliente").value = clienteID;
            document.getElementById("dni").value = dni;
            document.getElementById("cuil").value = cuil;
            document.getElementById("nombre").value = nombre;
            document.getElementById("apellido").value = apellido;
            document.getElementById("genero").value = genero;
            document.getElementById("nacionalidad").value = nacionalidad;
            document.getElementById("fechaNacimiento").value = fechaNacimiento;
            document.getElementById("direccion").value = direccion;
            document.getElementById("localidad").value = localidad;
            document.getElementById("provincia").value = provincia;
            document.getElementById("correoElectronico").value = correoElectronico;
            document.getElementById("telefono").value = telefono;
            mostrarFormulario();
        }
    </script>
</body>
</html>
