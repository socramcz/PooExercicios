package PooNivel1.Pratica;

public class TesteDoPrograma {

    public static void main(String[] args) {
        AutomovelAVenda test = new AutomovelAVenda("", "2015", 24500.50);
        System.out.println(test.getTipo());
        System.out.println(test.getAno());
        System.out.println(test.getPreçoDeVenda());

        MotocicletaAVenda test1 = new MotocicletaAVenda("", "2019", 25000.59);
        System.out.println(test1.getTipo());
        System.out.println(test1.getAno());
        System.out.println(test1.getPreçoDeVenda());

    }
}
