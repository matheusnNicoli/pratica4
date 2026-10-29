package Model;

import Enums.Categoria;
import Enums.StatusPedido;
import Exceptions.PedidoInvalidoException;
import interfaces.Entregaavel;

public class PedidoRoupa extends Pedido implements Entregaavel{

    public PedidoRoupa(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria)
            throws PedidoInvalidoException {
        super(id, nomeCliente, valor, status, categoria);
    }
    public double calcularFrete(){
        return 10 + (super.getValor()*0.05);
    };
    public double calcularValorFinal(){
        double valor = super.getValor();
        if(valor > 200){
            valor += valor *0.20;
        }
        return valor + calcularFrete();
    };
    
}
