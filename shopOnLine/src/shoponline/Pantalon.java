
package shoponline;


public class Pantalon extends Producto {
    private int talle ;
    private String modelo ;

    public Pantalon(int talle, String desc, int codigo, double precio, String m) {
        super(desc, codigo, precio);
        this.talle = talle;
        this.modelo=m;
    }

    @Override
    public String toString() {
        return super.toString()+ "(talle" + talle + ")" ;
    }

    @Override
    public double getPrecio() {
        double precioFinal = 0;

         if (modelo.equalsIgnoreCase("O") ) {
            precioFinal = this.precio + (this.precio * 15) / 100;
        }
        if (modelo .equalsIgnoreCase("S")) {
            precioFinal = this.precio + (this.precio * 25) / 100;
        }
        if (modelo .equalsIgnoreCase("R")) {
            precioFinal = this.precio - (this.precio * 15) / 100;
        }
        
        return precioFinal;
    }
}