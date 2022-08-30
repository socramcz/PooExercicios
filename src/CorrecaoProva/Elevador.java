package CorrecaoProva;

public class Elevador {
    private int andarAtual, totalAndares, capacidade, qtd;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.qtd = 0;
    }

    public void entrar(){
        if(qtd < capacidade){
            qtd += 1;
        }
        else {
            System.out.println("\nCorrecaoProva.Elevador cheio");
        }
    }

    public void sair(){
        if(qtd > 0){
            qtd -= 1;
        }
        else {
            System.out.println("\nCorrecaoProva.Elevador vazio");
        }
    }

    public void subir(){
        if(andarAtual < totalAndares){
            andarAtual += 1;
        }
        else {
            System.out.println("\nJa esta no ultimo andar");
        }
    }

    public void descer(){
        if(andarAtual > 0){
            andarAtual -= 1;
        }
        else {
            System.out.println("\nJa esta no terreo");
        }
    }

    public static void main(String[] args) {
        Elevador lacerda = new Elevador(10, 15);

        // -----------------------------------//
        for (int i = 0; i < 15; i++){
            lacerda.entrar();
        }
        lacerda.entrar();
        // -----------------------------------//
        for (int i = 0; i < 15; i++){
            lacerda.sair();
        }
        lacerda.sair();
        // -----------------------------------//
        for (int i = 0; i < 10; i++){
            lacerda.subir();
        }
        lacerda.subir();
        // -----------------------------------//
        for (int i = 0; i < 10; i++){
            lacerda.descer();
        }
        lacerda.descer();
    }
}
