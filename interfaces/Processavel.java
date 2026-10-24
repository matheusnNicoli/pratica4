package interfaces;
import exceptions.*;
public interface Processavel {
  void processarPedido() throws PedidoInvalidoException;
  double calcularValorFinal();
} 