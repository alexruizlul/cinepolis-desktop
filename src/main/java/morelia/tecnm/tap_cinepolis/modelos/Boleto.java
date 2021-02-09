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
public class Boleto {
    private int idBoleto;
    private String fechaCompra;
    private double total;
    private int usuario_id;
    private int funcion_id;
    
    public Boleto() {}

    public Boleto(int idBoleto, String fechaCompra, double total, int usuario_id, int funcion_id) {
        this.idBoleto = idBoleto;
        this.fechaCompra = fechaCompra;
        this.total = total;
        this.usuario_id = usuario_id;
        this.funcion_id = funcion_id;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    @Override
    public String toString() {
        return "Boleto{" + "idBoleto=" + idBoleto + ", fechaCompra=" + fechaCompra + ", total=" + total + ", usuario_id=" + usuario_id + ", funcion_id=" + funcion_id + '}';
    }
    
    
}
