
package prograprueba3;

public class PedidoInternacional extends Pedido{
    private String paisDestino;
    private double costoAduana;
    private final int tarifaBaseInternacional= 400;
    public PedidoInternacional(int id, String cliente, double monto, String paisDestino, double costoAduana){
    super(id, cliente, monto);
    this.paisDestino=paisDestino;
    this.costoAduana=costoAduana;
    }
    @Override
    public double calcularCostoEnvio(){
        return tarifaBaseInternacional+costoAduana;
    }
    @Override
    public String getTipo(){
    return "Internacional";
    }
    
}
