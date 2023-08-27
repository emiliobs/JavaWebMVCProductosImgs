package DAO;

import  java.sql.Connection;
import  java.sql.DriverManager;

public class Conexion
{
     Connection conexion;
     String url = "jdbc:mysql://localhost:3306/productsimgdb";
     String user = "root";
     String password = "root";
     
     
     public Connection GetConnection()
     {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conexion = DriverManager.getConnection(url, user,password);
             
             System.out.println("Conexion Exitosa!");
         }
         catch (Exception e)
         {
             System.out.println("ERROR - Clase Conexion: "  + e.getMessage());
         }
         
         return conexion;
     }
       
     public static void main(String[] args)
    {
          Conexion conexion = new Conexion();
          
          conexion.GetConnection();
        
    }
        
     
     
}


