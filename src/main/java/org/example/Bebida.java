package org.example;

public abstract class Bebida{
    private int serie;
    public Bebida(int a){
        this.serie = a;
    }
    public abstract String beber();
    public int getSerie(){
        return this.serie;
    }
}
