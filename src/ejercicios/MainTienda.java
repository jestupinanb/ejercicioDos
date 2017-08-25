/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.*;
/**
 *
 * @author Jaime
 */
public class MainTienda {
    
    public static void main(String[] args){
        Tienda tienda = new Tienda();
        Scanner teclado = new Scanner(System.in);
        int opcion =0;
        int cantidad=0;
        int codigo=0;
        String descripcion;
        double precioUnitario=0;
        double montoTotal;
        int idVendedor;
        int idProducto;
        int dia,mes, anio, hora;
        int id;
        String nombre, apellido;
        int codigoProducto, cantidadVendida, formadepago, codigoPromocional;
        
        while(opcion != 6){
        System.out.println("Menu");
        System.out.println("¿Que desea realizar? ");
        System.out.println("1.Ingresar los datos de los productos.");
        System.out.println("2.Ingresar los datos de las ventas registradas.");
        System.out.println("3.Determinar cual fue el vendedor que realizo la mayor cantidad de ventas");
        System.out.println("4.Determinar si el vendedor x realizo la venta de y producto.");
        System.out.println("5.Determinar el monto total de ventas realizadas.");
        System.out.println("6.Salir");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Cuantos datos desea ingresar?");
                cantidad = teclado.nextInt();
                for(int i=0;i<cantidad;i++){
                    System.out.println("Ingrese los datos del producto numero "+i);
                    System.out.println("Codigo del producto: ");
                    codigo = teclado.nextInt();
                    System.out.println("Descripcion del producto: ");
                    descripcion = teclado.next();
                    System.out.println("Precio unitario: ");
                    precioUnitario = teclado.nextDouble();
                    tienda.setProducto(codigo, descripcion, precioUnitario);
                };
                break;
            case 2:
                System.out.println("Cuantos datos desea ingresar?");
                cantidad = teclado.nextInt();
                for(int i=0;i<cantidad;i++){
                    System.out.println("Ingrese los datos de la venta registradanumero "+i);
                    System.out.println("Fecha, dia: ");
                    dia = teclado.nextInt();
                    System.out.println("mes: ");
                    mes = teclado.nextInt();
                    System.out.println("Ano: ");
                    anio = teclado.nextInt();
                    System.out.println("Hora: ");
                    hora = teclado.nextInt();
                    System.out.println("Vendedor: id:");
                    id = teclado.nextInt();
                    System.out.println("Nombre: ");
                    nombre = teclado.next();
                    System.out.println("Apellido: ");
                    apellido = teclado.next();
                    System.out.println("Codigo del producto vendido: ");
                    codigoProducto = teclado.nextInt();
                    System.out.println("Cantidad vendida: ");
                    cantidadVendida = teclado.nextInt();
                    System.out.println("Forma de pago(0-Efectivo, 1-Debito,2-Tarjeta)");
                    formadepago = teclado.nextInt();
                    System.out.println("Codigo promocional: ");
                    codigoPromocional = teclado.nextInt();
                    tienda.setFactura(dia, mes, anio, hora, id, nombre, apellido, codigoProducto, cantidadVendida, formadepago, codigoPromocional);
                };
                break;
            case 3:
                id = tienda.mayorCatidadVentas();
                System.out.println("El vendedor que realizo la mayor cantidad de ventas fue: ");
                System.out.println("Id:"+id);
                break;
            case 4:
                System.out.println("Ingrese la id del vendedor:");
                idVendedor = teclado.nextInt();
                System.out.println("Ingrese la id del producto:");
                idProducto = teclado.nextInt();
                tienda.vendedorRealizoVenta(idVendedor, idProducto);
                break;
            case 5:
                montoTotal = tienda.montoTotalVentas();
                System.out.println("El monto total de las ventas realizadas fue: "+montoTotal);
                break;
            default:break;
        };
        }; 
    }
}
