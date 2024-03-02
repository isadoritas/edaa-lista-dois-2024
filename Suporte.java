public class Suporte extends Funcionario {

  public Suporte(String nome, int id, double salarioBase) {
    super(nome, id, salarioBase);
}

  public double calcularSalario(double salarioBase) {
    double salarioTotal = salarioBase + (salarioBase * 0.5);
    return salarioTotal;

  }
  
}