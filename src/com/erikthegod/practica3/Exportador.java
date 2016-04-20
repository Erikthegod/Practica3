package com.erikthegod.practica3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * Exporta los datos de la interfaz a distintos tipos de archivos, html , xlx,
 * sql y xml
 *
 * @author Erik The God
 */
public class Exportador {

    PrintWriter fichero;

    /**
     * Metodo que exporta los datos del objeto de la clase videojuego recibido ,
     * en formato xls
     *
     * @param vid Objeto de la clase videojuego con los datos introducidos por
     * el usuario en la interfaz
     */
    public void exportarXls(Videojuego vid) {
        try {
            fichero = new PrintWriter(vid.getCodigo() + ".xls");
            fichero.println(vid.getCodigo() + "\t" + vid.getTitulo());
            fichero.println(vid.getCategoria() + '\t' + vid.getPlataforma());
            fichero.println(vid.getPrecio());
            fichero.println(vid.isDisponible());
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al exportar el juego");
        } finally {
            fichero.close();
        }
        JOptionPane.showMessageDialog(null, "El juego ha sido exportado correctamente");
    }

    /**
     * Metodo que exporta los datos del objeto de la clase videojuego recibido ,
     * en formato html
     *
     * @param vid Objeto de la clase videojuego con los datos introducidos por
     * el usuario en la interfaz
     */
    public void exportarHtml(Videojuego vid) {
        try {
            fichero = new PrintWriter(vid.getCodigo() + ".html");
            fichero.println("<!DOCTYPE html>");
            fichero.println("<html>");
            fichero.println("<head>");
            fichero.println("<title> ErikTheGod </title>");
            fichero.println("</head>");
            fichero.println("<body bgcolor=\"blue\" text=\"white\">");
            fichero.println("<table border=\"5\" rules=\"all\">");
            fichero.println("<tr>");
            fichero.println("<td>" + vid.getCodigo() + "</td>");
            fichero.println("</tr>");
            fichero.println("<tr>");
            fichero.println("<td>" + vid.getTitulo() + "</td>");
            fichero.println("</tr>");
            fichero.println("<tr>");
            fichero.println("<td>" + vid.getCategoria() + "</td>");
            fichero.println("</tr>");
            fichero.println("<tr>");
            fichero.println("<td>" + vid.getPlataforma() + "</td>");
            fichero.println("</tr>");
            fichero.println("<tr>");
            fichero.println("<td>" + vid.getPrecio() + "</td>");
            fichero.println("</tr>");
            fichero.println("<tr>");
            if (vid.isDisponible() == true) {
                fichero.println("<td> Disponible </td>");
            } else {
                fichero.println("<td> No disponible </td>");
            }
            fichero.println("</tr>");
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al exportar el juego");
        } finally {
            fichero.close();
        }
        JOptionPane.showMessageDialog(null, "El juego ha sido exportado correctamente");
    }

    /**
     * Metodo que exporta los datos del objeto de la clase videojuego recibido ,
     * en formato xml
     *
     * @param vid Objeto de la clase videojuego con los datos introducidos por
     * el usuario en la interfaz
     */
    public void exportarXml(Videojuego vid) {
        try {

            fichero = new PrintWriter(vid.getCodigo() + ".xml");
            fichero.println("<Juego>");
            fichero.println("\t<Codigo>" + vid.getCodigo() + "</Codigo>");
            fichero.println("\t<Titulo>" + vid.getTitulo() + "</Titulo>");
            fichero.println("\t<Categoria>" + vid.getCategoria() + "</Categoria>");
            fichero.println("\t<Plataforma>" + vid.getPlataforma() + "</Plataforma>");
            fichero.println("\t<Precio>" + vid.getPrecio() + "</Precio>");
            if (vid.isDisponible() == true) {
                fichero.println("\t<Disponible> Si </Disponible>");
            } else {
                fichero.println("\t<Disponible> No </Disponible>");
            }
            fichero.println("</Juego>");
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al exportar el juego");
        } finally {
            fichero.close();
        }
        JOptionPane.showMessageDialog(null, "El juego ha sido exportado correctamente");
    }

    /**
     * Metodo que exporta los datos del objeto de la clase videojuego recibido ,
     * en formato sql
     *
     * @param vid Objeto de la clase videojuego con los datos introducidos por
     * el usuario en la interfaz
     */
    public void exportarSql(Videojuego vid) {
        try {
            fichero = new PrintWriter(vid.getCodigo() + ".sql");
            fichero.println("Create table juegos(");
            fichero.println("codigo number(3) constraint jue_num_pk Primary key,");
            fichero.println("titulo varchar2(20),");
            fichero.println("categoria varchar2(20),");
            fichero.println("plataforma varchar2(20),");
            fichero.println("precio number(3),");
            fichero.println("disponible varchar2(4)");
            fichero.println(");");
            if (vid.isDisponible() == true) {
                fichero.println("insert into juegos values(" + vid.getCodigo() + ",'" + vid.getTitulo() + "','" + vid.getCategoria() + "','" + vid.getPlataforma() + "'," + vid.getPrecio() + ",'Disponible');");
            } else {
                fichero.println("insert into juegos values(" + vid.getCodigo() + ",'" + vid.getTitulo() + "','" + vid.getCategoria() + "','" + vid.getPlataforma() + "'," + vid.getPrecio() + ",'No disponible');");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al exportar el juego");
        } finally {
            fichero.close();
        }
        JOptionPane.showMessageDialog(null, "El juego ha sido exportado correctamente");
    }

}
