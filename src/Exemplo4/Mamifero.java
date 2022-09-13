/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo4;

/**
 *
 * @author SENAI
 */
public abstract class Mamifero {
    protected String mamas;

    public Mamifero(String mamas) {
        this.mamas = mamas;
    }
    
    public abstract void mamar();
    
    public String respirar(){
        return "inspira...expira";
    }
}
