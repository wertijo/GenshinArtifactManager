package controller;

import conexion.Conector;
import dao.TipoArtefactoStatDAO;

/**
 *
 * @author Usuario
 */
public class TipoArtefactoStatController {
    
    TipoArtefactoStatDAO tipoartefactostatDAO;

    public TipoArtefactoStatController(TipoArtefactoStatDAO tipoartefactostatDAO) {
        this.tipoartefactostatDAO = tipoartefactostatDAO;
    }

    public TipoArtefactoStatController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public Integer traerTipoArtefactoStat(Integer id_tipo_artefacto, Integer id_stat_principal){
        return tipoartefactostatDAO.traerId(id_tipo_artefacto, id_stat_principal);
    }
    
    
}
