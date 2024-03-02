import java.util.ArrayList;
import java.util.List;

public class Empresa {

  private List<Funcionario> funcionarios;

  public Empresa() {
    this.funcionarios = new ArrayList<>();
  }

  public void addFuncionarios(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }
  public double calcularFolhaSalarial() {
    double total  = 0;
    for (Funcionario funcionario : funcionarios) {
      total += funcionario.getSalarioBase();
    }
    return total;
  }
}