package Model;

import Enums.Categoria;
import Enums.StatusPedido;
import Exceptions.PedidoInvalidoException;

public class PedidoAlimento extends Pedido{

    public PedidoAlimento(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria)
            throws PedidoInvalidoException {
        super(id, nomeCliente, valor, status, categoria);
    }

    @Override 
    public double calcularValorFinal(){
        return super.getValor();
    };
    
    
}
