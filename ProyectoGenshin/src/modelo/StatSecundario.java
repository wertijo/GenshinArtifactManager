package modelo;

/**
 *
 * @author Usuario
 */
public class StatSecundario {
    private Integer id;
    private String nombre_substat;

    public StatSecundario(Integer id, String nombre_substat) {
        this.id = id;
        this.nombre_substat = nombre_substat;
    }
    
    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_substat() {
        return nombre_substat;
    }

    public void setNombre_substat(String nombre_substat) {
        this.nombre_substat = nombre_substat;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s",
                this.nombre_substat);
    }
}
