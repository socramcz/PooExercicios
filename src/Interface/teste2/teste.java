package Interface.teste2;

public class teste {
    public static void main(String[] args) {
        ObjetoGeometrico t1 = new Circulo(20.2);
        System.out.println("Area: " + t1.calcularArea());
        System.out.println("Perimetro: " + t1.calcularPerimetro());

        Retangulo t2 = new Retangulo(4.0, 6.0);
        System.out.println("Area: " + t2.calcularArea());
        System.out.println("Perimetro: " + t2.calcularPerimetro());

        Triangulo t3 = new Triangulo(10.0, 10.0, 20.0);
        System.out.println("Area: " + t3.calcularArea());
        System.out.println("Perimetro: " + t3.calcularPerimetro());
    }
}
