package modelo;

/**
 *
 * @author Usuario
 */
public class StatPrincipal {
    
    private Integer id;
    private String nombre_stat;

    public StatPrincipal(Integer id, String nombre_stat) {
        this.id = id;
        this.nombre_stat = nombre_stat;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_stat() {
        return nombre_stat;
    }

    public void setNombre_stat(String nombre_stat) {
        this.nombre_stat = nombre_stat;
    }
    
    
    @Override
    public String toString() {
        return String.format(
                "%s",
                this.nombre_stat);
    }
    
}
