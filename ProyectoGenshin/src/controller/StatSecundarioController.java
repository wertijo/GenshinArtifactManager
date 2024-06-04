package controller;

import conexion.Conector;
import dao.StatSecundarioDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.StatSecundario;



/**
 *
 * @author Usuario
 */
public class StatSecundarioController {
    
    StatSecundarioDAO statsecundarioDAO;

    public StatSecundarioController(StatSecundarioDAO statsecundarioDAO) {
        this.statsecundarioDAO = statsecundarioDAO;
    }

    public StatSecundarioController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public List<StatSecundario> listar() {
        List<StatSecundario> resultado = new ArrayList<>();
        resultado = statsecundarioDAO.listar();
        return resultado;
    }
    
}
