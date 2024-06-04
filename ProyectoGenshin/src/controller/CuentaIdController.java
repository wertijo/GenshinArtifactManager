package controller;

import conexion.Conector;
import dao.CuentaIdDAO;

/**
 *
 * @author Usuario
 */
public class CuentaIdController {
    
    CuentaIdDAO cuentaidDAO;

    public CuentaIdController(CuentaIdDAO cuentaidDAO) {
        this.cuentaidDAO = cuentaidDAO;
    }

    public CuentaIdController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public Integer traerCuentaId(){
        return cuentaidDAO.traerId();
    }
    
    
}
