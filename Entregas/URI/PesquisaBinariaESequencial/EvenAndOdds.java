package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenAndOdds {
    static boolean verificar(ArrayList<Integer> nums, ArrayList<Integer> pares, ArrayList<Integer> impares) {
        for (Integer i : nums) {
            if (i % 2 == 0) {
                pares.add(i);
            } else
                impares.add(i);
        }
        return true;
    }

    static ArrayList<Integer> sortPares(ArrayList<Integer> pares) {
        Collections.sort(pares);
        return pares;
    }

    static ArrayList<Integer> sortImpares(ArrayList<Integer> impares) {
        Collections.sort(impares, Collections.reverseOrder());

        return impares;

    }

    static void print(ArrayList<Integer> list){
        for(Integer l:list){
            System.out.println(l);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        int quantidade, count;
        quantidade = sc.nextInt();

        for (count = 0; count < quantidade; count++) {
            nums.add(sc.nextInt());
        }
        verificar(nums, pares, impares);

        sortPares(pares);
        sortImpares(impares);

        print(pares);

        print(impares);

    }
}
