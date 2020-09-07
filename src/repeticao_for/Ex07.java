package repeticao_for;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int value = sc.nextInt();

        for (int i = 1; i <= value; i++) {

            int elevadoAoQuadrado = (int) Math.pow(i, 2);
            int elevadoAoCubo = (int) Math.pow(i, 3);

            System.out.print(String.format("%d %d %d", i, elevadoAoQuadrado, elevadoAoCubo));
            System.out.println();
        }
    }
}
