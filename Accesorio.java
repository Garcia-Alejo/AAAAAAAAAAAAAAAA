package shoponline;

public class Accesorio extends Producto {

    private String metal;
    private double peso;
    private int cantMetal;

    public Accesorio(String metal, double peso, String desc, int codigo, double precio,int cantMetal) {
        super(desc, codigo, precio);
        this.metal = metal;
        this.peso = peso;
        this.cantMetal=cantMetal;
    }

    @Override
    public String toString() {
        return super.toString()+ "(bijouterie" +  ")" ;
    }

    @Override
    public double getPrecio() {
        double precioFinal = 0;
        int valorOro = 1000;
        int valorPlata = 750;
        int valorAcero = 500;
        
        if (metal.equals("oro")){
            precioFinal=valorOro*cantMetal;
         }
        
        if (metal.equals("plata")){
            precioFinal=valorPlata*cantMetal;
        }
        if (metal.equals("acero")){
            precioFinal=valorAcero*cantMetal;
        }
            
      return precioFinal;
    }
}
