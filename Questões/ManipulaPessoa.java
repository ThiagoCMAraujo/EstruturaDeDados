package Questões;

import java.util.ArrayList;

public class ManipulaPessoa {
    ArrayList<Pessoa> persons = new ArrayList<>();

    void add(Pessoa p){
        persons.add(p);
    }
    void remove(String name){
        Pessoa p2 = null;
        for(Pessoa p: persons){
            if(name.equals(p.nome)){
                p2 = p;
            }
        }
        persons.remove(p2);
    }
    void consulta(String name){
        for(Pessoa p: persons){
            if(name.equals(p.nome)){
                System.out.println("Nome = " + p.nome);
            }
        }
    }
}
