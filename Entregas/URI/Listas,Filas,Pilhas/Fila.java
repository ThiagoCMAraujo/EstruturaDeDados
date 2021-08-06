package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Fila {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String pessoas;
        int count, numPessoas,saiu,sF = 0;
        String impacientes;

        numPessoas = sc.nextInt();
        sc.nextLine();

        String people[];
        ArrayList<Integer> fila = new ArrayList<>();
        ArrayList<Integer> pessoasSairamFila = new ArrayList<>();

        pessoas = sc.nextLine();
        people = pessoas.split(" ");
        for(count = 0; count<numPessoas; count++){
            fila.add(Integer.parseInt(people[count]));
        }

        saiu = sc.nextInt();
        sc.nextLine();
        String pessoasSairamString[];

        impacientes = sc.nextLine();
        pessoasSairamString = impacientes.split(" ");
        for(count = 0; count<saiu; count++){
            pessoasSairamFila.add(Integer.parseInt(pessoasSairamString[count]));
        }

        for(Integer f : pessoasSairamFila){
            fila.remove(f);
        }

        for(count = 0; count <fila.size(); count++){
            System.out.print(fila.get(count));
            int j = count;
            j++;
            if(j == fila.size()){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }
    }
}
