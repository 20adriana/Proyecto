
package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Funciones {
    
    Database database = new Database();
    Connection conn = null;
    Statement stmt = null;
    
    
    public void anyadirAccesorio(Integer id_accesorio, String nombre_accesorio, String plataforma, Integer precio, Integer cantidad){
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement("INSERT INTO `accesorios` (`id_accesorio`, `nombre_accesorio`, `plataforma`, `precio`, `cantidad`) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            
            p.setInt(1, id_accesorio);
            p.setString(2, nombre_accesorio);
            p.setString(3, plataforma);
            p.setInt(4, precio);
            p.setInt(5, cantidad);
            
            int filas = p.executeUpdate();
            if (filas > 0) {
                ResultSet generatedKeys = p.getGeneratedKeys();
                if (generatedKeys.next()){
                }
            }
            
            JOptionPane.showMessageDialog(null, "¡Se ha añadido correctamente el accesorio!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar añadir el accesorio :(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void anyadirVideojuego(Integer id_videojuego, String nombre_videojuego, String plataforma, Integer precio, Integer cantidad){
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement("INSERT INTO `videojuegos` (`id_videojuego`, `nombre_videojuego`, `plataforma`, `precio`, `cantidad`) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            
            p.setInt(1, id_videojuego);
            p.setString(2, nombre_videojuego);
            p.setString(3, plataforma);
            p.setInt(4, precio);
            p.setInt(5, cantidad);
            
            int filas = p.executeUpdate();
            if (filas > 0) {
                ResultSet generatedKeys = p.getGeneratedKeys();
                if (generatedKeys.next()){
                }
            }
            
            JOptionPane.showMessageDialog(null, "¡Se ha añadido correctamente el videojuego!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar añadir el videojuego :(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void anyadirConsola(Integer id_consola, String nombre_consola, Integer precio, Integer cantidad){
       
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement("INSERT INTO `consolas` (`id_consola`, `nombre_consola`, `precio`, `cantidad`) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        
            p.setInt(1, id_consola);
            p.setString(2, nombre_consola);
            p.setInt(3, precio);
            p.setInt(4, cantidad);
            
            
            int filas = p.executeUpdate();
            if (filas > 0) {
                ResultSet generatedKeys = p.getGeneratedKeys();
                if (generatedKeys.next()){
                }
            }
            
            JOptionPane.showMessageDialog(null, "¡Se ha añadido correctamente la consola!");
            
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar añadir la consola :(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarAccesorio(String nombre_accesorio, String plataforma, Integer id_accesorio, Integer cantidad, Integer precio) {
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement("UPDATE accesorios SET nombre_accesorio=?,plataforma=?,cantidad=?,precio=? WHERE id_accesorio=?",Statement.RETURN_GENERATED_KEYS);
            
            p.setString(1,nombre_accesorio);
            p.setString(2,plataforma);
            p.setInt(3,cantidad);
            p.setInt(4,precio);
            p.setInt(5,id_accesorio);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"¡El accesorio se ha modificado correctamente!");
        
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al intentar modificar los datos del accesorio:(" + e.getMessage());
        
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarVideojuego(String nombre_videojuego, String plataforma, Integer id_videojuego, Integer cantidad, Integer precio) {
     
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p=conn.prepareStatement("UPDATE videojuegos SET nombre_videojuego=?,plataforma=?,cantidad=?,precio=? WHERE id_videojuego=?",Statement.RETURN_GENERATED_KEYS);
            
            p.setString(1,nombre_videojuego);
            p.setString(2,plataforma);
            p.setInt(3,cantidad);
            p.setInt(4,precio);
            p.setInt(5,id_videojuego);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"¡El videojuego se ha modificado correctamente!");
        
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al intentar modificar los datos del videojuego :(" + e.getMessage());
        
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarConsola(String nombre_consola, Integer id_consola, Integer cantidad, Integer precio) {
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement("UPDATE consolas SET nombre_consola=?, cantidad=?, precio=? WHERE id_consola=?",Statement.RETURN_GENERATED_KEYS);
            
            p.setString(1,nombre_consola);
            p.setInt(2,cantidad);
            p.setInt(3,precio);
            p.setInt(4,id_consola);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"¡La consola se ha modificado correctamente!");
        
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al intentar modificar los datos de la consola :(" + e.getMessage());
        
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void eliminarVideojuego(Integer id_videojuego){
        
       try {
            conn = database.conexion();
            stmt = conn.createStatement(); 
            PreparedStatement p = conn.prepareStatement("DELETE FROM videojuegos WHERE id_videojuego=?", Statement.RETURN_GENERATED_KEYS);
            
            p.setInt(1, id_videojuego);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "¡El videojuego ha sido eliminado!");
            
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el videojuego:(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarConsola (Integer id_consola) {
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement(); 
            PreparedStatement p = conn.prepareStatement("DELETE FROM consolas WHERE id_consola=?", Statement.RETURN_GENERATED_KEYS);
            
            p.setInt(1, id_consola);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "¡La consola ha sido eliminada!");
            
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar la consola :(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAccesorio (Integer id_accesorio) {
        
        try {
            conn = database.conexion();
            stmt = conn.createStatement(); 
            PreparedStatement p = conn.prepareStatement("DELETE FROM accesorios WHERE id_accesorio=?", Statement.RETURN_GENERATED_KEYS);
            
            p.setInt(1, id_accesorio);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "¡El accesorio ha sido eliminado!");
            
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar el accesorio :(" + e.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}