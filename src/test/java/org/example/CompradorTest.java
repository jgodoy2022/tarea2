package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    @Test
    void cuantoVuelto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp=new Expendedor(1);
        Deposito super8 = new Deposito<Dulce>();
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, TipoProducto.SUPER8.getOpcion(), exp);
        assertEquals(700, comprador.cuantoVuelto());
    }

    @Test
    void queCompraste() {
        Expendedor exp=new Expendedor(1);
        Deposito super8 = new Deposito<Dulce>();
        Moneda m = new Moneda1000();
        try{
            Comprador comprador=new Comprador(m,TipoProducto.SUPER8.getOpcion(), exp);
            assertEquals("super8",comprador.queCompraste());
        } catch (PagoIncorrectoException e){
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e){
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e){
            System.out.println(e.getMessage());
        }
    }
}