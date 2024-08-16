import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e direi se ele é par ou impar");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é impar");
        }
    }
}