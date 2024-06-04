package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conector {

    String bd = "bd_genshin";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    //constructor base
    public Conector() {
    }

    //metodo de conexión a la bd
    public Connection conectar() {
        try {
            Class.forName(driver);
            System.out.println("Se conectó a la base de datos " + bd);
            cx = DriverManager.getConnection(url + bd, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conectó a la base de datos " + bd);
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    //metodo de desconexión a la bd
    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Se desconectó de la base de datos " + bd);
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
