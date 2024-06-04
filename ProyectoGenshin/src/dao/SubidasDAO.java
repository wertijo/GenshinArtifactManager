package dao;

import conexion.Conector;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Subidas;

/**
 *
 * @author Usuario
 */
public class SubidasDAO extends Conector{
    
    Connection con = conectar();
    
    public List<Subidas> listar() {
        List<Subidas> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID, CANTIDAD FROM CANTIDAD_SUBIDAS");

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Subidas(
                                resultSet.getInt("ID"),
                                resultSet.getInt("CANTIDAD")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
}
