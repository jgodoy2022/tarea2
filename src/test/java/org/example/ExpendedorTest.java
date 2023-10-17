package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    @Test
    void agregaMoneda() {
        Expendedor exp = new Expendedor(1); // Crea una instancia de Expendedor con 1 producto
        int valorBebida = TipoProducto.COCA.getValor();
        Moneda m = new Moneda1500();
        exp.AgregaMoneda(valorBebida,m.getValor());

    }

    @Test
    void comprarProducto() {
    }

    @Test
    void getVuelto() {
    }
}