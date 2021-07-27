package URI;

import java.io.IOException;

import java.util.Scanner;

public class menorValor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int indice = sc.nextInt();
        int posicao = 0, min = 0;
        int[] a = new int[indice];
        sc.nextLine();

        String[] dados = sc.nextLine().split(" ");

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(dados[i]);

            if (i == 0) {
                min = a[i];
                posicao = i;
            } else if (a[i] < min) {
                min = a[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + posicao);

    }
}
