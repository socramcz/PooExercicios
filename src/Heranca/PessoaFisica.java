package Heranca;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf){
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return "Pessoa Fisica" + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
