/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio4tp1;

import java.util.Scanner;

/**
 *
 * @author valen
 */

public class Ejercicio4Tp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Ingrese la Base");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la Altura");
        double altura = scanner.nextDouble();

        double area = triangulo.calcularArea(base, altura);

        System.out.println("El área del triángulo es: " + area);
    }
}
