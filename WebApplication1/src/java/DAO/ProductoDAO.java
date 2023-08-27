package DAO;

import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ProductoDAO
{

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    int resultado = 0;

    public int AgregarProducto(Producto producto)
    {
        Conexion conexion = new Conexion();
        String sql = "Insert Into producto(Nombre, Ruta) Values (?,?)";
        try
        {
            connection = conexion.GetConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, producto.getNombre());
            preparedStatement.setString(2, producto.getRuta());
            preparedStatement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println("ERROR  en ProductoDAO: " + e.getMessage());
        }

        return resultado;
    }

}
