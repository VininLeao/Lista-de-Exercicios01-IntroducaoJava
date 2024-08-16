import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double cont = 0;
        double soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 50 números:");

        while (cont < 50) {
            double n = scanner.nextDouble();
            soma += n;
            cont++;
        }

        double media = soma / cont;
        System.out.println("A soma foi de: " + soma);
        System.out.println("A média aritmética dos 50 números é: " + media);
    }

}
