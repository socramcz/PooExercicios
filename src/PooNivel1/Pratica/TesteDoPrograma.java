package PooNivel1.Pratica;

public class TesteDoPrograma {

    public static void main(String[] args) {
        AutomovelAVenda test = new AutomovelAVenda("Sedan", "2015", 24500.50, "Siena");
        System.out.println(test.getAutomovel());
        System.out.println(test.getAno());
        System.out.println(test.getTipo());
        System.out.println(test.getPreçoDeVenda());

        MotocicletaAVenda test1 = new MotocicletaAVenda("Naked", "2019", 25000.50, "NXC 700");
        System.out.println(test1.getMotocicleta());
        System.out.println(test1.getAno());
        System.out.println(test1.getTipo());
        System.out.println(test1.getPreçoDeVenda());

    }
}
