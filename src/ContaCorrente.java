import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {
    private String nome;
    private int conta;
    private double saldo;

    public ContaCorrente(int conta, String nome, double saldo){
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("\nDeposito de R$ "+valor+" realizado com sucesso\n=> Saldo atual: R$ "+saldo);
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("\nSaque de R$ "+valor+" realizado com sucesso\n=> Saldo atual: R$ "+saldo);
        }
        else{
            System.out.println(">>> Sua conta nao tem saldo suficiente para este saque <<<");
        }
    }

    // TESTE DA CLASSE //
    public static void main(String[] args) {
        // Crie um programa que permita criar uma conta ou acessar uma existente
        // Caso seja acessar, deve permitir depositar ou sacar

        List<ContaCorrente> banco = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("\nDigite (1) para criar uma nova conta\nDigite (2) para fazer login");
            int askUser = scan.nextInt();

            if(askUser == 1){

                System.out.println("Digite seus DOIS primeiros nomes da conta:");
                String nomeConta = scan.nextLine();

                Random rdm = new Random();
                int min = 100000;
                int max = 999999;

                int numConta = (int)Math.floor(Math.random()*(max-min+1)+min);
                ContaCorrente test1 = new ContaCorrente(numConta, nomeConta);
                System.out.println("Conta criada!!\nNome: "+nomeConta+"\nNumero da conta: "+numConta);
                    banco.add(test1);
            }

            else if(askUser == 2){
                System.out.println("Digite seu nome:");
                String nome = scan.nextLine();

                System.out.println("Digite o numero da conta:");
                int nConta = scan.nextInt();


            }
        }
    }
}
