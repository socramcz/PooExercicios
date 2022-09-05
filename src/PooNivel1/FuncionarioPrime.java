package PooNivel1;

import java.util.Scanner;

public class FuncionarioPrime {

    private String nome1;
    private double salario1;

    public FuncionarioPrime(String nome, double salario) {
        this.nome1 = nome;
        this.salario1 = salario;
    }


    public String getNome() {
        return nome1;
    }

    public double getSalario() {
        return salario1;
    }

    public void novoSalario(double valor){
        this.salario1 += (valor / 100) * salario1;

    }

    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println("\nDigite seu primeiro nome:");
            String nome1 = input.next();

            System.out.println("Digite seu salario atual:");
            double salario1 = input.nextDouble();

            FuncionarioPrime test = new FuncionarioPrime(nome1, salario1);

            System.out.println("\nNome: " + test.getNome() + "\nSalario atual: " + test.getSalario());

            System.out.println("\nVoce teve aumento? Digite (1) para SIM ou Digite (2) para NAO:");
            int opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Digite em quantos porcentos seu salario aumentou:");
                double aumento1 = input.nextDouble();
                test.novoSalario(aumento1);
                System.out.println("\nSeu novo salario com aumento de " + aumento1 + "%" + " = R$" + test.getSalario());

            } else if (opcao == 2) {
                System.out.println("Sinto Muito!!");
            } else {
                System.out.println("Comando invalido");
            }
        }
    }

}
