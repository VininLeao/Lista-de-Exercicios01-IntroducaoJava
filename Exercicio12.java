public class Exercicio12 {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i += 3) {
            System.out.println("O valor da divisão de " + i + " por 2 usando int é: " + (i / 2));
            System.out.println("O valor da divisão de " + i + " por 2 usando double é: " + ((double) i / 2));
        }
    }
}