import java.net.Socket;
import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        /*String nome = "Gabriel Hadadda";
        String banco = "Bradesco";
        double agencia = 0001;
        double saldo = 15000;*/

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Qual sua Agencia? ");
        Double agencia = scanner.nextDouble();

        System.out.println("Dono da conta: " + nome);
        System.out.println("Numero da agencia do " + nome + " é " + agencia);

    }
}
