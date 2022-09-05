package CorrecaoProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombaCombustivel {

    private int id;
    private String tipo;
    private double valor, quantidade;

    public BombaCombustivel(int id, String tipo, double valor, double quantidade) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double abastecerPorValor(double reais) {
        double litros = reais / valor;
        if (litros <= quantidade) {
            quantidade -= litros;
        } else {
            System.out.println("Quantidade indisponivel");
        }
        return litros;

    }

    public double abastecerPorLitro(double litros) {
        double valor = litros * this.valor;
        if (litros <= quantidade) {
            quantidade -= litros;
        } else {
            System.out.println("Quantidade indisponivel");
        }
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        List<BombaCombustivel> posto = new ArrayList<>();
        int id = 0;
        System.out.println("Digite 1 para registrar uma nova Bomba"
                + "ou 2 para editar");
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();
        if (resposta == 1) {
            System.out.println("Digite o tipo do combustivel");
            String tipo = scan.nextLine();
            System.out.println("Digite o valor do litro");
            double valor = scan.nextDouble();
            System.out.println("Digite a quantidade de combustivel");
            double qtd = scan.nextDouble();
            BombaCombustivel b = new BombaCombustivel(id, tipo, valor, qtd);
            id++;
            posto.add(b);
        } else if (resposta == 2) {
            System.out.println("digite o id da bomba que deseja editar");
            resposta = scan.nextInt();
            System.out.println("Digite 1 para editar o tipo de combustivel"
                    + "2 para editar o valor do litro"
                    + "3 para editar a quantidade de combustivel"
                    + "4 para registrar um abastecimento por valor"
                    + "5 para registrar um abastecimento por litro");
            int resposta2 = scan.nextInt();
            for (BombaCombustivel b : posto) {
                if (b.getId() == resposta) {
                    switch (resposta2) {
                        case 1:
                            System.out.println("Digite o novo tipo de combustivel");
                            String novoTipo = scan.nextLine();
                            b.setTipo(novoTipo);
                            break;
                        case 2:
                            System.out.println("Digite o novo valor do litro de combustivel");
                            double novoValor = scan.nextDouble();
                            b.setValor(novoValor);
                            break;
                        case 3:
                            System.out.println("Digite o nova quantidade de combustivel");
                            double novaQtd = scan.nextDouble();
                            b.setQuantidade(novaQtd);
                            break;
                        case 4:
                            System.out.println("Digite o valor em reais");
                            double reais = scan.nextDouble();
                            b.abastecerPorValor(reais);
                            break;
                        case 5:
                            System.out.println("Digite a quantidade de litros");
                            double litros = scan.nextDouble();
                            b.abastecerPorLitro(litros);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                }

            }

        } else {
            System.out.println("Opção inválida");
        }
    }
}
