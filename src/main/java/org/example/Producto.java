package org.example;

public class Producto {
    enum TipoProducto{
        COCA(1,1000),
        SPRITE(2,1000),
        FANTA(3,1000),
        SNICKERS(4,500),
        SUPER8(5,500)


        private final int opcion;
        Productos(int opcion) {
            this.opcion=opcion;
        }
        public int getOpcion(){
            return opcion;
        }
    }
    public Producto() {
        Producto producto = null;
    }
    }
}
