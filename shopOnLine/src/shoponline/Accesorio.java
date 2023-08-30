package shoponline;

public class Accesorio extends Producto implements Importable{

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
       precioFinal=this.arancelAduanero(precioFinal);
       precioFinal=this.arancelEnvio(precioFinal);
      
       return precioFinal;
    }

    @Override
    public double arancelAduanero(double p) {
        double descuento=0;
        descuento=p*10/100;
        return descuento;
    }

    @Override
    public double arancelEnvio(double p) {
        double descuento=0;
        descuento=p*2/100;
        return descuento; 
    }
      
    
}
