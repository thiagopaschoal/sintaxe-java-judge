package condicionais;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
//A seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double hotDog = 4.0D;
        double xSalad = 4.5D;
        double xBacon = 5D;
        double torradaSimples = 2D;
        double refri = 1.5D;

        final Scanner sc = new Scanner(System.in);
        System.out.println("choose an menu item: ");
        int id = sc.nextInt();

        System.out.println("How many? ");
        int qty = sc.nextInt();

        switch (id) {
            case 1:
                hotDog *= qty;
                System.out.printf("Total: R$ %.2f", hotDog);
                break;
            case 2:
                xSalad *= qty;
                System.out.printf("Total: R$ %.2f", xSalad);
                break;
            case 3:
                xBacon *= qty;
                System.out.printf("Total: R$ %.2f", xBacon);
                break;
            case 4:
                torradaSimples *= qty;
                System.out.printf("Total: R$ %.2f", torradaSimples);
                break;
            case 5:
                refri *= qty;
                System.out.printf("Total: R$ %.2f", refri);
                break;
        }
    }
}
