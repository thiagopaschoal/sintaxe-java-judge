package sequencial;

//Faça um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("first number: ");
        int num1 = scanner.nextInt();

        System.out.println("second number: ");
        int num2 = scanner.nextInt();

        System.out.println(String.format("SOMA: %d", num1+num2));
    }
}
