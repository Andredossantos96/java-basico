package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        int media;
        int count = 0;


        do {
            System.out.println("Digite 5 números: ");
            numero = scan.nextInt();

            soma +=  numero;
            media = soma / 5;


            if (numero > maior) maior = numero;
            count++;
        } while (count < 5);
        System.out.println("Maior numero é: " + maior);
        System.out.println("Média dos números é: " + media);

    }
}

        // // while(count < 5){
        // //     System.out.println("Digite 5 números: ");
        // //     numero = scan.nextInt();1
        // //     count++;
        // }

