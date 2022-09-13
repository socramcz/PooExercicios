/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class Veiculo {
    protected double velocidade;

    public Veiculo(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public String acelerar(){
        return "Apertei o pedal e a velocidade agora é" + (velocidade+10);
    }
    
}
