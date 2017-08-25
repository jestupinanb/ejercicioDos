/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author Jaime
 */
public class Productos {
    private ArrayList<Producto>productos = new ArrayList();
    
   public void agregarProducto(int codigo,String descripcion,double precio) {
       Producto producto = new Producto(codigo,descripcion,precio);
       this.productos.add(producto);
    }

    public Producto getProducto(int codigo){
        Producto producto = productos.get(0);
        for(int i=0;i<productos.size();i++){
          if(productos.get(i).getCodigo() == codigo){
              producto = productos.get(i);
          };
        };
        return  producto;
    }
}
