package Model;
import java.util.Random;
import Enums.*;
import Exceptions.PedidoInvalidoException;
import interfaces.Processavel;
public abstract class Pedido implements Processavel{
    private int id;
    private String nomeCliente;
    private double valor;
    private StatusPedido status;
    private Categoria categoria;
    
    public Pedido(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) throws PedidoInvalidoException {
        Random randon = new Random();
        this.id = randon.nextInt(989)+10;
        this.nomeCliente = nomeCliente;
        if(valor<=0){
            throw new PedidoInvalidoException("Valor invalido!");
        }
        this.valor = valor;
        this.status = status;
        this.categoria = categoria;
    }

    

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public StatusPedido getStatus() {
        return status;
    }
    public void setStatus(StatusPedido status) {
        this.status = status;
    }


    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public int getId() {
        return id;
    }
    @Override 
    public void processarPedido() throws PedidoInvalidoException{
        if(status == StatusPedido.CANCELADO || status == StatusPedido.ENTREGUE ){
            throw  new PedidoInvalidoException("Pedido Invalido");
        }

    }

    

    
}
