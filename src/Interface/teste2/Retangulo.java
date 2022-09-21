package Interface.teste2;

public class Retangulo implements ObjetoGeometrico{

    protected Double b;
    protected Double h;

    public Retangulo(Double b, Double h) {
        this.b = b;
        this.h = h;
    }

    public Double calcularArea() {
        Double resultadoA = b * h;
        return resultadoA;
    }

    public Double calcularPerimetro() {
        double resultadoP = 2*b + 2*h;
        return resultadoP;
    }
}
