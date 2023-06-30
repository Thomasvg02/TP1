/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5tp1;

/**
 *
 * @author valen
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio5Tp1 {

    public static void main(String[] args) {
        String nuevaFecha;
        Scanner scanner= new Scanner(System.in);
      System.out.println("Introduzca la fecha del individuo (yyyy-mm-dd)");
         nuevaFecha=scanner.nextLine();
        LocalDate fechaNacimiento =LocalDate.parse(nuevaFecha);
        FechaNacimiento fecha = new FechaNacimiento(fechaNacimiento);
        int edad = fecha.Edad();
        System.out.println("La edad del individuo    es " + edad + " años");
    }
}
