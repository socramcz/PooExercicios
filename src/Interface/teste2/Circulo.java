package Interface.teste2;

public class Circulo implements ObjetoGeometrico{

    protected Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double calcularArea() {
        return Math.PI*raio*raio;
    }

    public Double calcularPerimetro() {
        return 2*Math.PI*raio;
    }
}
