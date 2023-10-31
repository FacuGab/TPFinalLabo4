<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <%@ include file="menuAdmin.jsp" %>
</head>
<body>
	<h2>Reportes</h2>
	<br>
	<div class="container">
		<div class="col-6">
			<form action="post">
				<h3>Movimientos por cliente</h3>
				<label>DNI: </label>
				<input type="text">
				<input type="submit" value="Buscar">
				<br><br>
				<label>Desde: </label>
				<input type="date"> 
				<label>Hasta:</label>
				<input type="date"> 
				<br><br>
				<label style="font-size: 2rem">Movimientos: 15</label>
				<br><br>
				<input type="submit" value="Filtrar">
				<input type="reset" value="Reiniciar">
			</form>
		</div>
		<div class="col-6">
		<br><br>
			<form action="post">
			<h3>Clientes por provincia</h3>
				<label>Provincia: </label>
				<select>
					<option>Mendoza</option>
				</select>
				<label>Localidad: </label>
				<select>
					<option>Godoy Cruz</option>
				</select>
				<br><br>
				<fieldset>
					<legend>Edad</legend>
					<div>
						      <input type="radio" id="contactChoice1" name="contact" value="email" />
						      <label for="contactChoice1">Menor a</label>
						
						      <input type="radio" id="contactChoice2" name="contact" value="phone" />
						      <label for="contactChoice2">Mayor a</label>
						
						      <input type="radio" id="contactChoice3" name="contact" value="mail" />
						      <label for="contactChoice3">Rango</label>
					</div>
					<input type="number">
					<label> Años</label>
				</fieldset>
				<br><br>
				<label style="font-size: 2rem">Clientes: 9</label>
				<br><br>
				<input type="submit" value="Filtrar">
				<input type="reset" value="Reiniciar">
		</div>
	</div>
</body>
</html>