package org.example;

public class Producto {
    public Producto() {
        Producto producto = null;
    }
    public Producto entregarProducto(int opcion){
        switch(opcion){
            case 1:
                producto = new Bebida(Productos.COCA);
        }
    }
}
