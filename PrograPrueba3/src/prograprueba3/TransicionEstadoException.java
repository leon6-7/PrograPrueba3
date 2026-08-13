/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba3;

/**
 *
 * @author Abril
 */
public class TransicionEstadoException extends Exception {
    public TransicionEstadoException(EstadoPedido actual, EstadoPedido nuevo){
        super("No se puede pasar de: "+actual+" a el estado: "+nuevo+
                "(estado actual final: )"+actual.getesFinal()+")");
    }
}
