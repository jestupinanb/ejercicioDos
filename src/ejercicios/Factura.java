/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private int formadepago;
    private int codigopromocional=0;
    private double preciofinal=0;
    private Detalle detalle;
    private Vendedor vendedor;
    private Fecha fecha;

    public Factura(int dia, int mes, int anio, int hora,int id, String nombre, String apellido,
            int codigoProducto, int cantidadVendida, int formadepago, int codigoPromocional,Productos productos) {
        this.fecha = new Fecha(dia,mes,anio,hora);
        this.vendedor = new Vendedor(id,nombre,apellido);
        this.detalle = new Detalle(codigoProducto,cantidadVendida,productos);
        this.formadepago = formadepago;
        this.codigopromocional = codigoPromocional;
        this.preciofinal = 0;
    }

    public Detalle getDetalle() {
        return detalle;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void imprimir(Factura facturaImp){
        
        System.out.println("Fecha:  Dia:"+facturaImp.fecha.getDia()+" Mes:"+facturaImp.fecha.getMes()+" Año:"+facturaImp.fecha.getAnio()+" Hora:"
        + facturaImp.fecha.getHora()+":00");
        
        System.out.println("Vendedor: ");
        System.out.println("Id: "+facturaImp.getVendedor().getId());
        System.out.println("Nombre: "+facturaImp.getVendedor().getNombre());
        System.out.println("Apellido: "+facturaImp.getVendedor().getApellido());
       
        System.out.println("Codigo producto vendido: "+facturaImp.getDetalle().getProducto().getCodigo());
        System.out.println("Cantidad vendida: "+facturaImp.getDetalle().getCantidadvendida());
        
        System.out.print("Forma de pago: ");
        if(facturaImp.formadepago==0){
            System.out.println(" Efectivo");    
        }else if(facturaImp.formadepago==1){
            System.out.println("Débito");
        }else if(facturaImp.formadepago==2){
            System.out.println("Tarjeta");
        };
        
        System.out.println("codigo promocional: "+facturaImp.codigopromocional);
    }
}
