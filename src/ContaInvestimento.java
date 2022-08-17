public class ContaInvestimento {
    private int conta;
    private String nome;
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(int conta, String nome, double saldo, double taxaJuros){
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
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

    public void adicionaJuros(){
        this.saldo += this.saldo * (this.taxaJuros/100);
    }

    // TESTE DA CLASSE //
    public static void main(String[] args) {
        ContaInvestimento test2 = new ContaInvestimento(50384, "Joao", 1000, 10);
        for (int i = 0; i < 5; i++) {
            test2.adicionaJuros();
            System.out.println("\nSua conta rendeu!!\n=> Saldo atual: R$ " + test2.saldo);

        }
        test2.sacar(500);
        test2.depositar(2600);
    }
}
