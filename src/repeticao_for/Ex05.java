package repeticao_for;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int value = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= value; i++) {
            fatorial *= i;
        }

        System.out.println(String.format("%d! = %d", value, fatorial));
    }
}
