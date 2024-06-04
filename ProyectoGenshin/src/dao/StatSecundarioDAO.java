package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.StatSecundario;
/**
 *
 * @author Usuario
 */
public class StatSecundarioDAO extends Conector{
    
    Connection con = conectar();
    
    public List<StatSecundario> listar() {
        List<StatSecundario> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID, NOMBRE_SUBSTAT FROM SUBSTATS");

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new StatSecundario(
                                resultSet.getInt("ID"),
                                resultSet.getString("NOMBRE_SUBSTAT")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
}
