package org.example;

public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
    @Override
    public int compareTo(Moneda m) {
        return Integer.compare(getValor(),m.getValor());
    }

    @Override
    public String toString() {
        return "Moneda de ";
    }
}
