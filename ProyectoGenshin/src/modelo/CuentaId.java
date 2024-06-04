package modelo;

/**
 *
 * @author Usuario
 */
public class CuentaId {
 
    private Integer id;
    private Integer cuenta_id;

    public CuentaId(Integer id, Integer cuenta_id) {
        this.id = id;
        this.cuenta_id = cuenta_id;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(Integer cuenta_id) {
        this.cuenta_id = cuenta_id;
    }
    
    
}
