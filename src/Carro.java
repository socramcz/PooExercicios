// Crie uma classe carro com os atributos
// combustivel = 0 e consumo (km/litro)
// Metodos serão:
// Andar(double distancia) > Reduz a quantidade de combustivel de acordo com a distancia
// Abastecer(double quantidade) > aumenta o combustivel

public class Carro {
    private double consumo;
    private double combustivel;

    public Carro(double consumo){
        this.consumo = consumo;
    }

    private void andar(double distancia){
        double gasto = distancia/this.consumo;
        this.combustivel -= gasto;
        System.out.println("\n=> Carro percorreu " +distancia+ "KM"+"\nGastou: " +gasto+ "L"+"\nCombustivel restante: "+combustivel);
    }

    private void abastecer(double quantidade){
        combustivel += quantidade;
        System.out.println("\n=> Carro abastecido com "+quantidade+"L"+"\nTanque: "+combustivel+"L");
    }

    public static void main(String[] args) {
        Carro corsa = new Carro(25);
        corsa.abastecer(30);
        corsa.andar(120);
    }
}
