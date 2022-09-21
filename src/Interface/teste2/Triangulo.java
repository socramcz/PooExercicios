package Interface.teste2;

public class Triangulo implements ObjetoGeometrico{

    protected Double ladoA;
    protected Double ladoB;
    protected Double ladoC;
    Double s = 0.0;

    public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Double calcularPerimetro(){
        double s = (ladoA + ladoB + ladoB);
        return s;
    }

    public Double calcularArea(){
        s = s / 2;
        double areaT = Math.sqrt(s * (s-ladoA) * (s-ladoB) * (s-ladoC));
        return areaT;
    }
}
