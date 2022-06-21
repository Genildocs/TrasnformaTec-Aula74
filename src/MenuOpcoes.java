import java.util.Scanner;
//Swtich Case

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Menu de opcoes:\n1 - Para contratar servicos\n2 - " +
                "Para falar com atendente\n3 - Para reclamacoes\n4 - Sair");
        System.out.print("Digite sua opcao: ");
        int opcao =scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Seja muito bem vindo! Sua visita e um prazer!");
                break;
            case 2:
                System.out.println("Algum problema?");
                break;
            case 3:
                System.out.println("Infelizmente todos os canais de atendimentos estao ocupados.");
                break;

            case 4:
                System.out.println("Para Sair!");
                break;

            default:
                System.out.println("Opcao invalida!");
                break;

        } scanner.close();

    }
}
