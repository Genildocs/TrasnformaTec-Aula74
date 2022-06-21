import java.util.Scanner;
// Condicionais if/else
public class Condicionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor informe sua hora: ");
        int hora =scanner.nextInt();

        if(hora < 12){
            System.out.println("Bom dia, sao " + hora + " horas da manha!");
            System.out.println("Hora de acordar!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa Tarde, sao " + hora + " horas da tarde.");
            System.out.println("Vamos lanchar!");
        }else if (hora >= 18 && hora < 24) {
            System.out.println("Boa noite, sao "  + hora + " horas da noite.");
            System.out.println("Vamos Jantar!");

        }else{
            System.out.println("Horario invalido!");

        } scanner.close();
    }
}
