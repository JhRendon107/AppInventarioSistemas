 
/*
 * Con esta clase nos conectamos a la bdSistemasConsultel
  */
package Model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
  * @author SISTEMAS_2
 */
public class Conexion {

       
   
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String usuario  = "root";
    public static final String contraseña  = "";
    public static final String nombreBD  = "bdsistemasconsultel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String ip  = "127.0.0.1";
    public static final String servidor  = "jdbc:mysql://"+ip+"/"+nombreBD+"";
    public static final String puerto  = "";
    public static Connection con= null;
  
    
    public Conexion() {
        
       
    }
    
    public static Connection getConexion() {

        try {
            Class.forName(driver);
            con = (Connection)DriverManager.getConnection(servidor, usuario, contraseña);
            System.err.println("se establecio conexion con la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            con = null;
            JOptionPane.showMessageDialog(null, "No se ha podido establecer una conexion con la Base de datos" + e.getMessage());
        }
        return con;

    }
    
    public void desconectar(){
    
        try {
            con.close();
        }catch (Exception e){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);
        }
    } 
    
    
}
     
     
    
    

    
    
