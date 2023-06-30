/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7tp1;

/**
 *
 * @author valen
 */
public class Division {
    public static double dividir(int dividendo, int divisor) {
        try {
            if(divisor==0){
                throw new ArithmeticException("Error: No se puede dividir entre cero");
            }
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
            return Double.NaN;
        }
    }
}
