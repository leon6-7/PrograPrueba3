
package prograprueba3;

public class PedidoNacional extends Pedido {
    private int dist;
    private double tarifa=100;
    public PedidoNacional(int id, String cliente, double monto, int dist){
        super(id, cliente, monto);
        this.dist=dist;
    
    }
    @Override
    public double calcularCostoEnvio(){
        double tot_costo=tarifa+(dist*0.10);
        return tot_costo;
    }
    @Override
    public String getTipo(){
        return "Nacional";
    }
}
