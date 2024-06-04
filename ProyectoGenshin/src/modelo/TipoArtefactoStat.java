package modelo;

/**
 *
 * @author Usuario
 */
public class TipoArtefactoStat {
    
    private Integer id;
    private Integer id_tipo_artefacto;
    private Integer id_stat_principal;

    public TipoArtefactoStat(Integer id, Integer id_tipo_artefacto, Integer id_stat_principal) {
        this.id = id;
        this.id_tipo_artefacto = id_tipo_artefacto;
        this.id_stat_principal = id_stat_principal;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_tipo_artefacto() {
        return id_tipo_artefacto;
    }

    public void setId_tipo_artefacto(Integer id_tipo_artefacto) {
        this.id_tipo_artefacto = id_tipo_artefacto;
    }

    public Integer getId_stat_principal() {
        return id_stat_principal;
    }

    public void setId_stat_principal(Integer id_stat_principal) {
        this.id_stat_principal = id_stat_principal;
    }
    
    
    
}
