package URI;

import java.util.Scanner;

public class Interval {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float op;
        op = sc.nextFloat();

        if(op >= 0 && op <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(op > 25 && op <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(op > 50 && op <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(op > 75 && op <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
        System.out.println("Fora de intevalo");
        }
    }
}
