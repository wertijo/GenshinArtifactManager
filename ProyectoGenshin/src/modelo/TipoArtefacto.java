package modelo;
/**
 *
 * @author Usuario
 */
public class TipoArtefacto {
 
    private Integer id;
    private String nombre_tipo;

    public TipoArtefacto(Integer id, String nombre_tipo) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s",
                this.nombre_tipo);
    }
    
}
