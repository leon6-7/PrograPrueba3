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
    public int buscarPorId(int id)throws PedidoNoEncontrado{
    for(int i=0;i<=cantidad;i++){
        if(pedidos[i].id==id){
            return i;
        }
    }
        throw new PedidoNoEncontrado(id);
    }
    public void cambiarEstado(int id, EstadoPedido nuevoEstado)throws TransicionEstadoException, PedidoNoEncontrado{
    if(buscarPorId(id)!=-1){
        int pos = buscarPorId(id);
        if(pedidos[pos].getEstado().transicionarA(nuevoEstado)){
            pedidos[pos].setEstado(nuevoEstado);
            
        }   else{
        throw new TransicionEstadoException(pedidos[pos].getEstado(), nuevoEstado);
        
        }
    }
    
    }
    public void listarPorEstado(EstadoPedido estado){
    Pedido pedidos_ordenada[];
    for(Pedido p: pedidos){
        switch(p.estado){
        
            case CANCELADO:
                
            case PROCESANDO:
            case ENVIADO:
            
        
        }
        
    }
    
    
    }
    
    public void agregarPedido(Pedido dato)throws CapacidadException{
        if(cantidad==pedidos.length){
            throw new CapacidadException(pedidos.length);
        }
        
        pedidos[cantidad]=dato;
        cantidad++;
    }
    
}