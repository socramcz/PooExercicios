package Heranca.Exercicio1;

public class Testando {

    public static void main(String[] args) {
        Cachorro test1 = new Cachorro("carlos", "caramelo");
        Gato test2 = new Gato("juan", "vira-lata");

        System.out.println(test1.caminha());
        System.out.println(test1.late());
        System.out.println("");
        System.out.println(test2.caminha());
        System.out.println(test2.mia());

    }
}
