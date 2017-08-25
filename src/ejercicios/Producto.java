/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private int Codigo;
    private String descripcion;
    private double preciounitario;
    
    public Producto(int codigo,String descripcion, double preciounitario) {
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
        this.Codigo = codigo;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPreciounitario() {
        return preciounitario;
    }
    
}
