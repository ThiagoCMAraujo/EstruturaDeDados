package URI;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int T, N;
        int j = 0;


        int fibo[] = new int[60];
         Scanner sc = new Scanner(System.in);
         T = sc.nextInt();
         while (j < T) {

         N = sc.nextInt();
         if (N >= 0 && N <= 60)
         for (int i = 0; i < fibo.length; i++) {
         if (i == 0) {
         fibo[i] = 0;
         } else if (i == 1) {
         fibo[i] = 1;
         } else {
         fibo[i] = fibo[i - 1] + fibo[i - 2];
         }
         if (N == i) {
         System.out.println("Fib(" + N + ") = " + fibo[i]);
         }


         }
         j++;
         }




    }

}
