package URI;

import java.util.Scanner;

public class ArrayDouble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Digite um número inteiro: ");
        int j = sc.nextInt();
        if(j < 50){
            for(int i = 0; i < 10; i++){

                if(i > 0){
                    j = j * 2;
                    array[i] = j;
                }else{
                    array[i] = j;
                }
            }
            for(int i = 0; i < 10; i++){
                System.out.println("N["+i+"] = " +array[i]);
            }
        }

    }
}
