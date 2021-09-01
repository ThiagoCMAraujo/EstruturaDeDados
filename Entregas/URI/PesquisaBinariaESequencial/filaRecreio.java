package URI;

import java.util.Scanner;

public class filaRecreio {
    static int []arrayreverse (int a[], int n)

    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }



        return b;
    }

    static int compararPosicoes(int array1[], int array2[]) {
        int i = 0;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] != array2[j]) {
                i++;
            }
        }

        return array1.length - i;
    }

    private static void mergeSort(int tamanho, int[] vetor) {

        int elementos = 1;

        int inicio, meio, fim;

        while (elementos < tamanho) {
            inicio = 0;


            while (inicio + elementos < tamanho) {

                meio = inicio + elementos;

                fim = inicio + 2 * elementos;


                if (fim > tamanho)
                    fim = tamanho;


                intercala(vetor, inicio, meio, fim);

                inicio = fim;
            }

            elementos = elementos * 2;
        }

    }

    private static void intercala(int[] vetor, int inicio, int meio, int fim) {

        int novoVetor[] = new int[fim - inicio];

        int i = inicio;

        int m = meio;

        int pos = 0;


        while (i < meio && m < fim) {

            if (vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;

            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }


        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        int i = 1;
        while (i <= casos) {
            int numAlunos = sc.nextInt();
            sc.nextLine();
            int array1[] = new int[numAlunos];
            int arrayOrdenada[] = new int[numAlunos];
            for (int l = 0; l < array1.length; l++) {
                array1[l] = sc.nextInt();
            }
            for (int k = 0; k < array1.length; k++) {
                arrayOrdenada[k] = array1[k];
            }
            mergeSort(numAlunos, arrayOrdenada);
            arrayreverse(arrayOrdenada, numAlunos);

            System.out.println(compararPosicoes(arrayreverse(arrayOrdenada, numAlunos), array1));

            i++;
        }
    }
}
