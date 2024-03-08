package prog1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        List<Integer> numerosLista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, para encerrar digite -1");

        int numerosInt;

        while (true) {
            System.out.println("Digite números inteiros: ");
            numerosInt = scanner.nextInt();

            if (numerosInt == -1) {
                break;
            }
            numerosLista.add(numerosInt);
        }

        int soma = 0;
        for (int numero : numerosLista) {
            soma += numero;
        }

        System.out.println("Os números digitados são: " + numerosLista);
        System.out.println("A soma deles é: " + soma);
        
        scanner.close();
    }
}