package sequencial;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("input value A: ");
        double A = sc.nextDouble();

        System.out.println("input value B: ");
        double B = sc.nextDouble();

        System.out.println("input value C: ");
        double C = sc.nextDouble();

        System.out.println("Triângulo: " + (A * C)/2);
        System.out.println("Circulo: " + (PI * Math.pow(C, 2)));
        System.out.println("Trapezio: " + (C * (A + B)/2));
        System.out.println("Quadrado: " + (Math.pow(B,2)));
        System.out.println("Retangulo: " + (A * B));
    }
}
