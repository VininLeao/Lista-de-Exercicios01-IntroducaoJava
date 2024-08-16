import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double cont = 0;
        double soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 50 números:");

        do {
            double n = scanner.nextDouble();
            soma += n;
            cont++;
        } while (cont < 50);

        double media = (soma / cont);

        System.out.println("A soma entre os 50 números é: " +soma);
        System.out.println("A média aritmética entre os 50 números é: " +media);

    }
}
