
package shoponline;


public class Remeras extends Producto {

    private char talle;

    public Remeras(char talle, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return super.toString()+ "(talle" + talle + ")" ;
    }

    @Override

    public double getPrecio() {
       
        double precioFinal = 0;
        
        if (talle == 'S') {
            precioFinal = this.precio + (this.precio * 5) / 100;
        }
        if (talle == 'M') {
            precioFinal = this.precio + (this.precio * 10) / 100;
        }
        if (talle == 'L') {
            precioFinal = this.precio + (this.precio * 15) / 100;
        }
        if (talle == 'X') {
            precioFinal = this.precio    + (this.precio * 20) / 100;
        }

        return precioFinal;
    }

    public char getTalle() {
        return talle;
    }

}