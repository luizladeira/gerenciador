<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Cadasto de Empresas</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Projeto</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li class="active"><a href="#">Cadastros</a></li>
        <li><a href="#">Sobre</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- Begin page content -->
    <main role="main" class="container">
    <form action="/gerenciador/nova-empresa" method="post"> 
      <h1 class="mt-5">Cadastrar empresa</h1>  
  		<div class="row">
  			
			    <div class="col-sm-12">
			    	<p>Empresa:</p>
			    	<input name="nome" type="text" class="form-control" placeholder="Digite o nome da Empresa">  
				</div>
				<div class="col-sm-3" style="margin-top:10px">
					<button type="submit" class="btn btn-primary">Salvar</button>
				</div>
				
  			
  		</div>
  		</form>
	</main>


    
</body>
</html>