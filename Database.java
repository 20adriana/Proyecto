
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    Connection conn = null;
    public Connection conexion() throws ClassNotFoundException, SQLException{
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection(url, username, password);
            System.out.println("¡Conexion exitosa!");
            
        } catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
        public static Connection conexion = null;
        public static Connection conectar()throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            return connection;
    }
}
