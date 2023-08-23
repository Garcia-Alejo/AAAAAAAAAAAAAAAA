/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package shoponline;

/**
 *
 * @author ET36
 */
public enum Metal {
   PLATA(500), ORO(1000), ACERO(250);
   private int precio;

    private Metal(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
   
}
