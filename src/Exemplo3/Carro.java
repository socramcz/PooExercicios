/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo3;

/**
 *
 * @author SENAI
 */
public class Carro implements Veiculo{

    @Override
    public String acelerar(double velocidade) {
        return "pisei no pedal e acelerei "+ velocidade;
    }

    @Override
    public String frear(double velocidade) {
        return "pisei no freio e reduzi "+ velocidade;
    }

    @Override
    public void passarMarcha() {
        System.out.println("Mexi na alavanca pra próxima marcha");
    }
    
}
