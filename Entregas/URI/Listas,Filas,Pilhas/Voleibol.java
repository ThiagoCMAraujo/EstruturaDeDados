package URI;

import java.util.Locale;
import java.util.Scanner;

public class Voleibol {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int jogadores;
        jogadores = sc.nextInt();
        sc.nextLine();
        String nome;

        float pAtaques;
        float pBloqueios;
        float pSaques;

        int saquesTotais = 0;
        int bloqueiosTotais = 0;
        int ataquesTotais = 0;

        int saquesTotaisR = 0;
        int bloqueiosTotaisR = 0;
        int ataquesTotaisR = 0;

        int ataques[] = new int[10000];
        int bloqueios[] = new int[10000];
        int saques[] = new int[10000];
        int ataquesR[] = new int[10000];
        int bloqueiosR[] = new int[10000];
        int saquesR[] = new int[10000];

        for (int i = 0; i < jogadores; i++) {
            nome = sc.nextLine();

            String dados[] = sc.nextLine().split(" ");
            saques[i] = Integer.parseInt(dados[0]);
            bloqueios[i] = Integer.parseInt(dados[1]);
            ataques[i] = Integer.parseInt(dados[2]);

            String dadosR[] = sc.nextLine().split(" ");
            saquesR[i] = Integer.parseInt(dadosR[0]);
            bloqueiosR[i] = Integer.parseInt(dadosR[1]);
            ataquesR[i] = Integer.parseInt(dadosR[2]);

            if (ataquesR[i] > ataques[i] || saquesR[i] > saques[i] || bloqueiosR[i] > bloqueios[i]) {
                System.exit(0);
            }
            if (ataquesR[i] < 0 || saquesR[i] < 0 || bloqueiosR[i] < 0) {
                System.exit(0);
            }

        }
        for (int i = 0; i < jogadores; i++) {
            saquesTotais += saques[i];
            saquesTotaisR += saquesR[i];

            bloqueiosTotais += bloqueios[i];
            bloqueiosTotaisR += bloqueiosR[i];

            ataquesTotais += ataques[i];
            ataquesTotaisR += ataquesR[i];

        }
        pSaques = (saquesTotaisR*100f)/saquesTotais;
        pBloqueios = (bloqueiosTotaisR*100f) / bloqueiosTotais;
        pAtaques = (ataquesTotaisR*100f) / ataquesTotais;

        System.out.printf("Pontos de Saque: %.2f %%. \n" , pSaques);
        System.out.printf("Pontos de Bloqueio: %.2f %%. \n", pBloqueios);
        System.out.printf("Pontos de Ataque: %.2f %%. \n", pAtaques);



    }
}