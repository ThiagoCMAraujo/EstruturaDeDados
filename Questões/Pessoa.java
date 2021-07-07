package Questões;

public class Pessoa {
    String endereco, nome;
    int telefone;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
