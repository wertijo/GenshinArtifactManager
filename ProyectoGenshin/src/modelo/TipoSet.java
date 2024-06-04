package modelo;
/**
 *
 * @author Usuario
 */
public class TipoSet {
    
    private Integer id;
    private String nombre_set;

    public TipoSet(Integer id, String nombre_set) {
        this.id = id;
        this.nombre_set = nombre_set;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_set() {
        return nombre_set;
    }

    public void setNombre_set(String nombre_set) {
        this.nombre_set = nombre_set;
    }

    @Override
    public String toString() {
        return String.format(
                "%s",
                this.nombre_set);
    }

    
}
