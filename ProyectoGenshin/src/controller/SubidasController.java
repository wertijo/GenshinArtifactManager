package controller;

import conexion.Conector;
import dao.SubidasDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.StatSecundario;
import modelo.Subidas;

/**
 *
 * @author Usuario
 */
public class SubidasController {
    
    SubidasDAO subidasDAO;

    public SubidasController(SubidasDAO subidasDAO) {
        this.subidasDAO = subidasDAO;
    }

    public SubidasController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public List<Subidas> listar() {
        List<Subidas> resultado = new ArrayList<>();
        resultado = subidasDAO.listar();
        return resultado;
    }
    
}
