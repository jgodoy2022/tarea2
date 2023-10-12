package org.example;

public enum Productos {
    COCA(1),
    SPRITE(2),
    DULCE(3);

    private final int opcion;
    Productos(int opcion) {
        this.opcion=opcion;
    }
    public int getOpcion(){
        return opcion;
    }
}
