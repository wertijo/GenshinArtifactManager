package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoSet;

/**
 *
 * @author Usuario
 */
public class TipoSetDAO extends Conector {
    
    Connection con = conectar();
    
    public List<TipoSet> listar() {
        List<TipoSet> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID, NOMBRE_SET FROM SET_ARTEFACTO");
            
            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new TipoSet(
                                resultSet.getInt("ID"),
                                resultSet.getString("NOMBRE_SET")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
    
}
