package org.example;

public enum Productos {
    COCA(1),
    SPRITE(2),
    FANTA(3),
    SNICKERS(4),
    SUPER8(5);

    private final int opcion;
    Productos(int opcion) {
        this.opcion=opcion;
    }
    public int getOpcion(){
        return opcion;
    }
}
