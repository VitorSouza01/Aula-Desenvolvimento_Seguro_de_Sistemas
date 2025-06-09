
// Programa Sistema Bancário

// Importando Bibliotecas
import java.util.Scanner;

public class sistema_bancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do Depósito: ");
        int valorDeposito = leitura.nextInt();

        System.out.println("\nSaldo total da conta: " + valorDeposito);

        System.out.println("\nDigite o valor do Saque:");
        int valorSaque = leitura.nextInt();

        System.out.println("\nSaldo total da conta: " + (valorDeposito - valorSaque) );
    }
}
