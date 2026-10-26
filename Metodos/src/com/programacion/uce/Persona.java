package com.programacion.uce;

public class Persona {

    String nombre;
    String apellido;
    String cedula;
    String servicio;
    int turno;

    static int turnoSecuencial = 0;

    public void ingresarDatos(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void generarServicio(String servicio) {
        this.servicio = servicio;
    }

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Servicio: " + servicio);
        System.out.println("Turno asignado: " + turno);
    }

    public void asignarCubiculo(int cubiculoDesocupado) {
        turnoSecuencial++;
        this.turno = turnoSecuencial;

        System.out.println("Cubículo asignado: " + cubiculoDesocupado);
        imprimirInfo();
    }
}