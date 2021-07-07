package Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class questão1 {

    Scanner sc;
    private ManipulaPessoa mp;



    public questão1(){
        mp = new ManipulaPessoa();
    }


    public void menu() {
        int op;
        sc = new Scanner(System.in);

        do {


            System.out.println("\n\n\n#####################################");
            System.out.println("Digite 1 para adicionar uma pessoa: ");
            System.out.println("Digite 2 para consultar uma pessoa: ");
            System.out.println("Digite 3 para remover uma pessoa: ");
            System.out.println("Digite 4 para sair: ");

            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    cadastrarPessoa();
                    break;

                case 2:
                    consultarPessoa();
                    break;
                case 3:
                    excluirPessoa();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op < 4);
    }


    public void cadastrarPessoa() {
        String endereco, nome;
        int telefone;

        sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu endereço: ");
        endereco = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = sc.nextInt();

        Pessoa p1 = new Pessoa(nome, endereco, telefone);
        mp.add(p1);

    }

    public void consultarPessoa() {
        String nome;
        sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa a ser consultada: ");
        nome = sc.nextLine();
        mp.consulta(nome);
    }

    public void excluirPessoa() {
        String nomeRemover;
        System.out.println("Digite o nome da pessoa que deseja excluir: ");
        nomeRemover = sc.nextLine();
        mp.remove(nomeRemover);
    }

    public static void main(String args[]){
        questão1 q = new questão1();
        q.menu();
    }


}