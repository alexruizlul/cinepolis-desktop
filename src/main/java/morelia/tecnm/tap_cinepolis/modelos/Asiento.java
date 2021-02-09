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
public class Asiento {
    private int idAsiento;
    private String nombre;
    private String estatus;
    private int sala_id;
    
    public Asiento() {}

    public Asiento(int idAsiento, String nombre, String estatus, int sala_id) {
        this.idAsiento = idAsiento;
        this.nombre = nombre;
        this.estatus = estatus;
        this.sala_id = sala_id;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    @Override
    public String toString() {
        return "Asiento{" + "idAsiento=" + idAsiento + ", nombre=" + nombre + ", estatus=" + estatus + ", sala_id=" + sala_id + '}';
    }
    
}
