
// Programa Sistema Escolar

// Importando Biblioteca
import java.util.Scanner;

public class sistema_escolar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("[ PROGRAMA DO SISTEMA ESCOLAR ]\n");

        System.out.println("[ DADOS PESSOAIS ]");
        System.out.print("Digite o seu nome: ");
        String valorNome = leitura.nextLine();

        System.out.print("Digite a sua idade: ");
        String valorIdade = leitura.nextLine();

        System.out.print("Digite o seu endereço: ");
        String valorEndereco = leitura.nextLine();

        System.out.println("\n[ DADOS DAS NOTAS ]");
        System.out.print("Digite o valor da Nota 1: ");
        int valorNota1 = leitura.nextInt();

        System.out.print("Digite o valor da Nota 2: ");
        int valorNota2 = leitura.nextInt();

        System.out.print("Digite o valor da Nota 3: ");
        int valorNota3 = leitura.nextInt();

        System.out.println("\n[ RESULTADO ]");
        System.out.println("Seu nome: " + valorNome);
        System.out.println("Sua idade: " + valorIdade);
        System.out.println("Seu endereço: " + valorEndereco);

        int valorMedia = (valorNota1 + valorNota2 + valorNota3) / 3;

        if (valorMedia >= 6) {
            System.out.println("Sua média: " + valorMedia);
            System.out.println("PARABÉNS VOCÊ FOI APROVADO!");
        } else {
            System.out.println("Sua média: " + valorMedia);
            System.out.println("LAMENTO VOCÊ FOI REPROVADO!");
        }

    }
}
