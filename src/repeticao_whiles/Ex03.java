package repeticao_whiles;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            if (id == 4) break;
            if (id == 1) {
                qtdAlcool++;
            } else if(id == 2) {
                qtdGasolina++;
            } else if (id == 3) {
                qtdDiesel++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGasolina);
        System.out.println("Diesel: " + qtdDiesel);
    }
}
