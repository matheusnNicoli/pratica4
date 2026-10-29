package Model;

import Enums.Categoria;
import Enums.StatusPedido;
import Exceptions.PedidoInvalidoException;
import interfaces.Entregaavel;

public class PedidoEletronico extends Pedido implements Entregaavel{

    public PedidoEletronico(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria)
            throws PedidoInvalidoException {
        super(id, nomeCliente, valor, status, categoria);
    }
    @Override 
    public double calcularFrete(){
      return 20 + (super.getValor()*0.10);
    };
    @Override 
    public double calcularValorFinal(){
        double valor = super.getValor();
        if (valor >100){
            valor = valor-(valor*0.10);
        }
        return valor + calcularFrete();
        
    };
}
