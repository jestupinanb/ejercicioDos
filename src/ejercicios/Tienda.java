/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Tienda {
    private ArrayList<Factura>facturas = new ArrayList();
    private double totalventas;
    private Productos productos = new Productos();
    
    public void setProducto(int codigo,String descripcion, double precioUnitario){
        productos.agregarProducto(codigo, descripcion, precioUnitario);
    }
    public void setFactura(int dia, int mes, int anio, int hora,int id, String nombre, String apellido,
            int codigoProducto, int cantidadVendida, int formadepago, int codigoPromocional) {
        Factura factura = new Factura(dia,mes,anio,hora,id,nombre,apellido,codigoProducto,cantidadVendida,formadepago,codigoPromocional,this.productos);
        factura.imprimir(factura);;
        this.facturas.add(factura);
    }
    
    public double montoTotalVentas(){
        int acumulador=0;
        for(int i=0;i<facturas.size();i++){
            acumulador+=facturas.get(i).getDetalle().obtenersubtotal();
        };
        return acumulador;
    }
    
    public void vendedorRealizoVenta(int id,int idP){
        boolean realizoVenta = false;
        for(int i=0;i<facturas.size() && realizoVenta==false;i++){
            if(id==facturas.get(i).getVendedor().getId() && idP==facturas.get(i).getDetalle().getProducto().getCodigo()){
                realizoVenta = true;  
                facturas.get(i).imprimir(facturas.get(i));
            };
        };
        if(!realizoVenta){
            System.out.println("No se realizo la venta");
        }
        //return realizoVenta;
    }
            
    public int mayorCatidadVentas(){
        ArrayList<Integer> vendedores = new ArrayList();
        ArrayList<Integer> Cvendedores = new ArrayList();
        int posicionTemp=-1;
        int mayorNum=0;
        int mayorPos=0;
        int temp;
        for(int i=0;i<facturas.size();i++){
            if(!estaDentroArreglo(facturas.get(i).getVendedor().getId(),vendedores)){
                vendedores.add(facturas.get(i).getVendedor().getId());
                Cvendedores.add(facturas.get(i).getDetalle().getCantidadvendida());
            }else{
                posicionTemp = posicionEstaDentroArreglo(facturas.get(i).getVendedor().getId(),vendedores);
                Cvendedores.set(posicionTemp, Cvendedores.get(posicionTemp)+facturas.get(i).getDetalle().getCantidadvendida());
            };
        };
        mayorNum=Cvendedores.get(0);
        mayorPos=0;
        for(int i=1;i<vendedores.size();i++){
            if(Cvendedores.get(mayorPos)<Cvendedores.get(i)){
                mayorNum=Cvendedores.get(i);
                mayorPos=i;
            };
        };
        return vendedores.get(mayorPos);
    }
    
    private int posicionEstaDentroArreglo(int id,ArrayList<Integer> vendedores){
        int posicion=-1;
        for(int i=0;i<vendedores.size();i++){
            if(id==vendedores.get(i)){
                posicion = i;
        };
        };
        return posicion;
    };
    
    private boolean estaDentroArreglo(int id,ArrayList<Integer> vendedores){
        boolean esta=false;
        for(int i=0;i<vendedores.size() && !esta;i++){
            esta = id==vendedores.get(i);
        };
        return esta;
    };
    
}
