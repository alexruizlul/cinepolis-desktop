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
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String claveApi;

    public Usuario() {}
    
    public Usuario(int idUsuario, String nombre, String email, String claveApi) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.claveApi = claveApi;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClaveApi() {
        return claveApi;
    }

    public void setClaveApi(String claveApi) {
        this.claveApi = claveApi;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email + ", claveApi=" + claveApi + '}';
    }
    
    
}
