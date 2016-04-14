package com.erikthegod.practica3;

/**
 * Contiene los atributos de un juego
 *
 * @author Erik The God
 */
public class Videojuego {

    private int codigo;
    private String titulo;
    private String categoria;
    private String plataforma;
    private int precio;
    private boolean disponible;

    /**
     * Constructor de la clase
     *
     * @param codigo Codigo del videojuego
     * @param titulo Titulo del videojuego
     * @param categoria Categoria del videojuego (FPS , futbol,..)
     * @param plataforma Plataforma del videojuego (ps4,xbox one,..)
     * @param precio Precio del videojuego
     * @param disponible Disponibilidad del videojuego
     */
    public Videojuego(int codigo, String titulo, String categoria, String plataforma, int precio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**
     * Constructor vacio
     */
    Videojuego() {

    }

    /**
     * Metodos que retornan y escriben en los atributos de un videojuego
     *
     */
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
