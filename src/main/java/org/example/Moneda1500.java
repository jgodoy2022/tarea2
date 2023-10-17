package org.example;

public class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return 1500;
    }
    @Override
    public String toString() {
        return super.toString()+getValor()+" pesos";
    }
}
