package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/nuevobd", 
                    "root",
                    "luis1234");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }           
}
