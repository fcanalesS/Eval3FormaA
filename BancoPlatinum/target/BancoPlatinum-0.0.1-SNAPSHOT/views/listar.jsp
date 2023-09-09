<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class='container pt-4'>
		<table class='table'>
			<thead>
				<tr>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Telefono</th>
					<th>Fecha de Ingreso</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${persona.getRut()}</td>
					<td>${persona.getNombre()}</td>
					<td>${persona.getApellido()}</td>
					<td>${persona.getTelefono()}</td>
					<td>${persona.getFechaIngreso()}</td>
				</tr>
			</tbody>
		</table>
	</div>
	
</body>
</html>