package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoArtefacto;

/**
 *
 * @author Usuario
 */
public class TipoArtefactoDAO extends Conector{
    
    Connection con = conectar();
    
    public List<TipoArtefacto> listar() {
        List<TipoArtefacto> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID, NOMBRE_TIPO FROM TIPO_ARTEFACTO");

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new TipoArtefacto(
                                resultSet.getInt("ID"),
                                resultSet.getString("NOMBRE_TIPO")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
    
}
