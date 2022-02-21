package Codigo;

import Interfaz.Inicio;
import java.sql.SQLException;


/**
 *
 * @author Alejandro
 */

public class Main {

    //Muestro la pantalla principal.
    public static void main(String[] args) throws SQLException {
     
        Inicio i = new Inicio();
        i.setVisible(true);
    }
}
