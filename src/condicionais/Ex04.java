package condicionais;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo
//sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("input time A: ");
        int initialHour = sc.nextInt();

        System.out.println("input time b");
        int finalHour = sc.nextInt();

        int diff = 0;
        if (initialHour < finalHour) {
            diff = finalHour - initialHour;
        } else {
            diff = 24 - initialHour + finalHour;
        }

        System.out.println("O JOGO DUROU " + diff + " HORAS");

    }
}
