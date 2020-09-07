package repeticao_for;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("input number: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            final int valor = sc.nextInt();
            if (valor >= 10 && valor <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(String.format("%d in", in));
        System.out.println(String.format("%d out", out));
    }
}
