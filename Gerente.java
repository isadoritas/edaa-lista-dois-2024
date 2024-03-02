public class Gerente extends Funcionario {

  public Gerente(String nome, int id, double salarioBase) {
    super(nome, id, salarioBase);
  }

  public double calcularSalario(double salarioBase) {
    double salarioTotal = salarioBase + (salarioBase * 0.1);
    return salarioTotal;
  }
  
}