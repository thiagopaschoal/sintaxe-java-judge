package condicionais;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input number: ");
        int number = sc.nextInt();

        System.out.println(number < 0 ? "NEGATIVO" : "NAO NEGATIVO");
    }
}
