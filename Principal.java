public class Principal {
  public static void main(String[] args) {
      ModeloBasico basico = new ModeloBasico();
      ModeloAvancado avancado = new ModeloAvancado();

      basico.ligar();
      basico.fazerLigacao("123456789");
      basico.enviarMensagem("123456789", "Olá, mundo!");
      basico.desligar();

      avancado.ligar();
      avancado.fazerLigacao("987654321");
      avancado.enviarMensagem("987654321", "Olá, mundo!");
      avancado.exibirHistorico();
      avancado.desligar();
  }
}