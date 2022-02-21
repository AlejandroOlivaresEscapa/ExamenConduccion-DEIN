package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */

public class Conector {

    Connection con;
    String id, preg, rcorr, rfal, rfal2;
    int idbd;

    public Connection conectar() {

        String url = "jdbc:sqlite:C://Users/Clase/Desktop/Proyecto Final DEIN/ExamenConducirDB.db";
        System.out.println("Conexión con éxito.");

        try {
            con = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public Connection getCon() {
        return con;
    }
    
}
