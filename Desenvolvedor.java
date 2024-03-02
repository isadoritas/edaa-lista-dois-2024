public class Desenvolvedor extends Funcionario {
  
  public Desenvolvedor(String nome, int id, double salarioBase) {
    super(nome, id, salarioBase);
  }
  public double calcularSalario(double salarioBase) {
    double salarioTotal = salarioBase + (salarioBase * 0.2) + 1000;
    return salarioTotal;
  }
  
}