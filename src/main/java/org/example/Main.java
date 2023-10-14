package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3);
        Moneda m = null;
        Comprador c=null;
        try{
            m = new Moneda500();
            c = new Comprador(m,656,exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,656,exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,656,exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        try {
            m = null;
            c = new Comprador(m, TipoProducto.SPRITE.getOpcion(), exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = null;
            c = new Comprador(m, TipoProducto.SPRITE.getOpcion(), exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = null;
            c = new Comprador(m, TipoProducto.SPRITE.getOpcion(), exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        try{
            m = new Moneda1000();
            c = new Comprador(m,TipoProducto.COCA.getOpcion(), exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,TipoProducto.SNICKERS.getOpcion(), exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m,TipoProducto.SUPER8.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        }catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        try{
            m = new Moneda500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(), exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        try{
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        try{
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m,TipoProducto.SPRITE.getOpcion(),exp);
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }

    }
}