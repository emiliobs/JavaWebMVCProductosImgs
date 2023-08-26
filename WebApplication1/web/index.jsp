<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <title>Productos</title>
    </head>
    <body  style="background-color: #016075;">

        <div class="container " style=" align-content: center; margin-right:  -90px;  margin-top: 150px;">
            
                 <form action="ProductoSV" method="post" enctype="multipart/form-data">
                <div class="card col-md-6">
                    <div class="card-header">
                        <h1 style="font-style: italic; font-weight: bold; text-align: center; color: red;">Agregar Productos</h1>
                    </div>
                    <div class="card-body">
                        <div class="form-group">
                            <label style="font-style: italic; font-weight: bold; text-align: center; color: red;" for="nombreProducto">Nombre del Producto:</label>
                            <input type="text" class="form-control" name="txtNombreProducto" id="nombreProducto"/>
                        </div>
                           <div class="form-group">
                            <label style="font-style: italic;  font-weight: bold; text-align: center; color: red;" for="imagen">Imagen:</label>
                            <input type="file" class="form-control" name="txtImagen" id="imagen"/>
                        </div>
                    </div>
                    <div class="card-footer " style="text-align: center;">
                        <button type="submit" class="btn btn-outline-info" style="font-style: italic; font-weight: bold; color: red;" name="btnAccion">Guardar!</button>
                    </div>
                </div>
            </form>
        
           
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    </body>
</html>
