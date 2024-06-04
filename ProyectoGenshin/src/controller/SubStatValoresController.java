package controller;

import conexion.Conector;
import dao.SubStatValoresDAO;

/**
 *
 * @author Usuario
 */
public class SubStatValoresController {
    
    SubStatValoresDAO substatvaloresDAO;

    public SubStatValoresController(SubStatValoresDAO substatvaloresDAO) {
        this.substatvaloresDAO = substatvaloresDAO;
    }
    
    public SubStatValoresController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public Integer traerSubStatValor(Integer id_substats){
        return substatvaloresDAO.traerId(id_substats);
    }
    
}
