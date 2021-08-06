package URI;

import java.util.Scanner;

public class BalancoParenteses {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String dados;
        int parentesesAbertos;
        boolean incorreto;
        int j;
        while (sc.hasNext()) {

            dados = sc.nextLine();
            parentesesAbertos = 0;
            incorreto = false;

            for (j = 0; j < dados.length(); j++) {
                char entrada = dados.charAt(j);
                if (entrada == ')') {
                    if (parentesesAbertos == 0) {
                        incorreto = true;
                        break;
                    }
                    parentesesAbertos--;
                } else if (entrada == '(') {
                    parentesesAbertos++;
                }else{
                    System.exit(0);
                }
            }
            if (incorreto || parentesesAbertos > 0) {
                System.out.println("incorrect");
            } else {
                System.out.println("correct");
            }
        }

    }

}
