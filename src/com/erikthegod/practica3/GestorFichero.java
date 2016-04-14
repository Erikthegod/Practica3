package com.erikthegod.practica3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Crea un fichero en el cual guardamos un objeto de la clase videojuego, el
 * nombre del archivo sera el codigo del juego. Lee un fichero cuyo nombre es
 * recibido por la interfaz y se le asignan los datos a un objeto de la clase
 * videojuego
 *
 * @author Erik The God
 */
public class GestorFichero {

    BufferedReader br = null;
    PrintWriter fichero;// Declaracion del fichero donde se escribe
    Videojuego juego;//Declaracion de un objeto de la clase videojuego

    /**
     * Metodo que guarda un objeto de la clase videojuego que recibe , en un
     * fichero linea a linea
     *
     * @param vid Se recibe de la interfaz, es un objeto de la clase videojuego
     * que contiene los datos introducidos por el usuario
     */
    public void guardarJuego(Videojuego vid) {
        try {
            fichero = new PrintWriter(vid.getCodigo() + ".juego");
            fichero.println(vid.getCodigo());
            fichero.println(vid.getTitulo());
            fichero.println(vid.getCategoria());
            fichero.println(vid.getPlataforma());
            fichero.println(vid.getPrecio());
            fichero.println(vid.isDisponible());
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al almacenar el juego");
        } finally {
            fichero.close();
        }
        JOptionPane.showMessageDialog(null, "El juego ha sido almacenado correctamente");
    }

   /* public void guardarBBDD(Videojuego vid) {
        try {
            Connection conexion = null;
            Statement stmt = null;
            String sql;//Cadena con la sentencia sql
            Class.forName("org.sqlite.JDBC");//Carga del driver
            conexion = DriverManager.getConnection("jdbc:sqlite:C:/juegosdb/dbjuegos");
            stmt = conexion.createStatement();
           // sql = "Create table juegos(codigo integer Primary key,titulo text,categoria text,plataforma text,precio integer,disponible text);";
           if (vid.isDisponible() == true) {
               sql = "insert into juegos values(" + vid.getCodigo() + ",'" + vid.getTitulo() + "','" + vid.getCategoria() + "','" + vid.getPlataforma() + "'," + vid.getPrecio() + ",'Disponible');";
               stmt.executeUpdate(sql);
            } else {
               sql = "insert into juegos values(" + vid.getCodigo() + ",'" + vid.getTitulo() + "','" + vid.getCategoria() + "','" + vid.getPlataforma() + "'," + vid.getPrecio() + ",'No disponible');";
               stmt.executeUpdate(sql);
            }
            stmt.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/

    /**
     * Metodo que lee un fichero, su nombre es el codigo que recibe el metodo de
     * la interfaz,los datos los va guardando linea a linea y los introduce en
     * un objeto de la clase videojuego
     *
     * @param codigo Se recibe de la interfaz , es introducido por el usuario y
     * es el nombre del archivo que queremos leer
     */
    public void leerJuego(int codigo) {
        juego = new Videojuego();//Instanciacion del objeto de la clase videojuego usando el constructor vacio
        try {
            br = new BufferedReader(new FileReader(codigo + ".juego"));
            String linea = br.readLine();
            while (linea != null) {
                juego.setCodigo(Integer.parseInt(linea));
                linea = br.readLine();
                juego.setTitulo(linea);
                linea = br.readLine();
                juego.setCategoria(linea);
                linea = br.readLine();
                juego.setPlataforma(linea);
                linea = br.readLine();
                juego.setPrecio(Integer.parseInt(linea));
                linea = br.readLine();
                juego.setDisponible(Boolean.parseBoolean(linea));
                linea = br.readLine();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Juego no encontrado");//Excepcion que se produce al no existir un fichero con ese titulo
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
