package org.example;

import java.util.ArrayList;

public class Comprador {
    private String sonido;
    private int vuelto;


    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b = exp.comprarProducto(m, cualProducto);
        if(cualProducto == TipoProducto.COCA.getOpcion() || cualProducto == TipoProducto.SPRITE.getOpcion()
                || cualProducto == TipoProducto.FANTA.getOpcion() || cualProducto == TipoProducto.SNICKERS.getOpcion()
                || cualProducto == TipoProducto.SUPER8.getOpcion()){
            if(b != null){
                sonido = b.sabor();
                vuelto = ?
            }
            else if(b == null && m != null){
                vuelto = ?
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
