package Encapsulamento;

public class Cliente {

    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("01425136812");
        System.out.println(fulano.getCpf());
        fulano.setCpf("444444555666");
        System.out.println(fulano.getCpf());
    }
}
