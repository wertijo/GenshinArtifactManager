package modelo;

/**
 *
 * @author Usuario
 */
public class Subidas {
    
    private Integer id;
    private Integer cantidad;

    public Subidas(Integer id, Integer cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%d",
                this.cantidad);
    }
    
}
