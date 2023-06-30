/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3tp1;

/**
 *
 * @author valen
 */
public class Persona {
    public static int cantidad_personas = 0;
   String Nombre;
    public Persona(String Nombre) {
        this.Nombre = Nombre;
        cantidad_personas++;
    }
    public static int getCantidadPersonas(){
        return cantidad_personas;
    }
    public String getNombre(){
        return Nombre;
    }
}
