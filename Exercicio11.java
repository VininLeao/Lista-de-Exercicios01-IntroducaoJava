import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        String produto = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int cod = scanner.nextInt();

        if (cod == 1) {
            produto = "Parafuso";
        } else if (cod == 2) {
            produto = "Porca";
        } else if (cod == 3) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }
        System.out.println("O produto de código " + cod + " é " + produto);
    }
}
