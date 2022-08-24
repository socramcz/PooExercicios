import java.util.Scanner;

public class CalculoImc {
    private double peso;
    private double altura;

    public CalculoImc(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public void calcular(){
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: "+imc);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();

        CalculoImc user1 = new CalculoImc(peso, altura);
        user1.calcular();
    }
}
