package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class SubStatsSubidosDAO extends Conector{
    
    Connection con = conectar();
    
    
    public void guardar(Integer id_artefacto, Integer id_substats_valores, Integer id_cantidad_subidas){
        try {
            final PreparedStatement statement = con.prepareStatement(
                    "INSERT INTO SUBSTATS_SUBIDOS (ID_ARTEFACTO, ID_SUBSTATS_VALORES, ID_CANTIDAD_SUBIDAS)"
                            + " VALUES ( ?, ?, ?)");

            try (statement) {
                
                statement.setInt(1, id_artefacto); 
                statement.setInt(2, id_substats_valores);
                statement.setInt(3, id_cantidad_subidas);

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
