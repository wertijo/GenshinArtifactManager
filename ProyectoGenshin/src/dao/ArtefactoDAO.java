package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Usuario
 */
public class ArtefactoDAO extends Conector {
    
    Connection con = conectar();
    
    public void guardar(Integer id_usuarios, Integer id_set, Integer id_tipo_artefacto_stat){
        try {
            final PreparedStatement statement = con.prepareStatement(
                    "INSERT INTO ARTEFACTO (ID_USUARIOS, ID_SET, ID_TIPO_ARTEFACTO_STAT)"
                            + " VALUES ( ?, ?, ?)");

            try (statement) {
                
                statement.setInt(1, id_usuarios); 
                statement.setInt(2, id_set);
                statement.setInt(3, id_tipo_artefacto_stat);

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer recienCreado(Integer id_usuarios) {
        Integer resultado=0;
        
        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID FROM ARTEFACTO"
                            + " WHERE ID_USUARIOS = ? ORDER BY ID ASC");

            try (statement) {
                
                statement.setInt(1, id_usuarios); 

                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado = resultSet.getInt("ID");
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return resultado;
    }
    
}
