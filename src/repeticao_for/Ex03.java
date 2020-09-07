package repeticao_for;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int value = sc.nextInt();

        System.out.println(value);
        for (int i = 0; i <= value; i++) {

            System.out.println("input a number A: ");
            double num1 = sc.nextDouble();

            System.out.println("input a number B: ");
            double num2 = sc.nextDouble();

            System.out.println("input a number C: ");
            double num3 = sc.nextDouble();

            double result = (num1 * 2 + num2 * 3 + num3 * 5) / 10;

            System.out.println(String.format("%.1f", result));
        }
    }
}
