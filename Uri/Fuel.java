package URI;

import java.util.Locale;
import java.util.Scanner;

import java.util.Locale;

public class Fuel {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horas;
        int velocidadeMedia;
        horas = sc.nextInt();
        velocidadeMedia = sc.nextInt();

        float kms = horas * velocidadeMedia;

        float usedFuel = kms / 12;
        String output = String.format("%.3f", usedFuel);

        System.out.println(output);

    }
}
