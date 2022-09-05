package PooNivel1;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int anos){
        this.idade += anos;
        if(this.idade <= 21){
            crescer(0.5f);
        }
    }

    public void engordar(double novoPeso){
        this.peso += novoPeso;
    }

    public void emagrecer(double novoPeso){
        this.peso -= novoPeso;
    }

    public void crescer(double novaAltura){
        this.altura = novaAltura;
    }

    public String toString(){
        return "PooIniciante.Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
    }

    public static void main(String[] args) {
        Pessoa a = new Pessoa("marcos", 19, 83, 177);
        System.out.println(a.toString());
        a.engordar(5);
        System.out.println(a.toString());
        a.emagrecer(10);
        System.out.println(a.toString());
        a.crescer(3);
        System.out.println(a.toString());
        a.envelhecer(1);
        System.out.println(a.toString());
    }
}
