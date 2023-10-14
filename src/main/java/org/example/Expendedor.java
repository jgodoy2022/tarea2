package org.example;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Moneda> monVu;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;

    public void AgregaMoneda(int valorBebida, int dinero) {
        for (int i = 0; i < valorBebida - dinero; i += 100) {
            Moneda a = new Moneda100();
            monVu.addCosas(a);
        }
    }
    public Expendedor(int numProductos) {
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
            snickers.addCosas(d);
            Dulce e = new Super8(i);
            super8.addCosas(e);

        }
    }
    public Producto comprarProducto(Moneda m,int queProducto) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if(m == null){
            throw new PagoIncorrectoException("Error. Pago inválido");
        } else if (queProducto!=TipoProducto.COCA.getOpcion() && queProducto!=TipoProducto.SNICKERS.getOpcion() && queProducto!=TipoProducto.SUPER8.getOpcion() && queProducto!=TipoProducto.FANTA.getOpcion() && queProducto!=TipoProducto.SPRITE.getOpcion()){
            throw new NoHayProductoException("Error. Producto no disponible");
        } else if(m.getValor() < TipoProducto.values()[queProducto - 1].getValor()){
            throw new PagoInsuficienteException("Error. Pago insuficiente");
        }
        else if(queProducto == TipoProducto.COCA.getOpcion() && (coca.sizeCosas() > 0)){
            AgregaMoneda(m.getValor(), TipoProducto.values()[queProducto - 1].getValor());
            return coca.getCosas();
        }
        else if (queProducto == TipoProducto.SPRITE.getOpcion() && (sprite.sizeCosas() > 0)) {
            AgregaMoneda(m.getValor(), TipoProducto.values()[queProducto - 1].getValor());
            return sprite.getCosas();
        }
        else if (queProducto == TipoProducto.FANTA.getOpcion() && (fanta.sizeCosas() > 0)) {
            AgregaMoneda(m.getValor(), TipoProducto.values()[queProducto - 1].getValor());
            return fanta.getCosas();
        }
        else if (queProducto == TipoProducto.SNICKERS.getOpcion() && (snickers.sizeCosas() > 0)) {
            AgregaMoneda(m.getValor(), TipoProducto.values()[queProducto - 1].getValor());
            return snickers.getCosas();
        }
        else if (queProducto == TipoProducto.SUPER8.getOpcion() && (super8.sizeCosas() > 0)) {
            AgregaMoneda(m.getValor(), TipoProducto.values()[queProducto - 1].getValor());
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
