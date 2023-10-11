package org.example;
import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> m;
    private ArrayList<Moneda> l;
    public Deposito(){
        m = new ArrayList();
        l = new ArrayList();
    }
    public void addBebida(Bebida b){
        m.add(b);
    }
    public Bebida getBebida(){
        if(m.size() != 0){
            return m.remove(0);
        }
        return null;
    }
    public void addMoneda(Moneda m){
        l.add(m);
    }
    public Moneda getMoneda(){
        if(l.size() != 0){
            return l.remove(0);
        }
        return null;
    }
}
