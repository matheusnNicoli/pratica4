package interfaces;
import Exceptions.*;
public interface Processavel {
  void processarPedido() throws PedidoInvalidoException;
  double calcularValorFinal();
} 