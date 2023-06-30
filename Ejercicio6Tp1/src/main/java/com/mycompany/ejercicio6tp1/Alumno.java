/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6tp1;

/**
 *
 * @author valen
 */
public class Alumno {
    String nombre;
    String apellido;
    private final double[] notas;

    public Alumno(String nombre, String apellido, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        double total = 0;
        for (double nota : notas) {
            total = total + nota;
        }
        return total / notas.length;
    }
}
