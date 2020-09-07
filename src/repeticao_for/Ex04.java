package repeticao_for;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int value = sc.nextInt();

        for (int i = 0; i < value; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }


    }
}
