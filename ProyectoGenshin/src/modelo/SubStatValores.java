package modelo;

/**
 *
 * @author Usuario
 */
public class SubStatValores {
    
    private Integer id;
    private Integer id_substats;
    private Integer id_valores;

    public SubStatValores(Integer id, Integer id_substats, Integer id_valores) {
        this.id = id;
        this.id_substats = id_substats;
        this.id_valores = id_valores;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_substats() {
        return id_substats;
    }

    public void setId_substats(Integer id_substats) {
        this.id_substats = id_substats;
    }

    public Integer getId_valores() {
        return id_valores;
    }

    public void setId_valores(Integer id_valores) {
        this.id_valores = id_valores;
    }
    
    
    
}
