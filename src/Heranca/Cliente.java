package Heranca;

public class Cliente {

    public static void main(String[] args) {
        PessoaJuridica fulano = new PessoaJuridica("fulano", 25, "14725836912", "14725836945621");
        fulano.getNome();
        fulano.getIdade();
        fulano.getCpf();
        fulano.getCnpj();
    }
}
