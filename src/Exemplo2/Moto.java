/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class Moto extends Veiculo{
    
    public Moto(double velocidade) {
        super(velocidade);
    }
    
    @Override
    public String acelerar(){
        return "Girei o acelerador a velocidade agora é:" + (velocidade+10);
    }
    
    public void abastecer(double combustivel){
        
    }
    
    public void abastecer(String mercadoria){
        
    }
    
}
