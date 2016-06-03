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
                <h1>${message}</h1>
                <h3 style="text-align: center">
                    <#list estudiantes as est>
                        <p>${est.getNombre()}</p>
                    </#list>
                </h3>
            </div>
            <div class="footer">

            </div>
        </div>
    </body>

</html>