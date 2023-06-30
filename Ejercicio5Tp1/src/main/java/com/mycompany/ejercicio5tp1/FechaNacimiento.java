/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5tp1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author valen
 */
public class FechaNacimiento {
           LocalDate fechadeNacimiento;
       
    public FechaNacimiento(LocalDate fechaNacimiento){
    this.fechadeNacimiento = fechaNacimiento;
    }

    public int Edad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechadeNacimiento, fechaActual);
        return periodo.getYears();
    }
}
