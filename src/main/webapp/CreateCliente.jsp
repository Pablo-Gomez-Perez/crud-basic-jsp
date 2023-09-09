<!-- Modal -->
<div class="modal fade" id="CreateForm"  data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Nuevo Cliente</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form class="form" id="formCreateCliente" action="ClientesServlet" method="post">
	      <div class="modal-body">
	      	  <div class="row">
	      	  	<div class="form-group">
	      	  		<label class="form-label" for="codigoCliente">Codigo de cliente</label>
	      	  		<input type="text" class="form-control" name="codigoCliente"/>
	      	  	</div>	
	      	  </div>
	      	  <div class="row">
	      	  	<div class="col-md-6">
	      	  		<div class="form-group">
	      	  			<label class="form-label" for="nombreCliente">Nombre</label>
	      	  			<input type="text" class="form-control" name="nombreCliente"/>
	      	  		</div>
	      	  	</div>
	      	  	<div class="col-md-6">
	      	  		<div class="form-group">
	      	  			<div class="form-group">
	      	  				<label class="form-label" for="apellidoCliente">Apellido</label>
	      	  				<input type="text" class="form-control" name="apellidoCliente"/>
	      	  			</div>
	      	  		</div>
	      	  	</div>	      	  		      	  
	      	  </div>
	      	  <div class="row">
	      	  	<div class="form-group">
	      	  		<label class="form-label" for="emailCliente">Email</label>
	      	  		<input type="email" class="form-control" name="emailCliente"/>
	      	  	</div>
	      	  </div>
	      	  <div class="row">
      	  		<div class="col-md-6">
      	  			<div class="form-group">
      	  			<label class="form-label" for="telefonoCliente">Telefono</label>
      	  			<input type="text" class="form-control" name="telefonoCliente"/>
      	  			</div>
      	  		</div>
      	  		<div class="col-md-6">
      	  			<div class="form-group">
      	  			<label class="form-label" for="comprasRegistradas">Compras Registradas</label>
      	  			<input type="number" class="form-control" name="comprasRegistradas"/>
      	  			</div>
      	  		</div>
      	  	</div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="submit" class="btn btn-primary">Guardar</button>
	      </div>
      </form>
    </div>
  </div>
</div>