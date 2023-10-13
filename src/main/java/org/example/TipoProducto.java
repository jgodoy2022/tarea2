package org.example;

public enum TipoProducto {

    COCA(1,1000),

    SPRITE(2,1000) ,

    FANTA(3,1000),
    SNICKERS(4,500),
    SUPER8(5,500);


    private final int opcion;
    private final int valor;

    TipoProducto(int opcion, int valor) {
        this.opcion = opcion;
        this.valor = valor;
    }

    public int getOpcion(){
        return opcion;
    }
    public int getValor(){
        return valor;
    }
}
