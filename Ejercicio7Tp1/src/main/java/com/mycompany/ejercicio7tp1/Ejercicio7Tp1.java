/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio7tp1;

import java.util.Scanner;

/**
 *
 * @author valen
 */

public class Ejercicio7Tp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija el Dividendo");
        int dividendo = scanner.nextInt();
        System.out.println("Elija el Divisor");
        int divisor = scanner.nextInt();
        double resultado = Division.dividir(dividendo, divisor);
        if (((resultado) % 1) == 0) {
            int resultadoe = (int) resultado;
              System.out.println("El resultado es: " + resultadoe);

        } else {
                System.out.println("El resultado es: " + resultado);
        }
    }
}
