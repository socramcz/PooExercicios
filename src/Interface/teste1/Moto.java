package Interface.teste1;

public class Moto implements Veiculo{

    public String acelerar(double velocidade){
        return "Acelerei a moto";
    }

    public String frear(double velocidade){
        return "freiou a moto";
    }

    public void passarMarcha() {
        System.out.println("A marcha da motofoi passada");
    }


    public void trocarPneu() {
        System.out.println("O pneu da moto foi trocado");
    }
}
