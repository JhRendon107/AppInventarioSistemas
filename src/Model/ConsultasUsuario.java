package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultasUsuario extends Conexion {

    public boolean registrar(UsuarioModel usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuario (Id_Usuario, Cedula, Nombre, Celular) VALUES(?,?,?,?) ";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, usu.getId_Usuario());
            ps.setLong(2, usu.getCedula());
            ps.setString(3, usu.getNombre());
            ps.setInt(4, usu.getCelular());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }
    
    public boolean modificar(UsuarioModel usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE usuario SET Cedula=?, Nombre=?, Celular=? WHERE Id_Usuario=? ";

        try {

            ps = con.prepareStatement(sql);
            ps.setLong(1, usu.getCedula());
            ps.setString(2, usu.getNombre());
            ps.setInt(3, usu.getCelular());
            ps.setInt(4, usu.getId_Usuario());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }
    
    public boolean eliminar(UsuarioModel usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM usuario WHERE Id_Usuario=? ";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, usu.getId_Usuario());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }
    
     public boolean buscar(UsuarioModel usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuario WHERE Cedula=? ";

        try {

            ps = con.prepareStatement(sql);
            ps.setLong(1, usu.getCedula());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                usu.setId_Usuario(Integer.parseInt(rs.getString("Id_Usuario")));
                usu.setCedula(Long.parseLong(rs.getString("Cedula")));
                usu.setNombre(rs.getString("Nombre"));
                usu.setCelular(Integer.parseInt(rs.getString("Celular")));
                return true;
            }
            return false;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }

}
