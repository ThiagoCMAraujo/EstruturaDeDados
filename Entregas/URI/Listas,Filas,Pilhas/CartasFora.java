package URI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CartasFora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String numCartas, cartasRemovidas;
        int n, base, num;

        while (!(numCartas = sc.nextLine()).equals("0")) {
            n = Integer.parseInt(numCartas);
            if (n == 1) {
                System.out.println("Discarded cards:");
                System.out.println(1);
            } else {
                base = 1;
                ArrayList<Integer> cartas = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    cartas.add(i);
                }
                base = 2;
                boolean f = true;
                cartasRemovidas = "";
                while (cartas.size() > 1) {
                    for (Iterator<Integer> i = cartas.iterator(); i.hasNext();) {
                        num = i.next();
                        if (base == 2) {
                            base = 0;
                            cartasRemovidas += num + ", ";
                            i.remove();
                        }
                        base++;
                    }
                }
                System.out.println("Discarded cards: " + cartasRemovidas.substring(0, cartasRemovidas.length() - 2));
                System.out.println("Remaining card: " + cartas.get(0));
            }
        }
    }

}
