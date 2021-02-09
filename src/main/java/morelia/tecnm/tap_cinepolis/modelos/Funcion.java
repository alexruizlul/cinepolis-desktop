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
public class Funcion {
    private int idFuncion;
    private String hora;
    private double costo;
    private int idPelicula;
    private int idSala;
    
    public Funcion() {}

    public Funcion(int idFuncion, String hora, double costo, int idPelicula, int idSala) {
        this.idFuncion = idFuncion;
        this.hora = hora;
        this.costo = costo;
        this.idPelicula = idPelicula;
        this.idSala = idSala;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", hora=" + hora + ", costo=" + costo + ", idPelicula=" + idPelicula + ", idSala=" + idSala + '}';
    }
    
    
}
