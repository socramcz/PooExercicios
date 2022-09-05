package PooNivel1;

import java.util.Scanner;

public class BombaCombustivel {

    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor){
        double litrosAbastecidos = valor / valorLitro;
        setQuantidadeCombustivel(this.quantidadeCombustivel - litrosAbastecidos);
        System.out.println("\nForam abastecidos: " +litrosAbastecidos+ "L"+ "\nValor a pagar: R$" +valor);
    }

    public void abastecerPorLitro(double litro){
        double clientePaga = litro * valorLitro;
        setQuantidadeCombustivel(this.quantidadeCombustivel - litro);
        System.out.println("\nForam abastecidos: " +litro+ "L" + "\nValor a pagar: R$" +clientePaga);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o tipo de gasolina:");
        String tipo1 = input.next();

        System.out.println("Digite o valor por litro do combustivel: ");
        double valor1 = input.nextDouble();

        System.out.println("Digite a capacidade da bomba:");
        double capacidade1 = input.nextDouble();

        BombaCombustivel test = new BombaCombustivel(tipo1, valor1, capacidade1);

        System.out.println("\n>>> Quantidade de combustivel na bomba: "+test.getQuantidadeCombustivel());
        test.abastecerPorValor(30);
        System.out.println("\n>>> Quantidade de combustivel na bomba: "+test.getQuantidadeCombustivel());
        test.abastecerPorLitro(20);
        System.out.println("\n>>> Quantidade de combustivel na bomba: "+test.getQuantidadeCombustivel());

    }
}
