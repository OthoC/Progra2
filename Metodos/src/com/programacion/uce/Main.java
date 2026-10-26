package com.programacion.uce;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.ingresarDatos("Juan", "Pérez", "1723456789");
        persona1.generarServicio("Consulta médica");
        persona1.asignarCubiculo(2);

        System.out.println("--------------------");

        Persona persona2 = new Persona();

        persona2.ingresarDatos("María", "López", "1712345678");
        persona2.generarServicio("Odontología");
        persona2.asignarCubiculo(3);
    }
}