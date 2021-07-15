import java.util.List;
import java.util.Scanner;

class ListasDuplas {
    No inicio;
    No fim;
    int tamanho;


    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;

        if (inicio != null) {
            inicio.anterior = no;

        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;

    }

    public void inserirFinal(String info) {
        No no = new No();
        no.info = info;
        no.proximo = null;
        no.anterior = fim;

        if (fim != null) {
            fim.proximo = no;
        }
        fim = no;
        if (tamanho == 0) {
            inicio = fim;
        }
        tamanho++;
    }

    public String retirarInicio() {
        if (inicio == null) {
            return null;
        }
        String out = inicio.info;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        }else{
            fim = null;
        }
        tamanho--;
        return out;
    }



    public String retirarFim() {
        if (fim == null) {
            return null;
        }
        String out = fim.info;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        tamanho--;
        return out;
    }

    public void inserirIndice(int indice, String info) {
        if (indice <= 0) {
            inserirInicio(info);
        } else if (indice >= tamanho) {
            inserirFinal(info);
        } else {
            No local = inicio;
            for (int i = 0; i < indice; i++) {
                local = local.proximo;
            }
            No no = new No();
            no.info = info;
            no.anterior = local;
            no.proximo = local.proximo;
            local.proximo = no;
            no.proximo.anterior = no;
            tamanho++;
        }

    }

    public String retirarIndice(int indice) {
        if (indice < 0 || indice > tamanho || inicio == null) {
            return null;
        } else if (indice == 0) {
            return retirarInicio();
        } else if (indice == tamanho - 1) {
            return retirarFim();
        }
        No local = inicio;
        for (int i = 0; i < indice; i++) {
            local = local.proximo;
        }
        if (local.anterior != null) {
            local.anterior.proximo = local.proximo;
        }
        if (local.proximo != null) {
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
        return local.info;
    }

    public String toString() {
        String str = "(" + tamanho + ")";
        No local = inicio;

        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }

    public static void main(String args[]) {
        ListasDuplas l = new ListasDuplas();
        int posicoes;
        int i = 1;
        int j = 1;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o que deseja fazer: ");

        do{

            System.out.println("1.Inserir elemento no início. ");
            System.out.println("2.Retirar elemento do início.");
            System.out.println("3.Inserir elemento no fim. ");
            System.out.println("4.Retirar elemento do fim.");
            System.out.println("0.Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o número de posições que deseja adicionar: ");
                    posicoes = sc.nextInt();
                    sc.nextLine();
                    String info;

                    while(i <= posicoes){
                        System.out.println("Digite a informação que deseja adicionar");
                        info = sc.nextLine();
                        l.inserirInicio(info);
                        System.out.println(l);
                        i++;

                    }
                    break;
                case 2:
                    l.retirarInicio();
                    System.out.println(l);
                    break;
                case 3:

                    System.out.println("Digite o número de posições que deseja adicionar: ");
                    posicoes = sc.nextInt();
                    sc.nextLine();

                    while( j <= posicoes){
                        System.out.println("Digite a informação que deseja adicionar");
                        info = sc.nextLine();
                        l.inserirFinal(info);
                        System.out.println(l);
                        j++;
                    }
                    break;
                case 4:
                    l.retirarFim();
                    System.out.println(l);
                    break;

                default:
                    System.exit(0);
            }
        }while(op != 0);


        /**System.out.println(l);
        for (int i = 0; i < 6; i++) {
            l.inserirInicio("" + (char) (i + 97));
            System.out.println(l);
        }
        l.inserirIndice(1, "x");
        System.out.println(l);

        l.retirarIndice(4);
        System.out.println(l.retirarIndice(4));

        while(l.retirarInicio()!= null){
            System.out.println(l);
        }**/


    }
}
