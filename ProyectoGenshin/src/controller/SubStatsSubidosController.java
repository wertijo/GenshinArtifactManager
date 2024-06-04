package controller;

import conexion.Conector;
import dao.SubStatsSubidosDAO;

/**
 *
 * @author Usuario
 */
public class SubStatsSubidosController {
    
    SubStatsSubidosDAO substatssubidosDAO;

    public SubStatsSubidosController(SubStatsSubidosDAO substatssubidosDAO) {
        this.substatssubidosDAO = substatssubidosDAO;
    }

    public SubStatsSubidosController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public void guardarSubstatsSubidos(Integer id_artefacto, Integer id_substats_valores, Integer id_cantidad_subidas){
        substatssubidosDAO.guardar(id_artefacto, id_substats_valores, id_cantidad_subidas);
    }
    
}
