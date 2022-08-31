package CorrecaoProva;

import java.util.Scanner;

public class Tamagushi {
    private String nome;
    private int idade;
    private double fome, tedio;

    public Tamagushi(String nome, int idade, double fome, double tedio) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.tedio = tedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getTedio() {
        return tedio;
    }

    public void setTedio(double tedio) {
        this.tedio = tedio;
    }

    public void brincar (double minutos){
        tedio -= minutos;
        if(tedio < 0 ){
            tedio = 0;
            System.out.println("\nBrincou");
        }
    }

    public void alimentar (double quantidade){
        fome -= quantidade;
        if(fome < 0 ){
            fome = 0;
            System.out.println("\nAlimentou");
        }
    }

    public double getHumor(){
        return fome+tedio;
    }

    public static void main(String[] args) {
        Tamagushi t = new Tamagushi("zezo", 5, 100, 100);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite (1) para brincar\nDigite (2) para alimentar\nDigite (3) para ver o humor");
            int resposta = input.nextInt();

            Scanner input2 = new Scanner(System.in);

            if (resposta == 1) {
                System.out.println("Quantos minutos deseja brincar?");
                double minutos = input2.nextDouble();
                t.brincar(minutos);
                System.out.println(t.getTedio());

            } else if (resposta == 2) {
                System.out.println("Quanto de alimento deseja dar?");
                double quantidade = input2.nextDouble();
                t.brincar(quantidade);
                System.out.println(t.getFome());

            } else if (resposta == 3) {
                System.out.println(t.getHumor());

            } else {
                System.out.println("Opcão invalida");

            }
        }
    }
}
