import java.util.Scanner;

public class BonusSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double salary = scanner.nextDouble();


        double upgradedSalary = salary > 15000 ? salary * 1.10 : salary * 1.05;

        System.out.println("Seu salario teve reajuste para: " + upgradedSalary);

        scanner.close();
    }
}
