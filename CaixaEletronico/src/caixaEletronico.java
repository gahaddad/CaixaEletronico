import java.util.Scanner;

public class caixaEletronico {
   
        double saldo = 15000.00;
        double saque = 0.00;

        /*private String[] args;
        String nome = args[0]; //Pega o valor que esta em launch, ja estabelecido.
        String agencia = args[1];
        String banco = args[2];
        //String saldo = args[3];*/

        String nome = "Gabriel";
        long agencia = 015010L;
        String banco = "Santander";
        
        Scanner scanner = new Scanner(System.in);

       /*System.out.println("Digite seu nome: "); //Pega o que o usuario digitar. 
        String nome = scanner.next(); // Salva o que o usuario digitou.

        System.out.println("Qual seu Banco? ");
        String banco = scanner.next();
        
        System.out.println("Coloque o numero da sua agencia: ");
        double agencia = scanner.nextDouble(); */

    public void Sacar(){
        
        System.out.println("Digite o valor so saque: ");
        saque = scanner.nextDouble();

        if(saldo > saque){
            saldo = saldo - saque;
        }else{
            System.out.println("Saldo indisponivel");
        }

    }

}