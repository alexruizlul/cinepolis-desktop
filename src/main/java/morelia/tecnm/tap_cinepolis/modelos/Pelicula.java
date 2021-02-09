/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morelia.tecnm.tap_cinepolis.modelos;

/**
 *
 * @author DELL
 */
public class Pelicula {
    private int idPelicula;
    private String nombre;
    private byte[] imagen;
    private String descripcion;
    
    public Pelicula() {}

    public Pelicula(int idPelicula, String nombre, byte[] imagen, String descripcion) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombre=" + nombre + ", imagen=" + imagen + ", descripcion=" + descripcion + '}';
    }
    
    
}
