package PooNivel1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BichinhoVirtualPrimeB {
    private String nome;
    private float fome;
    private float saude;
    private float idade;
    public BichinhoVirtualPrimeB(String nome, float fome, float saude, float idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getFome() {
        return fome;
    }
    public void setFome(float fome) {
        this.fome = fome;
    }
    public float getSaude() {
        return saude;
    }
    public void setSaude(float saude) {
        this.saude = saude;
    }
    public float getIdade() {
        return idade;
    }
    public void setIdade(float idade) {
        this.idade = idade;
    }
    public float humor() {
        return getFome() * getSaude();
    }
    public void alimenta(float quantidade) {
        if ((quantidade >= 0) && (quantidade <= 100)) {
            this.fome = this.fome - (this.fome * (quantidade/100.0f));
        }
    }
    public void brincar(int quantidade) {
        if ((quantidade >= 0) && (quantidade <= 100)) {
            this.saude += this.saude * (quantidade/100.0f);
        }
    }
    public String str() {
        return "Bichinho [nome=" + nome + ", fome=" + fome + ", saude=" + saude + ", idade=" + idade + "]";
    }
    public static void main(String[] args)
    {
        Random aleatorio = new Random();
        BichinhoVirtualPrimeB a = new BichinhoVirtualPrimeB("Cachorro", aleatorio.nextInt(10), aleatorio.nextInt(10), 5);
        BichinhoVirtualPrimeB b = new BichinhoVirtualPrimeB("Gato", aleatorio.nextInt(10), aleatorio.nextInt(10), 5);
        BichinhoVirtualPrimeB c = new BichinhoVirtualPrimeB("Coelho", aleatorio.nextInt(10), aleatorio.nextInt(10), 5);
        ArrayList<BichinhoVirtualPrimeB> Fazenda = new ArrayList();
        Fazenda.add(a);
        Fazenda.add(b);
        Fazenda.add(c);
        Scanner teclado = new Scanner(System.in);
        int op;
        int alimento, brinquedo;
        while(true)
        {
            System.out.println(":::: FAZENDA ::::");
            System.out.println("1. Alimentar todos os bichos");
            System.out.println("2. Brincar com todos os bichos");
            System.out.println("3. Ouvir todos os bichos");
            System.out.println("4. Sair");
            op = teclado.nextInt();
            if (op == 1)
            {
                System.out.println("Alimentar todos com: ");
                alimento = teclado.nextInt();
                for(int i = 0; i<=2; i++)
                    Fazenda.get(i).alimenta(alimento);
            }else if(op ==2)
            {
                System.out.println("Brincar com todos com: ");
                brinquedo = teclado.nextInt();
                for(int i = 0; i<=2; i++)
                    Fazenda.get(i).brincar(brinquedo);
            }else if(op == 3)
            {
                for(int i = 0; i<=2; i++)
                {
                    System.out.println(Fazenda.get(i).str());
                    System.out.println(Fazenda.get(i).getNome() + ": " + Fazenda.get(i).humor());
                }
            }else if (op == 4)
                break;
        }
    }
}

