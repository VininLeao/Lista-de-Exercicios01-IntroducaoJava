import java.util.Scanner;

public class Exercicio07 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a variável A");
            int a = scanner.nextInt();
            System.out.println("Digite a variável B");
            int b = scanner.nextInt();

            int asubst = a;

            a = b;
            b = asubst;

            System.out.println("A variável A foi trocada com a variável B");
            System.out.println("Variável A agora é: " + a + " e a variável B agora é: " + b);
        }
    }


