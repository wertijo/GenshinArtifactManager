package modelo;

/**
 *
 * @author Usuario
 */
public class SubStatsSubidos {
    
    private Integer id;
    private Integer id_artefacto;
    private Integer id_substats_valores;
    private Integer id_cantidad_subidas;

    public SubStatsSubidos(Integer id, Integer id_artefacto, Integer id_substats_valores, Integer id_cantidad_subidas) {
        this.id = id;
        this.id_artefacto = id_artefacto;
        this.id_substats_valores = id_substats_valores;
        this.id_cantidad_subidas = id_cantidad_subidas;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_artefacto() {
        return id_artefacto;
    }

    public void setId_artefacto(Integer id_artefacto) {
        this.id_artefacto = id_artefacto;
    }

    public Integer getId_substats_valores() {
        return id_substats_valores;
    }

    public void setId_substats_valores(Integer id_substats_valores) {
        this.id_substats_valores = id_substats_valores;
    }

    public Integer getId_cantidad_subidas() {
        return id_cantidad_subidas;
    }

    public void setId_cantidad_subidas(Integer id_cantidad_subidas) {
        this.id_cantidad_subidas = id_cantidad_subidas;
    }
    
    
    
}
