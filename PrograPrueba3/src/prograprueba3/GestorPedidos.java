/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba3;

/**
 *
 * @author Abril
 */
public class GestorPedidos {
    private final Pedido pedidos[];
    private int cantidad;
            
    public GestorPedidos(int size){
        pedidos=new Pedido[size];
        cantidad=0;
    
    }
    
    public void agregarPedido(Pedido dato)throws CapacidadException{
        if(cantidad==pedidos.length){
            throw new CapacidadException(pedidos.length);
        }
        
        pedidos[cantidad]=dato;
        cantidad++;
    }
    
}