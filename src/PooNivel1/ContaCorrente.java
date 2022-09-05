package PooNivel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {
    private int nConta;
    private String nome;
    private double saldo;

    public ContaCorrente(int nConta, String nome){
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public int getnConta(){
        return nConta;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("\nDeposito de R$ "+valor+" realizado com sucesso\n=> Saldo atual: R$ "+getSaldo());
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("\nSaque de R$ "+valor+" realizado com sucesso\n=> Saldo atual: R$ "+getSaldo());
        }
        else{
            System.out.println(">>> Sua conta nao tem saldo suficiente para este saque <<<");
        }
    }

    // TESTE DA CLASSE //
    public static void main(String[] args) {
        List<ContaCorrente> banco = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\nDigite (1) para criar uma nova conta\nDigite (2) para fazer login");
            int askUser = scan.nextInt();

            if(askUser == 1){
                System.out.println("\nDigite seu nome:");
                String nomeConta = scan.next();

                Random rdm = new Random();
                int min = 100000;
                int max = 999999;

                int numConta = (int)Math.floor(Math.random()*(max-min+1)+min);
                ContaCorrente c1 = new ContaCorrente(numConta, nomeConta);
                System.out.println("Conta criada com sucesso!!\n=> Nome: "+nomeConta+"\n=> Numero da conta: "+numConta);
                banco.add(c1);
            }

            else if(askUser == 2){
                System.out.println("\nDigite seu nome:");
                String nome = scan.next();

                System.out.println("Digite o numero da conta:");
                int nConta = scan.nextInt();

                for(ContaCorrente c: banco){
                    if(c.getnConta() == nConta && c.getNome().equals(nome)){
                        System.out.println("\n>>> Login realizado com sucesso <<<");
                        System.out.println("\n=> Digite (1) para depositar\n=> Digite (2) para sacar");
                        int askUser2 = scan.nextInt();

                        if(askUser2 == 1){
                            System.out.println("Quanto deseja depositar?");
                            double valor = scan.nextInt();
                            c.depositar(valor);
                        }
                        else if(askUser2 == 2){
                            System.out.println("Quanto deseja sacar?");
                            double valor = scan.nextInt();
                            c.sacar(valor);
                        }
                        else {
                            System.out.println("Opcao invalida");
                        }
                    }

                }


            }
            else {
                System.out.println("Opcao invalida");
            }
        }
    }
}
