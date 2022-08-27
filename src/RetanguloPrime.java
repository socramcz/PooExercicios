class Ponto{
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

public class RetanguloPrime {
    Ponto m1, m2;
    double xCentro;
    double yCentro;

    public RetanguloPrime(Ponto canto1, Ponto canto2){
        m1 = canto1;
        m2 = canto2;
    }

    public String centro(){
        xCentro = (m1.getX() + m2.getX())/2;
        yCentro = (m1.getY() + m2.getY())/2;
        return "X = " +xCentro+ "\nY = "+yCentro;
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(10,20);
        Ponto p2 = new Ponto(20,50);
        RetanguloPrime r = new RetanguloPrime(p1, p2);
        System.out.println(r.centro());
    }
}
