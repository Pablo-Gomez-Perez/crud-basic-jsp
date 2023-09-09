<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="ISO-8859-1">
    <meta name="keywords" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=7">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">    
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">	
	<link rel="stylesheet" href="css/Styles.css">
    <title>Document</title>
</head>
<body>
    <header class="p-header p-row">
		<div class="col-md-2">
			<img alt="logo-cjava" src="images/logo.png" width="100px" height="100px">
		</div>
		<div class="col-md-10">
			<h1>Clientes</h1>
		</div>
    </header>
    <section class="container">
    	<header class="row mt-3">
    		<div class="card">
    			<div class="card-header row">
    				<div class="col-md-10">
    					<h3>Clientes Registrados</h3>
    				</div>
    				<div class="col-md-2">
    					<button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#CreateForm">Nuevo</button>    					
    				</div>
    			</div>
    		</div>
    	</header>
        <article class="container">
			<table class="table table-bordered table-responsive table-hover mt-2">
				<thead>
					<tr>
						<th>Código</th>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Email</th>
						<th>Telefono</th>
						<th>Compras efectuadas</th>
						<th>Acciones</th>
					</tr>
				</thead>
			</table>
        </article>
        <article class="container">        	
			<jsp:include page="CreateCliente.jsp"></jsp:include>
        </article>
    </section>
    <footer>

    </footer>    
    <!------------------------------------------------------>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js" integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa" crossorigin="anonymous"></script>		
	<script type="text/javascript" src="JScripts/ClientesJS.js"></script>
	<script type="text/javascript"></script>
</body>
</html>