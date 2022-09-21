package Interface.teste1;

public class Carro implements Veiculo{

    public String acelerar(double velocidade){
        return "Acelerei o carro";
    }

    public String frear(double velocidade){
        return "freiou o carro";
    }

    public void passarMarcha() {
        System.out.println("A marcha do carro foi passada");
    }


    public void trocarPneu() {
        System.out.println("O pneu do carro foi trocado");
    }
}
