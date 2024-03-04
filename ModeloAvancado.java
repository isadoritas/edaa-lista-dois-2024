import java.util.ArrayList;
import java.util.List;

public class ModeloAvancado implements Celular {
  private List<String> historico = new ArrayList<>();

  @Override
  public void ligar() {
      System.out.println("Celular ligado.");
  }

  @Override
  public void desligar() {
      System.out.println("Celular desligado.");
  }

  @Override
  public void fazerLigacao(String numero) {
      System.out.println("Fazendo ligação para " + numero);
      historico.add("Ligação feita para " + numero);
  }

  @Override
  public void enviarMensagem(String numero, String mensagem) {
      System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
      historico.add("Mensagem enviada para " + numero + ": " + mensagem);
  }

  public void exibirHistorico() {
      System.out.println("Histórico:");
      for (String acao : historico) {
          System.out.println(acao);
      }
  }
}
