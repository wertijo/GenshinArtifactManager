package modelo;

/**
 *
 * @author Usuario
 */
public class Usuario {

    private Integer id;
    private String usuario;
    private String contrasenha;
    private Integer id_tipos_cuenta;

    //Constructor vacío
    public Usuario() {
    }

    //constructor
    public Usuario(Integer id, String usuario, String contrasenha, Integer id_tipos_cuenta) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenha = contrasenha;
        this.id_tipos_cuenta = id_tipos_cuenta;
    }

    //Override
    @Override
    public String toString() {
        return String.format(
                "%s",
                this.usuario);
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public Integer getId_tipos_cuenta() {
        return id_tipos_cuenta;
    }

    public void setId_tipos_cuenta(Integer id_tipos_cuenta) {
        this.id_tipos_cuenta = id_tipos_cuenta;
    }

}
