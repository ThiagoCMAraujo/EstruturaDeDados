package URI;

import java.util.Scanner;

public class NotasProva {
    static String verificaNota(int nota){
        String notaS;
        if(nota == 0){
            notaS = "E";
        }else if(nota > 0 && nota < 36){
            notaS = "D";
        }else if(nota > 36 && nota < 61){
            notaS = "C";
        }else if(nota > 60 && nota < 86){
            notaS = "B";

        }else{
            notaS = "A";
        }
        return notaS;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        System.out.println(verificaNota(nota));


    }
}
