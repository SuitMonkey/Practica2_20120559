<!DOCTYPE html>
<html>
<head>
    <title>Practica 2</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<div class="body">
    <div class="header">
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <p class="navbar-brand">Practica 2</p>
                    <ul class="nav navbar-nav">
                        <li><a href="/">Listar</a> </li>
                        <li><a href="/agregar">Agregar</a></li>
                        <li><a href="/editar">Editar</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <br>
    <br>
    <br>
    <div class="container">


        <form action="/editar?mat=${est.getMatricula()}" method="post">
            <fieldset class="form-group">
                <label for="Matricula">Matricula</label>
                <input type="text" class="form-control" name="matricula" placeholder="Ingrese matricula">
            </fieldset>
            <fieldset class="form-group">
                <label for="Nombre">Nombre</label>
                <input type="text" class="form-control" name="Nombre" placeholder="Nombre">
            </fieldset>
            <fieldset class="form-group">
                <label for="Apellido">Apellido</label>
                <input type="text" class="form-control" name="Apellido" placeholder="Apellido">
            </fieldset>
            <fieldset class="form-group">
                <label for="Telefono">Telefono</label>
                <input type="text" class="form-control" name="Telefono" placeholder="809-XXX-XXXX">
            </fieldset>
            <fieldset class="form-group">
                <label for="Carrera">Carrera</label>
                <input type="text" class="form-control" name="Carrera" placeholder="ISC">
            </fieldset>
            <button type="submit" class="btn btn-primary">Listo</button>
        </form>
    </div>
    <div class="footer">

    </div>
</div>
</body>

</html>