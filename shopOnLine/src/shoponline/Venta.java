
package shoponline;


import java.time.LocalDate;
import java.util.ArrayList;


public class Venta {
    private Cliente cliente ;
    private static int nroFact = 1090 ;
    private LocalDate fecha;
    private ArrayList<Producto> listaprod;

      public Venta(Cliente cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.nroFact++;
        this.listaprod=new ArrayList();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getListaprod() {
        return listaprod;
    }

    public void setListaprod(ArrayList<Producto> listaprod) {
        this.listaprod = listaprod;
    }

    public static int getCantVentas() {
        return nroFact;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.nroFact = cantVentas;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        Venta.nroFact = nroFact;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public void agregarProducto(Producto p){
        this.listaprod.add(p);
    }
    
    private double calcularImporteTotal(){
       double tot=0.0;
        for(Producto p:this.listaprod){ //for each precio in the arraylist prod repeat this
            tot += p.getPrecio();// acumulo los precios de cada producto en la lista
        }
        return tot;
    }
    public void imprimirFactura(){//para imprimir la factura usamos todo
        System.out.println("Factura N°: " + nroFact + " - " + fecha + " - " + this.cliente.toString() );
        for(Producto p:this.listaprod){
            System.out.println(p.toString());
        }
        System.out.println("Total a Pagar: ........... $" + this.calcularImporteTotal());
    }
}