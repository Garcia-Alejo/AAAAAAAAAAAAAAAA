
import java.time.LocalDate;
import java.util.ArrayList;


public class Venta {
    private ArrayList <Producto> pitulin;
    private Cliente cliente ;
    private static int cantVentas ;
    private int nroFact ;
    private LocalDate fecha;

    public Venta(Cliente cliente, int nroFact) {
        this.pitulin = new ArrayList<>();
        this.cliente = cliente;
        this.nroFact = nroFact;
        this.fecha = LocalDate.now();   
    }
    
    
}
