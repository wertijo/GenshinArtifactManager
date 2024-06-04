package controller;

import conexion.Conector;
import dao.StatPrincipalDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.StatPrincipal;
import modelo.TipoArtefacto;

/**
 *
 * @author Usuario
 */
public class StatPrincipalController {
    
    StatPrincipalDAO statprincipalDAO;

    public StatPrincipalController(StatPrincipalDAO statprincipalDAO) {
        this.statprincipalDAO = statprincipalDAO;
    }
    
    public StatPrincipalController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public List<StatPrincipal> listar() {
        List<StatPrincipal> resultado = new ArrayList<>();
        resultado = statprincipalDAO.listar();
        return resultado;
    }
    
    public List<StatPrincipal> listar(TipoArtefacto art) {
        List<StatPrincipal> resultado = new ArrayList<>();
        resultado = statprincipalDAO.listar(art);
        return resultado;
    }
    
}
