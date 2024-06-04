package controller;

import conexion.Conector;
import dao.TipoArtefactoDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoArtefacto;

/**
 *
 * @author Usuario
 */
public class TipoArtefactoController {
    
    private TipoArtefactoDAO tipoartefactoDAO;

    public TipoArtefactoController(TipoArtefactoDAO tipoartefactoDAO) {
        this.tipoartefactoDAO = tipoartefactoDAO;
    }
    
    public TipoArtefactoController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public List<TipoArtefacto> listar() {
        List<TipoArtefacto> resultado = new ArrayList<>();
        resultado = tipoartefactoDAO.listar();
        return resultado;
    }
}
