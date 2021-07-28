package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AmigosDoHabai {
    public static void main(String args[]) {
        ArrayList<String> amigosHabai = new ArrayList<>();
        ArrayList<String> nAmigos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nome, nome2;
        String resp;
        int maiorNome = 0;
        String nomeAmigoHabai = null;
        int i;

        do {
            i = 0;
            nome = sc.nextLine();


            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            String dados[] = nome.split(" ");
            nome2 = dados[0];
            resp = dados[1];

            if (resp.equalsIgnoreCase("YES")) {
                for(String amigos:amigosHabai){
                    if(nome2.equalsIgnoreCase(amigos)){
                        i++;
                    }
                }
                if(i == 0){
                    amigosHabai.add(nome2);
                }

            } else if (resp.equalsIgnoreCase("NO")) {
                for(String naoAmigos:nAmigos){
                    if(nome2.equalsIgnoreCase(naoAmigos)){
                        i++;
                    }
                }
                if(i == 0){
                    nAmigos.add(nome2);

                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        for (String amigos : amigosHabai) {
            if (amigos.length() > maiorNome) {
                maiorNome = amigos.length();
                nomeAmigoHabai = amigos;
            }
        }

        Collections.sort(amigosHabai);
        Collections.sort(nAmigos);

        for (String amigo : amigosHabai) {
            System.out.println(amigo);
        }
        for (String nAmigo : nAmigos) {
            System.out.println(nAmigo);
        }
        System.out.print("\n");
        System.out.println("Amigo do Habay:\n" + nomeAmigoHabai);


    }
}
