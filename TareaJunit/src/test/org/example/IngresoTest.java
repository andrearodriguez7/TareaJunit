package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngresoTest {

    @Test
    void getConcepto() {
        Ingreso ingreso = new Ingreso("Nómina", 1500.0);
        System.out.println("El concepto es " + ingreso.getConcepto());
        assertEquals("Nómina", ingreso.getConcepto(), "El concepto no coincide");
    }

    @Test
    void getCantidad() {
        Ingreso ingreso = new Ingreso("Nómina", 1500.0);
        System.out.println("La cantidad es " + ingreso.getCantidad() + " euros");
        assertEquals(1500.0, ingreso.getCantidad(), "La cantidad no coincide");
    }
}