package sequencial;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // T-SHIRT 1
        System.out.println("input code t-shirt 1: ");
        int code1 = sc.nextInt();

        System.out.println("input quantity of t-shirt 1: ");
        int quantity1 = sc.nextInt();

        System.out.println("input value of t-shirt 1: ");
        double value1 = sc.nextDouble();

        // T-SHIRT 2
        System.out.println("input code t-shirt 2: ");
        int code2 = sc.nextInt();

        System.out.println("input quantity of t-shirt 2: ");
        int quantity2 = sc.nextInt();

        System.out.println("input value of t-shirt 2: ");
        double value2 = sc.nextDouble();

        double totalValueByQuantity1 = quantity1 * value1;
        double totalValueByQuantity2 = quantity2 * value2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalValueByQuantity1 + totalValueByQuantity2));

    }
}
