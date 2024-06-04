package controller;

import conexion.Conector;
import dao.ArtefactoDAO;

/**
 *
 * @author Usuario
 */
public class ArtefactoController {
    
    ArtefactoDAO artefactoDAO;

    public ArtefactoController(ArtefactoDAO artefactoDAO) {
        this.artefactoDAO = artefactoDAO;
    }

    public ArtefactoController() {
        Conector con = new Conector();
        con.conectar();
    }
    
    public void guardarArtefactoNuevo(Integer id_usuarios, Integer id_set, Integer id_tipo_artefacto_stat){
        artefactoDAO.guardar(id_usuarios, id_set, id_tipo_artefacto_stat);
    }

    public Integer idUltimoArtefacto(Integer id_usuarios) {
        return artefactoDAO.recienCreado(id_usuarios);
    }
    
}
