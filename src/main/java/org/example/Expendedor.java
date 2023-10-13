package org.example;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Moneda> monVu;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private int precio;
    private int numBebidas;
    private int numDulces;

    public void AgregaMoneda(){
        Moneda a = new Moneda100();
        monVu.addCosas(a);
    }

    public Expendedor(int numProductos, int precio) {
        this.precio = precio;
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        monVu = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        for(int i=0; i<numProductos; i++){
            Bebida a =new Fanta(i);
            fanta.addCosas(a);
            Bebida b = new CocaCola(i);
            coca.addCosas(b);
            Bebida c = new Sprite(i);
            sprite.addCosas(c);
            Dulce d = new Snickers(i);
            super8.addCosas(d);
            Dulce e = new Super8(i);
            snickers.addCosas(e);

        }
    }

    public Producto comprarProducto(Moneda m,int queProducto){
        if(m == null){
            throw new PagoIncorrectoException("Error. Pago inválido");
        }
        else if(m.getValor() < precio){
            throw new PagoInsuficienteException("Error. Pago insuficiente");
        }
        else if(queProducto == Productos.COCA.getOpcion() && (coca.sizeCosas() > 0)){
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                AgregaMoneda();
            }
            return coca.getCosas();
        }
        else if (queProducto == Productos.SPRITE.getOpcion() && (sprite.sizeCosas() > 0)) {
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                AgregaMoneda();
            }
            return sprite.getCosas();
        }
        else if (queProducto == Productos.FANTA.getOpcion() && (fanta.sizeCosas() > 0)) {
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                AgregaMoneda();
            }
            return fanta.getCosas();
        }
        else if (queProducto == Productos.SNICKERS.getOpcion() && (snickers.sizeCosas() > 0)) {
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                AgregaMoneda();
            }
            return snickers.getCosas();
        }
        else if (queProducto == Productos.SUPER8.getOpcion() && (super8.sizeCosas() > 0)) {
            for (int i = 0; i < m.getValor() - precio; i += 100) {
                AgregaMoneda();
            }
            return super8.getCosas();
        }
        else {
            throw new NoHayProductoException("Error. Producto no disponible");
        }
    }
    public Moneda getVuelto() {
        return monVu.getCosas();
    }

}
