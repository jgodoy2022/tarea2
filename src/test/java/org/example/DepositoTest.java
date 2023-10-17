package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {

    @Test
    void addCosas() {
        Deposito coca = new Deposito<Bebida>();
        Bebida b = new CocaCola(1);
        coca.addCosas(b);
        assertEquals(1,coca.sizeCosas());
    }

    @Test
    void getCosas() {
        Deposito coca = new Deposito<Bebida>();
        Bebida b = new CocaCola(1);
        coca.addCosas(b);
        assertEquals(b,coca.getCosas());
    }

    @Test
    void sizeCosas() {
        Deposito coca = new Deposito<Bebida>();
        assertEquals(0,coca.sizeCosas());
        Producto b=new CocaCola(1);
        coca.addCosas(b);
        assertEquals(1,coca.sizeCosas());
    }
}