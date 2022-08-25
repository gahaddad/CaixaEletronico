public class Terminal {
    public static void main(String[] args) {
        caixaEletronico caixaeletronico = new caixaEletronico();
//Classe(1° Maiuscula) /Variavel(1°Min.2°Maiusc)/Metatodo = variavel

        
        caixaeletronico.Sacar();

        System.out.println("Titular da conta: " + caixaeletronico.nome);
        System.out.println("" + caixaeletronico.banco);
        System.out.println("Numero da agencia do " + caixaeletronico.nome + " é " + caixaeletronico.agencia);
        System.out.println("Saldo de " + caixaeletronico.nome + " é de: " + caixaeletronico.saldo);

    }

}
