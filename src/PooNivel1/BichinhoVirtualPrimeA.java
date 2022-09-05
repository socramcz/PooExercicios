package PooNivel1;

import java.util.Scanner;

public class BichinhoVirtualPrimeA {
    private String nome;
    private double fome;
    private double saude;
    private double idade;

    public BichinhoVirtualPrimeA(String nome, double fome, double saude, double idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    public double getIdade() {
        return idade;
    }

    public double humorDoCorno(){
        return getFome() * getSaude();

    }

    public void alimentarCorno(double quantia){
        if ((quantia >= 0) && (quantia <= 100)){
            fome = fome - (fome * (quantia/100));
        }
    }

    public void brincar(int quantia){
        if ((quantia >= 0) && (quantia <= 100)) {
            saude += saude * (quantia / 100);
        }
    }

    @Override
    public String toString() {
        return "\nPooIniciante.BichinhoVirtual\n" +
                "\nNome=  '" + getNome() + '\'' +
                "\nFome=  " + getFome() +
                "\nSaude= " + getSaude() +
                "\nIdade= " + getIdade() +
                "\nHumor= " + humorDoCorno();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nQual o nome do seu bichinho?");
        String nome1 = input.next();

        System.out.println("\nQuantos anos ele tem?");
        int idade1 = input.nextInt();

        BichinhoVirtualPrimeA test = new BichinhoVirtualPrimeA(nome1, 5, 5, idade1);
        System.out.println(test.toString());

        System.out.println("\nQuanto de comida voce vai dar a ele?\n=> Digite em numeros");
        double comida1 = input.nextDouble();
        test.alimentarCorno(comida1);
        System.out.println(test.toString());
        System.out.println(test.humorDoCorno());

        System.out.println("\nPor quanto tempo voce quer brincar com ele?");
        int brincar1 = input.nextInt();
        test.brincar(brincar1);
        System.out.println(test.toString());
        System.out.println(test.humorDoCorno());
    }

}
