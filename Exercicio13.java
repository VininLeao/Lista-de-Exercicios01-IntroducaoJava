public class Exercicio13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((j + i == 7)) {
                    System.out.println("A soma 7 entre os dois dados foi alcançada ao rolar o dado 1 com valor de: "
                            + i + " e ao rolar o dado 2 com valor de: " + j);
                }
            }
        }
    }
}