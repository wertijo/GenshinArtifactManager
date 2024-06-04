package modelo;

/**
 *
 * @author Usuario
 */
public class Artefacto {

    private Integer id;
    private Integer id_usuarios;
    private Integer id_set;
    private Integer id_tipo_artefacto_stat;

    //constructor vacio
    public Artefacto() {
    }

    //constructor
    public Artefacto(Integer id, Integer id_usuarios, Integer id_set, Integer id_tipo_artefacto_stat) {
        this.id = id;
        this.id_usuarios = id_usuarios;
        this.id_set = id_set;
        this.id_tipo_artefacto_stat = id_tipo_artefacto_stat;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(Integer id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public Integer getId_set() {
        return id_set;
    }

    public void setId_set(Integer id_set) {
        this.id_set = id_set;
    }

    public Integer getId_tipo_artefacto_stat() {
        return id_tipo_artefacto_stat;
    }

    public void setId_tipo_artefacto_stat(Integer id_tipo_artefacto_stat) {
        this.id_tipo_artefacto_stat = id_tipo_artefacto_stat;
    }

}
