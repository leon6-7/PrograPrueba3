/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba3;

/**
 *
 * @author Abril
 */
public class CapacidadException extends Exception {
    public CapacidadException(int capacidad){
        super("Capacidad maxima alcanzada ("+capacidad+" Pedidos)");
    
    }
}
