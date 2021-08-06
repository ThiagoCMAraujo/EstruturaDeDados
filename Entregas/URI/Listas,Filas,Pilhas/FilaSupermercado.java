package URI;

import java.util.Scanner;

public class FilaSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;
        int numFuncionarios = sc.nextInt();
        int[] funcionarios = new int[numFuncionarios];
        int numClientes = sc.nextInt();
        int[] clientes = new int[numClientes];

        for (contador= 0; contador < numFuncionarios; contador++)
            funcionarios[contador] = sc.nextInt();

        for (int i = 0; i < numClientes; i++)
            clientes[i] = sc.nextInt();

        int[] tempo = new int[numFuncionarios];
        int count = 0;

        while (count < numClientes) {
            if (count < numFuncionarios) {
                tempo[count] = clientes[count] * funcionarios[count];
                count++;
            } else {
                int indice = tempo[0];
                int count2 = 0;
                for (contador = 0; contador < numFuncionarios; contador++)
                    if (indice > tempo[contador]) {
                        indice = tempo[contador];
                        count2 = contador;
                    }
                tempo[count2] += clientes[count] * funcionarios[count2];

                count2 = 0;
                count++;
            }


        }
        int tempoTotal = tempo[0];

        for (contador = 0; contador < numFuncionarios; contador++)
            if (tempoTotal < tempo[contador])
                tempoTotal = tempo[contador];
        System.out.println(tempoTotal);
    }
}
