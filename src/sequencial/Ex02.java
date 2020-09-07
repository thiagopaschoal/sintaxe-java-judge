package sequencial;

//Faça um programa para ler o valor do raio de um círculo,
//e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        final Scanner scanner = new Scanner(System.in);
        System.out.println("input radius: ");
        int radius = scanner.nextInt();

        double area = PI * Math.pow(radius, 2);

        System.out.println(String.format("A: %.4f", area));
    }
}
