package repeticao_whiles;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("input a number A: ");
            double x = scanner.nextDouble();

            System.out.println("input a number B: ");
            double y = scanner.nextDouble();

            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else {
                System.out.println("Fora do intervalo");
            }
        }
    }
}
