package org.example;

public class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }

    @Override
    public String toString() {
        return super.toString()+getValor()+" pesos";
    }
}
