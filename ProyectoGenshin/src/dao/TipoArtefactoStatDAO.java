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
public class TipoArtefactoStatDAO extends Conector{
    
    Connection con = conectar();
    
    public Integer traerId(Integer id_tipo_artefacto, Integer id_stat_principal){
        
        Integer resultado = 0;

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID FROM TIPO_ARTEFACTO_STAT"
                            + " WHERE ID_TIPO_ARTEFACTO = ? AND ID_STAT_PRINCIPAL = ?");

            try (statement) {
                
                statement.setInt(1, id_tipo_artefacto); 
                statement.setInt(2, id_stat_principal); 

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
