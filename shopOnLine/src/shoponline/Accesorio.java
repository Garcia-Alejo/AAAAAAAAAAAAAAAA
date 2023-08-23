package shoponline;

public class Accesorio extends Producto {

    private Metal metal;
    private double peso;

    public Accesorio(Metal metal, double peso, String desc, int codigo, double precio) {
        super(desc, codigo, precio);
        this.metal = metal;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+ "(bijouterie" +  ")" ;
    }

    @Override
    public double getPrecio() {
        double precioFinal = 0;

        if (metal == Metal.ORO){
            precioFinal=metal.getPrecio()*this.peso;
         }
        
        if (metal == Metal.PLATA){
            precioFinal=metal.getPrecio()*this.peso;
        }
        if (metal == Metal.ACERO){
            precioFinal=metal.getPrecio()*this.peso;
        }
            
      return precioFinal;
    }
}
