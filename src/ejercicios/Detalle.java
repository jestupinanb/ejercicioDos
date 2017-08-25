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
public class Detalle {
private int codigo;
private int cantidadvendida=0;
private Producto producto;

    public Detalle(int codigoProducto,int cantidadVendida,Productos productos){
        this.codigo = codigoProducto;
        this.cantidadvendida = cantidadVendida;
        this.producto = productos.getProducto(codigoProducto);//**BOOOOOOOOOM ???
    }
    
    public double obtenersubtotal(){
        //System.out.println(this.cantidadvendida+"*"+producto.getPreciounitario());
        double subtotal=this.cantidadvendida*producto.getPreciounitario();
        return subtotal;
    }
    
    public int getCantidadvendida() {
        return cantidadvendida;
    } 

    public Producto getProducto() {
        return producto;
    }
    
}
