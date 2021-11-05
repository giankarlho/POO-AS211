package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection cnx = null;
    
    public static Connection conectar() throws Exception{
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/BDPizzas";
        String user= "root";
        String pwd = "";
        try {
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pwd);            
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());            
        }  
        return cnx;
    }
    
    public void desconectar() throws Exception{
        if (cnx == null){
            return;
        }else {
            cnx.close();
        }
    }
    
    public static void main(String[] args) throws SQLException, Exception {
        Conexion.conectar();
        if (cnx == null){
            System.out.println("No hay conexión");
        }else {
            System.out.println("Conexión correcta");
        }
    }
    
}
