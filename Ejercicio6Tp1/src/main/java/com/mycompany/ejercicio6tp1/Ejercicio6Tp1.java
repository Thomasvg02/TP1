package com.mycompany.ejercicio6tp1;

import java.util.Scanner;

/**
 *
 * @author valen
 */

public class Ejercicio6Tp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido del alumno: ");
        String apellido = scanner.nextLine();

        double[] notas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del alumno: " + nombre + " " + apellido);
            notas[i] = scanner.nextDouble();
        }

        Alumno alumno = new Alumno(nombre, apellido, notas);
        double Promedio = alumno.getPromedio();
        if (((Promedio) % 1) == 0) {
            int Promedioe = (int) Promedio;
            System.out.println("El promedio del alumno " + nombre + " " + apellido + " es: " + Promedioe);
        } else {
            System.out.println("El promedio del alumno " + nombre + " " + apellido + " es: " + Promedio);
        }
    }
}
