package org.example;

public class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }

    @Override
    public String toString() {
        return super.toString()+getValor()+" pesos";
    }
}
