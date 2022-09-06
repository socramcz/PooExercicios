package Heranca;

public class PessoaJuridica extends PessoaFisica{
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cpf, String cnpj) {
        super(nome, idade, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
