package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;


/**
 *
 * @author Usuario
 */
public class UsuariosDAO extends Conector{
    
    Connection con = conectar();
    
    public String buscarContra(Integer idUsuario) {
        String resultado="";
        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT CONTRASENHA FROM USUARIOS WHERE ID = ?");
    
                statement.setInt(1, idUsuario);
                ResultSet resultSet = statement.executeQuery();
            
                if (resultSet.next()) {
                    resultado = resultSet.getString("CONTRASENHA");
                }
                
                resultSet.close();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }
    
    public String buscarUsuario(Integer idUsuario){
        String resultado="";
        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT USUARIO FROM USUARIOS WHERE ID = ?");
    
                statement.setInt(1, idUsuario);
                ResultSet resultSet = statement.executeQuery();
            
                if (resultSet.next()) {
                    resultado = resultSet.getString("USUARIO");
                }
                
                resultSet.close();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }
    
    public void guardar (Usuario usuario){
        
        try {
            PreparedStatement statement;
                statement = con.prepareStatement(
                        "INSERT INTO USUARIOS "
                        + "(usuario, contrasenha, id_tipos_cuenta)"
                        + " VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            try (statement) {
                statement.setString(1, usuario.getUsuario());
                statement.setString(2, usuario.getContrasenha());
                statement.setInt(3, usuario.getId_tipos_cuenta());
    
                statement.execute();
    
                final ResultSet resultSet = statement.getGeneratedKeys();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        usuario.setId(resultSet.getInt(1));
                        
                        System.out.println(String.format("Fue insertado el usuario: %s", usuario));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public boolean usuarioRepetido (Usuario usuario){
        
        boolean resultado=false;
        
        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT USUARIO FROM USUARIOS WHERE USUARIO = ?");
    
                statement.setString(1, usuario.getUsuario());
                ResultSet resultSet = statement.executeQuery();
    
                if (resultSet.next()) {
                    resultado = true; //usuairo repetido
                }
            
                resultSet.close();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       return resultado; 
    }
    
    public boolean evaluarContrasenha (Usuario usuario){
        
        boolean resultado=false;
        
        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT ID FROM USUARIOS WHERE BINARY USUARIO = ? AND BINARY CONTRASENHA = ?");
    
                statement.setString(1, usuario.getUsuario());
                statement.setString(2, usuario.getContrasenha());
                ResultSet resultSet = statement.executeQuery();
    
                if (resultSet.next()) {
                    resultado = true; //usuario existente
                }
            
                resultSet.close();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return resultado;
        
    }
    
    public void guardarId(Usuario usuario){
        
        int resultado=0;
        
        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT ID FROM USUARIOS WHERE BINARY USUARIO = ? AND BINARY CONTRASENHA = ?");
    
                statement.setString(1, usuario.getUsuario());
                statement.setString(2, usuario.getContrasenha());
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    resultado = resultSet.getInt("ID");
                } else{
                    resultado = 0;
                }
            
                resultSet.close();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
        try {
            PreparedStatement statement;
                statement = con.prepareStatement(
                        "UPDATE CUENTA_ID SET cuenta_id = ?"
                        + " WHERE id = 1");
                
                statement.setInt(1, resultado);
                statement.executeUpdate();
                statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

   
    
}
