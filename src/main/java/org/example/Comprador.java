package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b = exp.comprarProducto(m, cualProducto);
        if(cualProducto == TipoProducto.COCA.getOpcion() || cualProducto == TipoProducto.SPRITE.getOpcion()
                || cualProducto == TipoProducto.FANTA.getOpcion() || cualProducto == TipoProducto.SNICKERS.getOpcion()
                || cualProducto == TipoProducto.SUPER8.getOpcion()){
            int aux = 0;
            while(exp.getVuelto() != null){
                aux += 100;
            }
            if(b != null){
                sonido = b.sabor();
                vuelto = aux;
            }
            else if(b == null && m != null){
                vuelto = aux;
                throw new NoHayProductoException("Error. Producto no disponible");
            }
        }
        else{
            vuelto = m.getValor();
            throw new NoHayProductoException("Error. Producto no disponible");
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}
