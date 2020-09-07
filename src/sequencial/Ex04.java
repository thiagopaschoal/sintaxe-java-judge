package sequencial;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
//o valor que recebe por hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input employee number: ");
        int numberEmployee = scanner.nextInt();

        System.out.println("input worked hours: ");
        int workedHours = scanner.nextInt();

        System.out.println("input value received per hour: ");
        double valueReceivedPerHour = scanner.nextDouble();

        System.out.println(String.format("NUMBER: %d", numberEmployee));
        System.out.println(String.format("SALARY = U$ %.2f", (workedHours * valueReceivedPerHour)));
    }
}
