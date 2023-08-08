
public class Accesorio extends Producto {
    private String metal ;
    private double peso ;

    public Accesorio(String metal, double peso, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.metal = metal;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "metal=" + metal + ", peso=" + peso + '}';
    }

    @Override
    public double getPrecio() {
        double precioFinal=0; 


        return precioFinal;
    }



    public String getMetal() {
        return metal;
    }

    public double getPeso() {
        return peso;
    }
    
}
