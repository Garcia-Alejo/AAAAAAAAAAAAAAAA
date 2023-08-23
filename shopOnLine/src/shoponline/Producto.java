
package shoponline;

public abstract class Producto {
    private String desc ;
    private int codigo ;
    protected double precio ; 

    public Producto(String desc, int codigo, double precio) {
        this.desc = desc;
        this.codigo = codigo;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto" + desc + "codigo" + codigo + "precio=" + precio ;
    }
    
    public abstract double getPrecio ();

    public String getDesc() {
        return desc;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
