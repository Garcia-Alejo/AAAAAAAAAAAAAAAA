
public class Pantalon extends Producto {
    private int talle ;

    public Pantalon(int talle, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Pantalon" + talle ;
    }

    @Override
    public double getPrecio() {
        double precioFinal = 0;

         if (talle == 'O') {
            precioFinal = this.precio + (this.precio * 15) / 100;
        }
        if (talle == 'S') {
            precioFinal = this.precio + (this.precio * 25) / 100;
        }
        if (talle == 'R') {
            precioFinal = this.precio + (this.precio * 15) / 100;
        }
        
        return precioFinal;
    }

    public int getTalle() {
        return talle;
    }
    
}
