
package controller;

import conexion.Conector;
import dao.TipoSetDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoSet;

/**
 *
 * @author Usuario
 */
public class TipoSetController {
    
    private TipoSetDAO tiposetDAO;
    
    public TipoSetController(TipoSetDAO tiposetDAO) {
        this.tiposetDAO = tiposetDAO;
    }
    
    public TipoSetController() {
        Conector con = new Conector();
        con.conectar();
    }

    public List<TipoSet> listar() {
        List<TipoSet> resultado = new ArrayList<>();
        resultado = tiposetDAO.listar();
        return resultado;
    }
    
}
