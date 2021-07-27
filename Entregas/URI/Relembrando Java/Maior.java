package URI;

import java.io.IOException;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int A,B,C,MaiorAB, MaiorABC;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        MaiorAB = (A + B + Math.abs(A-B))/2;
        MaiorABC = (MaiorAB + C + Math.abs(MaiorAB -C))/2;

        System.out.println(MaiorABC + " eh o maior");

    }

}
