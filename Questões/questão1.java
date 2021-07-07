package Questões;

import java.util.ArrayList;
import java.util.Scanner;

public class questão1 {

    public static void main(String args[]) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);
        int op;

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
                    String endereco, nome;
                    int telefone;

                    System.out.println("Digite seu nome: ");
                    nome = sc.nextLine();
                    System.out.println("Digite seu endereço: ");
                    endereco = sc.nextLine();

                    System.out.println("Digite seu telefone: ");
                    telefone = sc.nextInt();

                    Pessoa p1 = new Pessoa(nome, endereco, telefone);
                    pessoas.add(p1);
                    break;

                case 2:
                    String nomePessoa;

                    System.out.println("Digite o nome da pessoa a ser consultada: ");
                    nomePessoa = sc.nextLine();
                    for (Pessoa p : pessoas) {
                        if (nomePessoa.equals(p.nome)) {
                            System.out.println(
                                    "Nome = " + p.nome + ". Endereço = " + p.endereco + ". Telefone = " + p.telefone);
                        } else {
                            System.out.println("F");
                        }
                    }
                    break;
                case 3:
                    String nomeRemover;
                    System.out.println("Digite o nome da pessoa que deseja excluir: ");
                    nomeRemover = sc.nextLine();
                    Pessoa p2 = null;
                    for (Pessoa p : pessoas) {
                        if (nomeRemover.equals(p.nome)) {
                            p2 = p;
                        }
                    }
                    pessoas.remove(p2);

            }

        } while (op < 4);
    }

}
