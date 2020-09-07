package repeticao_for;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
