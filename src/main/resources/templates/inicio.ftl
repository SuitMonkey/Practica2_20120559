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
                                 </ul>
                        </div>
                    </div>
                </nav>
            </div>
            <br>
            <br>
            <br>
            <div class="container">
                <h1>${message}</h1>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Matricula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Carrera</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list estudiantes as est>
                    <tr>

                        <td><a href="/editar?mat=${est.getMatricula()}">${est.getMatricula()}</a></td>
                        <td>${est.getNombre()}</td>
                        <td>${est.getApellido()}</td>
                        <td>${est.getTelefono()}</td>
                        <td>${est.getCarrera()}</td>
                    </tr>
                    </tbody>
                    </#list>
                </table>


            </div>
            <div class="footer">

            </div>
        </div>
    </body>

</html>