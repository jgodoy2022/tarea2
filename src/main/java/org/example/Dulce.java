package org.example;

abstract public class Dulce extends Producto {
    private int serie;
    public Dulce(int a){
        this.serie = a;
    }
    public abstract String beber();
    public int getSerie(){
        return this.serie;
    }
}
