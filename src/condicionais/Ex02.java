package condicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input number");
        int number = sc.nextInt();

        System.out.println(number % 2 == 0 ? "PAR" : "IMPAR");
    }
}
