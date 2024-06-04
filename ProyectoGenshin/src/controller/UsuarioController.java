package controller;

import conexion.Conector;
import dao.UsuariosDAO;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class UsuarioController {

    private UsuariosDAO usuariosDAO;

    public UsuarioController(UsuariosDAO usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
    }

    public UsuarioController() {
        Conector con = new Conector();
        con.conectar();
    }

    public void crearCuenta(Usuario usuario) {
        usuariosDAO.guardar(usuario);
    }

    public boolean cuentaRepetida(Usuario usuario) {
        return usuariosDAO.usuarioRepetido(usuario);
    }

    public boolean iniciarSesion(Usuario usuario) {
        return usuariosDAO.evaluarContrasenha(usuario);
    }

    public void guardarId(Usuario usuario) {
        usuariosDAO.guardarId(usuario);
    }
    
    public String buscarUsuario (Integer idUsuario){
        return usuariosDAO.buscarUsuario(idUsuario);
    }
    
    public String buscarContra (Integer idUsuario){
        return usuariosDAO.buscarContra(idUsuario);
    }

}
