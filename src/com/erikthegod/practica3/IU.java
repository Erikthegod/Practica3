/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.practica3;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * Interfaz
 *
 * @author kinton
 */
public class IU {

    private static final int EXISTE = 1;
    private static final int NO_EXISTE = -1;

    /**
     * Metodo que cierra la aplicacion
     */
    public void salir() {
        System.exit(0);
    }

    /**
     * Metodo que da informacion sobre la aplicacion
     */
    public void about() {
        JOptionPane.showMessageDialog(null, "Aplicacion hecha por ErikTheGod \nVersion 1.0 \nCualquier problema notificar a erik14madridista@gmail.com");
    }

    /**
     * Metodo que comprueba si juego que queremos guardar , tiene un codigo
     * igual a uno que ya exista
     *
     * @param codigo Se recibe de la interfaz , es introducido por el usuario y
     * es el nombre del archivo que queremos guardar
     * @return Devuelve una constante dependiendo de si el fichero ya existe o
     * no
     */
    public int verificador(int codigo) {

        String nombreF;
        nombreF = Integer.toString(codigo);
        File fichero = new File(nombreF + ".juego");
        if (fichero.exists()) {
            return EXISTE;
        } else {
            return NO_EXISTE;
        }
    }    
}
