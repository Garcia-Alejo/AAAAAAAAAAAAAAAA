package shoponline;

import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;


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
        int compra = Integer.parseInt(JOptionPane.showInputDialog("desea agregar un producto  1-si  2-no "));
     // definir todas las variables generalas para todos los productos
        
        String desc="";
        int codigo = 0;
        double precio = 0.0;
        int op=0;
        Producto p=null;
        
        while (compra == 1){
           op= menu();
            
            switch(op){ //hicimos un swithc(es como un if) y cada caso se evalua el producto que desea llevar el cliente
            
                case 1: 
                    int talle= Integer.parseInt(JOptionPane.showInputDialog("Ingrese talle del pantalon"));
                        desc= JOptionPane.showInputDialog("Ingrese descripcion");
                        String m= JOptionPane.showInputDialog("Ingrese modelo");
                        codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo"));
                        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
                        p= new Pantalon (talle , desc , codigo, precio,m); 
                        venta.agregarProducto(p);//agregamos los productos aql array 
                        break; //usamos el constructor y le dimos valores
            
                case 2: 
                        char talleR =JOptionPane.showInputDialog("Ingrese talle").charAt(0) ;
                        desc=JOptionPane.showInputDialog("Ingrese descripcion");
                        codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo"));
                        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
                        p= new Remeras (talleR , desc , codigo, precio); 
                        venta.agregarProducto(p);
                        break; 
            
                case 3: 
                        String metal = JOptionPane.showInputDialog("Que metal elige para su joya tan preciosa y bonita y fabulosa y cochambrosa");
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la joya tan preciada que compra"));
                        p= new Accesorio (Metal.valueOf(metal.toUpperCase()), peso, desc, codigo, precio);
                        venta.agregarProducto(p);
                        break;
            }
         compra = Integer.parseInt(JOptionPane.showInputDialog("desea agregar un producto  1-si  2-no ")); 
        }
    }

    private static int menu() { //
        Scanner teclado = new Scanner (System.in); 
        int prenda= Integer.parseInt(JOptionPane.showInputDialog("que producto queire llevar  1-pantis  2- Tshirts  3- julerie "));
        return prenda;
    }
}
