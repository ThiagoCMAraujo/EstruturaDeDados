package URI;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        float a, b, c, d;
        float media;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();

        media = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;
        String output = String.format("%.1f", media);
        System.out.println("Media: " + output);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float exam;
            exam = sc.nextFloat();
            System.out.println("Nota do exame: " + exam);
            float mediaFinal = (media + exam) / 2;
            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
                String output2 = String.format("%.1f", mediaFinal);
                System.out.println("Media final: " + output2);
            } else {
                System.out.println("Aluno reprovado.");
                String output2 = String.format("%.1f", mediaFinal);
                System.out.println("Media final: " + output2);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }

    }
}
