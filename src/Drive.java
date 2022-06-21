import java.util.Scanner;
//OPERADOR TERNARIO
public class Drive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor informe a sua idade: ");

        int idade = scanner.nextInt();

        String msg = idade >= 18 ? "Pode dirigir" : "Nao pode dirigir";

        System.out.println(msg);


        scanner.close();
    }
}