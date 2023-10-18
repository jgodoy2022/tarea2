package org.example;

/**
 * Sprite es una subclase de Bebida que representa la bebida sprite, utiliza el metodo "sabor" para la
 * descripcion del sabor
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Sprite extends Bebida{

    /**
     * Constructor
     * @param c representa el numero de serie de la bebida
     */
    public Sprite(int c){
        super(c);
    }

    /**
     * @return cadena de caracteres que describe el sabor de la bebida Sprite
     */
    public String sabor(){
        return "sprite";
    }
}
