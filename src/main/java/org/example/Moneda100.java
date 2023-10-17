package org.example;

public class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }

    @Override
    public String toString() {
        return super.toString()+getValor()+" pesos";
    }
}
