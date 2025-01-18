package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void registrarGasto() {
    }

    @Test
    public void opcionValidaTest() {

        int opcion = 1;
        boolean opcionValida = (opcion == 1 || opcion == 2);
        assertTrue(opcionValida, "La opción seleccionada debe ser válida.");
    }

    @Test
    void opcionInvalidaTest() {

        int opcion = 3;
        boolean opcionValida = (opcion == 1 || opcion == 2);
        assertFalse(opcionValida, "La opción seleccionada no debe ser válida.");
    }

    @Test
    void cantidadValidaTest() {

        double cantidad = 500;
        boolean cantidadValida = cantidad > 0;
        System.out.println("La cantidad es " + cantidad);
        assertTrue(cantidadValida, "La cantidad debe ser positiva.");
    }

    @Test
    void cantidadInvalidaTest() {
        // Simulamos la entrada del usuario con una cantidad negativa
        String input = "1\n-1000.0\n"; // Opción válida 1 pero cantidad negativa
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        // Leemos la cantidad
        double cantidad = scanner.nextDouble();

        // Verificamos si la cantidad es válida
        boolean cantidadValida = cantidad > 0; // Condición para validar que la cantidad es positiva

        // Aseguramos que la cantidad sea inválida
        assertFalse(cantidadValida, "La cantidad no debe ser negativa.");
    }

}