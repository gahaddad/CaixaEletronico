import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {

        //String usuario = "Gabriel";
        String banco = "Bradesco";
        double agencia = 0012D; //colocr o D no final
        double saldo = 15000.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println(banco  + agencia  + saldo);

    }
}
