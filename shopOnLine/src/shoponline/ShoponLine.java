package shoponline;

import java.time.LocalDate;
import java.util.Scanner;


public class ShoponLine {

    public static void main(String[] args) {    
        Cliente cliente = new Cliente("Hector");  
        String nombre="Juan";
        Cliente cliente2 = new Cliente(nombre);  
        
        Venta venta = new Venta (cliente,LocalDate.now());
        
        cargarProductos(venta);
        venta.imprimirFactura();
    }
    // creo un cliente --> objeto nombre de variable = new Cliente(atributos)
    
    // creo una venta
    
    
    // llamar al método cargarProductos(v)

    private static void cargarProductos(Venta venta) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("desea agregar un producto  1-si  2-no ");
        int compra = teclado.nextInt();
     // definir todas las variables generalas para todos los productos
        
        String desc="";
        int codigo = 0;
        double precio = 0.0;
        int op=0;
        Producto p=null;
        
        while (compra == 1){
           op= menu();
            
            switch(op){ //hicimos un swithc(es como un if) y cada caso se evalua el producto que desea llevar el cliente
            
                case 1: System.out.println("Ingrese talle del pantalon");
                    int talle= teclado.nextInt();
                        System.out.println("Ingrese descripcion");
                        desc= teclado.nextLine();
                        System.out.println("Ingrese modelo");
                        String m= teclado.nextLine();
                        System.out.println("Ingrese codigo");
                        codigo=teclado.nextInt();
                        System.out.println("Ingrese precio");
                        precio= teclado.nextDouble();
                        p= new Pantalon (talle , desc , codigo, precio,m); 
                        venta.agregarProducto(p);//agregamos los productos aql array 
                        break; //usamos el constructor y le dimos valores
            
                case 2: System.out.println("Ingrese talle");
                        char talleR = (teclado.next ()).charAt(0) ;
                        System.out.println("Ingrese descripcion");
                        desc= teclado.nextLine();
                        System.out.println("Ingrese codigo");
                        codigo=teclado.nextInt();
                        System.out.println("Ingrese precio");
                        precio= teclado.nextDouble();
                        p= new Remeras (talleR , desc , codigo, precio); 
                        venta.agregarProducto(p);
                        break; 
            
                case 3: System.out.println("Que metal elige para su joya tan preciosa y bonita y fabulosa y cochambrosa");
                        String metal = teclado.next();
                        System.out.println("Ingrese el peso de la joya tan preciada que compra");
                        double peso = teclado.nextDouble();
                        p= new Accesorio (Metal.valueOf(metal.toUpperCase()), peso, desc, codigo, precio);
                        venta.agregarProducto(p);
                        break;
            }
         System.out.println("desea agregar un producto  1-si  2-no ");
         compra = teclado.nextInt();   
        }
    }

    private static int menu() { //
        Scanner teclado = new Scanner (System.in); 
        System.out.println("que producto queire llevar  1-pantis  2- Tshirts  3- julerie ");
        int prenda= teclado.nextInt();
        return prenda;
    }
}
