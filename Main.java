import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        Funcionario desenvolvedor = lerDadosFuncionario(scanner, "Desenvolvedor");
        Funcionario gerente = lerDadosFuncionario(scanner, "Gerente");
        Funcionario suporte = lerDadosFuncionario(scanner, "Suporte");

        empresa.addFuncionarios(desenvolvedor);
        empresa.addFuncionarios(gerente);
        empresa.addFuncionarios(suporte);

        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("Folha salarial total: R$" + folhaSalarial);
    }

    public static Funcionario lerDadosFuncionario(Scanner scanner, String cargo) {
        System.out.println("Digite o nome do " + cargo + ":");
        String nome = scanner.nextLine();
        System.out.println("Digite o ID do " + cargo + ":");
        int id = scanner.nextInt();
        System.out.println("Digite o salário base do " + cargo + ":");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (cargo) {
            case "Desenvolvedor":
                return new Desenvolvedor(nome, id, salarioBase);
            case "Gerente":
                return new Gerente(nome, id, salarioBase);
            case "Suporte":
                return new Suporte(nome, id, salarioBase);
            default:
                throw new IllegalArgumentException("Cargo inválido: " + cargo);
        }
    }
}
