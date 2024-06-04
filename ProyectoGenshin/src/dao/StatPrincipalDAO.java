package dao;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.StatPrincipal;
import modelo.TipoArtefacto;

/**
 *
 * @author Usuario
 */
public class StatPrincipalDAO extends Conector{
    
    Connection con = conectar();
    
    
    public List<StatPrincipal> listar() {
        List<StatPrincipal> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT ID, NOMBRE_STAT FROM STAT_PRINCIPAL");
            
            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new StatPrincipal(
                                resultSet.getInt("ID"),
                                resultSet.getString("NOMBRE_STAT")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
    public List<StatPrincipal> listar(TipoArtefacto art) {
        List<StatPrincipal> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT STS.ID, STS.NOMBRE_STAT FROM TIPO_ARTEFACTO_STAT AS TAS"
                            + " INNER JOIN STAT_PRINCIPAL AS STS ON STS.ID = TAS.ID_STAT_PRINCIPAL"
                            + " INNER JOIN TIPO_ARTEFACTO AS TAT ON TAT.ID = TAS.ID_TIPO_ARTEFACTO"
                            + " WHERE TAT.ID = ?");
            

            try (statement) {
                statement.setInt(1, art.getId());
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new StatPrincipal(
                                resultSet.getInt("ID"),
                                resultSet.getString("NOMBRE_STAT")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
}
