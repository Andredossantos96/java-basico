package loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("informe uma nota: ");
        nota = scan.nextInt();

        while(nota > 10 || nota < 0){
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
