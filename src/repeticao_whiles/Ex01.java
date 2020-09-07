package repeticao_whiles;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final int senhaCorreta = 2002;
        while(true) {
            Scanner sc = new Scanner(System.in);
            int aux = sc.nextInt();
            if (aux != senhaCorreta) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        }
    }
}
