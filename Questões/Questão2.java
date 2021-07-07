package Questões;

import java.util.Scanner;

import static java.lang.System.exit;

public class Questão2{
    public static void main(String args[]){

        Numero n = new Numero(2);
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite 1 para inicializar um número: ");
            System.out.println("Digite 2 para incrementar: ");
            System.out.println("Digite 3 para decrementar: ");
            System.out.println("Digite 4 para acessar o número: ");
            System.out.println("Digite 5 para sair: ");


            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    int i;
                    System.out.println("Digite um número inteiro: ");
                    i = sc.nextInt();
                    n = new Numero(i);
                    break;

                case 2:
                    n.incrementar();
                    System.out.println(n.numero);
                    break;

                case 3:
                    n.decrementar();
                    System.out.println(n.numero);
                    break;
                case 4:
                    System.out.println(n.acessar(n.numero));
                default:
                    exit(0);

            }

        }while(op < 5);
    }



}
