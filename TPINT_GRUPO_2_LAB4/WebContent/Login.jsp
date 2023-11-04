<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
<br>
<div class="row">
        <div class="col-4"></div>
        	<div class="col">
					<div>
   						 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb-pqV1G2DI0KIfcP8lR_Nmmi5Fbme_anflg&usqp=CAU" class="img-fluid" alt="..." style="width: 800px; height: 300px;">
					</div>
	
            
            <div class="text-center">
            <br>
                <h2> BANK UTN</h2>
            </div>
            <div class="text-center text-muted">
                <p>Por favor, ingrese sus credenciales:</p>
            </div>
            <% if(request.getAttribute("errorCredenciales") != null) { %>
            <div class="col-12">
            	<div class="alert alert-danger" role="alert">	
  				Usuario o contraseña incorrectos. Por favor, reintente
				</div>
			</div>
			<% } %>

			
            <form action="ServletUsuario" method="post">
            
	            <div class="d-grid mx-auto">
	                <input type="text" name="TxtApellido" placeholder="Apellido" class="form-control"  required ></input>
	                <br>
	            </div>
	           <div class="d-grid mx-auto">
	                <input type="text" name="TxtNombre" placeholder="Nombre" class="form-control"  required ></input>
	                <br>
	            </div>
	            <div class="d-grid mx-auto">
	                <input type="password" name="TxtContraseña" placeholder="Contraseña" class="form-control" title="Ingrese solo numeros" required ></input>
	                <br>
	            </div>   
	             <div class="d-grid mx-auto">
	                <input type=submit class="btn btn-primary" name="btnIngresar" value="Ingresar"></input>
	                <br>          
	            </div> 
            </form>
            <br />
            <br />
            <div class="col-4"></div>
            <div class="col-2"></div>
        </div>
        <div class="col-4"></div>
    </div>

	<%if(request.getAttribute("errorDni") != null)
	{
	%>
		<script type="text/javascript">
		function alertName(){
		alert("El dni es invalido. Por favor, reintente");
		} 
		</script> 
	<%
		}
	%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>

</html>

