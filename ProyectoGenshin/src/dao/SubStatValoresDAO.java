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
public class SubStatValoresDAO extends Conector{
    
    Connection con = conectar();
    
    public Integer traerId(Integer id_substats) {
        Integer resultado = 0;

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID FROM SUBSTATS_VALORES"
                            + " WHERE ID_SUBSTATS = ?");

            try (statement) {
                
                statement.setInt(1, id_substats); 
                
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
