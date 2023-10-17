package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    @Test
    void agregaMoneda() {
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        assertEquals(m,exp.getVuelto());
        m=new Moneda100();
        exp.AgregaMoneda(m.getValor(),TipoProducto.COCA.getValor());
        assertEquals(100,exp.getVuelto().getValor());
    }

    @Test
    void comprarProducto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(1);
        Moneda m = new Moneda100();
        Producto pro =exp.comprarProducto(m,TipoProducto.COCA.getOpcion());
        assertTrue(pro instanceof CocaCola);
    }

    @Test
    void getVuelto() {
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        assertEquals(m,exp.getVuelto());
        m=new Moneda100();
        exp.AgregaMoneda(m.getValor(),TipoProducto.COCA.getValor());
        assertEquals(100,exp.getVuelto().getValor());
    }
}