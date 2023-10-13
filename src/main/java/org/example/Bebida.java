package org.example;

public abstract class Bebida extends Producto{
    private int serie;
    public Bebida(int a){
        this.serie = a;
    }
    public abstract String sabor();
    public int getSerie(){
        return this.serie;
    }
}
