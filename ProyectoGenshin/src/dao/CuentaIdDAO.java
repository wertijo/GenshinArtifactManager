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
public class CuentaIdDAO extends Conector{
    
    Connection con = conectar();
    
    public Integer traerId(){
        
        Integer resultado = 0;

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT CUENTA_ID FROM CUENTA_ID"
                            + " WHERE ID = 1");
           
            try (statement) {

                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado = resultSet.getInt("CUENTA_ID");
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }  
}
