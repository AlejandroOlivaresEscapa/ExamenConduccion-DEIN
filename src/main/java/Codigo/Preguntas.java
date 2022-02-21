package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Preguntas {

    Conector c = new Conector();
    Connection con;
    static ArrayList<Integer> id = new ArrayList<>();
    static ArrayList<String> preguntas = new ArrayList<>();
    static ArrayList<String> rcorrecta = new ArrayList<>();
    static ArrayList<String> rfalsa = new ArrayList<>();
    static ArrayList<String> rfalsa2 = new ArrayList<>();

    /**
     * Establezco conexion con la base de datos y lleno los array de cada tipo
     * para tenerlos almacenador y leerlos posteriormente.
     * En la consulta ya obtengo una lista random para tener posicionada la respuesta
     * en mi arraylist y luego solo tener que compararlos.
     * 
     * @throws java.sql.SQLException
     */
    
    public void rellenarArray() throws SQLException {

        System.out.println("Rellenando Array");
        String url = "jdbc:sqlite:C://Users/Clase/Desktop/Proyecto Final DEIN/ExamenConducirDB.db";
        String query = "Select id, preguntas2, rcorrecta, rfalsa, rfalsa2 from preguntas order by random() limit 22";

        try ( var con = DriverManager.getConnection(url);  var obtenerPregunta = con.prepareStatement(query)) {
            try ( var datosrs = obtenerPregunta.executeQuery()) {
                while (datosrs.next()) {
                    id.add(datosrs.getInt(1));
                    preguntas.add(datosrs.getString(2));
                    rcorrecta.add(datosrs.getString(3));
                    rfalsa.add(datosrs.getString(4));
                    rfalsa2.add(datosrs.getString(5));
                }
            } catch (SQLException ex) {
                System.err.println("Error de ejecucion de consulta");
                System.err.println(ex.toString());
            }
        } catch (SQLException ex) {
            System.err.println("Error al establecer la consulta");
            System.err.println(ex.toString());
        }
    }

    public void limpiarArrays() {

        id.clear();
        preguntas.clear();
        rcorrecta.clear();
        rfalsa.clear();
        rfalsa2.clear();

    }

    public static ArrayList<Integer> getId() {
        return id;
    }

    public static ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public static ArrayList<String> getRcorrecta() {
        return rcorrecta;
    }

    public static ArrayList<String> getRfalsa() {
        return rfalsa;
    }

    public static ArrayList<String> getRfalsa2() {
        return rfalsa2;
    }

}
