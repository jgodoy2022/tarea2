package org.example;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Moneda> monVu;
    private Deposito<Dulce> dulce;
    private int precioBebida, precioDulces;
    private int numBebidas;
    private int numDulces;

    public Expendedor(int numProductos, int precioBebida, int precioDulces) {
        this.precioBebida = precioBebida;
        this.precioDulces = precioDulces;
        numBebidas = numProductos;
        numDulces = numProductos;
        coca = new Deposito<>();
        sprite = new Deposito<>();
        monVu = new Deposito<>();
        dulce = new Deposito<>();
        for(int i=0; i<numProductos; i++){
            Bebida b = new CocaCola(i);
            coca.addCosas(b);
            Bebida c = new Sprite(i);
            sprite.addCosas(c);
            Dulce d = new Super8(i);
            dulce.addCosas(d);

        }
    }

    public Producto comprarProducto(Moneda m, int cual){

    }

   /* public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null) {
            return null;
        } else if (m.getValor() < precio) {
            for (int i = 0; i < m.getValor(); i += 100) {
                Moneda a = new Moneda100();
                monVu.addCosas(a);
            }
            return null;
        } else if (cual == COCA && numcoca > 0) {
            numcoca -= 1;
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                Moneda a = new Moneda100();
                monVu.addCosas(a);
            }
            return coca.getCosas();
        } else if (cual == SPRITE && numsprite > 0) {
            numsprite -= 1;
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                Moneda a = new Moneda100();
                monVu.getCosas();
            }
            return sprite.getCosas();
        } else {
            for (int i = 0; i < m.getValor(); i += 100) {
                Moneda a = new Moneda100();
                monVu.getCosas();
            }
            return null;
        }
    }*/
    public Moneda getVuelto() {
        return monVu.getCosas();
    }

}
