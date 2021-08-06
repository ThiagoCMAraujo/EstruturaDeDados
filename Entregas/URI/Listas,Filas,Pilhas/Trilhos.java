package URI;
import java.util.Stack;

import java.util.Scanner;


public class Trilhos {
    public static void main(String args[]) {
        int numeroVagoesParse;
        int vagao,n;
        int count = 0;
        int forCount;
        String vagoes;
        String numeroVagoesString;
        Scanner sc = new Scanner(System.in);
        do{
            numeroVagoesString = sc.nextLine();

            numeroVagoesParse = Integer.parseInt(numeroVagoesString);

            if(numeroVagoesString.equals("0")){

                break;
            }

            if(count == 0){
                count++;

            }else{
                System.out.println();
            }

            do{
                vagoes = sc.nextLine();

                String v[];
                Stack<Integer> pilhaVagoes = new Stack<>();

                if(vagoes.equals("0")){
                    break;
                }

                v = vagoes.split(" ");

                n = 0;
                vagao = Integer.parseInt(v[n]);

                for (forCount = 1; forCount <= numeroVagoesParse; forCount++) {
                    pilhaVagoes.push(forCount);


                    while(!pilhaVagoes.empty() && pilhaVagoes.lastElement() == vagao){
                        n++;
                        if(n < numeroVagoesParse){
                            vagao =Integer.parseInt(v[n]);

                        }
                        pilhaVagoes.pop();
                    }

                }

                if(pilhaVagoes.empty()){
                    System.out.println("Yes");


                }else if(!pilhaVagoes.empty()){
                    System.out.println("No");

                }

            } while (!vagoes.equals("0"));

        }while(!numeroVagoesString.equals("0"));

        System.out.println();
    }

}
