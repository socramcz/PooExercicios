package PooNivel1;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return altura * base;
    }

    public double calcularPerimetro() {
        return (altura * 2) + (base * 2);
    }

    public static void main(String[] args) {
        Retangulo test = new Retangulo(5.7, 8.9);
        System.out.println(String.format("\nArea => %.2f", test.calcularArea()));
        System.out.println(String.format("Perimetro => %.2f", test.calcularPerimetro()));
    }
}