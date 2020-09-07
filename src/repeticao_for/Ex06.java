package repeticao_for;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int value = sc.nextInt();

        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                System.out.println(i);
            }
        }
    }
}
