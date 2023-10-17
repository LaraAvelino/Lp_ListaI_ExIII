import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do primeiro funcionário: ");
        int numeroFuncionario1 = scanner.nextInt();
        System.out.print("Digite o número de horas trabalhadas pelo primeiro funcionário: ");
        double horasTrabalhadas1 = scanner.nextDouble();
        System.out.print("Digite o valor recebido por hora pelo primeiro funcionário: ");
        double valorPorHora1 = scanner.nextDouble();

        System.out.print("Digite o número do segundo funcionário: ");
        int numeroFuncionario2 = scanner.nextInt();
        System.out.print("Digite o número de horas trabalhadas pelo segundo funcionário: ");
        double horasTrabalhadas2 = scanner.nextDouble();
        System.out.print("Digite o valor recebido por hora pelo segundo funcionário: ");
        double valorPorHora2 = scanner.nextDouble();

        double salario1 = horasTrabalhadas1 * valorPorHora1;
        double salario2 = horasTrabalhadas2 * valorPorHora2;

        System.out.printf("Funcionário %d: Salário = %.2f%n", numeroFuncionario1, salario1);
        System.out.printf("Funcionário %d: Salário = %.2f%n", numeroFuncionario2, salario2);

        scanner.close();
    }
}
