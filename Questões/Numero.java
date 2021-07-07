package Questões;

public class Numero implements Interface {
    int numero;

    public Numero(int numero){
        this.numero = numero;
    }
    @Override
    public void inicializar(int numero){
        numero = this.numero;
    }

    public void incrementar(){
        numero++;

    }
    @Override
    public void decrementar(){
        numero--;
    }
    @Override
    public int acessar(int numero){
        return numero;
    }
}
