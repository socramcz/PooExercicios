package CorrecaoProva;

import java.util.Arrays;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda(){
        pessoas = new Pessoa[10];
    }

    public void armazenaPessoa(String nome, int idade, float altura){
        Pessoa fulano = new Pessoa(nome, idade, altura);

        boolean cheio = true;
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                pessoas[i] = fulano;
                cheio = false;
                System.out.println("CorrecaoProva.Pessoa adicionada ("+nome+")");
                break;
            }
        }
        if (cheio){
            System.out.println("\nCorrecaoProva.Agenda cheia");
        }
    }

    public void removePessoa(String nome){
        boolean achei = false;
        for(int i=0; i < pessoas.length; i++){
            if(pessoas[i].getNome().equals(nome)){
                pessoas[i] = null;
                achei = true;
                System.out.println("\nCorrecaoProva.Pessoa removida ("+nome+")");
            }
        }
        if(!achei){
            System.out.println("\nCorrecaoProva.Pessoa nao encontrada");
        }
    }

    public int buscaPessoa(String nome){
        for(int i=0; i < pessoas.length; i++){
            if(pessoas[i].getNome().equals(nome)){
                System.out.println("CorrecaoProva.Pessoa encontrada ("+nome+")");
                return i;
            }
        }
        return 11;
    }

    public void imprimeAgenda(){
        System.out.println(Arrays.toString(pessoas));
    }

    public void imprimePessoa(int index){
        boolean achei = false;
        for(int i = 0; i < pessoas.length; i++){
            if(i == index){
                System.out.println(pessoas[i].toString());
                achei = true;
            }
        }
        if(!achei){
            System.out.println("\nCorrecaoProva.Pessoa nao encontrada");
        }
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.armazenaPessoa("gabi", 26, (float) 1.90);
        a.armazenaPessoa("pedro", 26, (float) 1.90);
        a.armazenaPessoa("test", 26, (float) 1.90);
        a.armazenaPessoa("dfsd", 26, (float) 1.90);
        a.armazenaPessoa("dsfsd", 26, (float) 1.90);
        a.armazenaPessoa("zxcxc", 26, (float) 1.90);
        a.armazenaPessoa("jkhj", 26, (float) 1.90);
        a.armazenaPessoa("nbmbn", 26, (float) 1.90);
        a.armazenaPessoa("yuiyu", 26, (float) 1.90);
        a.armazenaPessoa("ipiup", 26, (float) 1.90);

        a.armazenaPessoa("Neymar", 26, (float) 1.90);

        System.out.println(a.buscaPessoa("pedro"));

        a.removePessoa("dsfsd");

        a.imprimeAgenda();

        a.imprimePessoa(3);

        a.imprimeAgenda();


    }
}
