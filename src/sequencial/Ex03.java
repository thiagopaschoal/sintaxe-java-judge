package sequencial;

//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
//DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("input value A: ");
        int A = scanner.nextInt();

        System.out.println("input value B: ");
        int B = scanner.nextInt();

        System.out.println("input value C: ");
        int C = scanner.nextInt();

        System.out.println("input value D: ");
        int D = scanner.nextInt();

        int diff = ((A * B) - (C * D));

        System.out.println(String.format("DIFERENCA = %d", diff));
    }
}
