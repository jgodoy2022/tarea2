package org.example;

public abstract class Moneda{
    private int serie;
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}
