/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1ejercicio1;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author valen
 */


class Empleado{

  String nombre;
  int sueldo;
  String cargo;
  String fecha;


  public Empleado(String nombre,String cargo, int sueldo, String fecha) {
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.cargo = cargo;
    this.fecha = fecha;
  }
  
  public Empleado(String nombre,String cargo, int sueldo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.cargo = cargo;
  }
    public Empleado(String nombre,int sueldo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
  }


}

public class Tp1Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del individuo:");
        String nombre = scanner.nextLine();
        System.out.println("Por favor ingrese el sueldo del individuo:");
        int sueldo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("¿El Individuo tiene algun cargo? (s/n)");
        String decision = scanner.nextLine();
        
        if (decision.equalsIgnoreCase("n")) {
            System.out.println("Ingrese el cargo del individuo:");
            String cargo = scanner.nextLine();
            System.out.println("¿Existe una fecha de contratación del mismo? (s/n)");
            decision = scanner.nextLine();
            
            if (decision.equalsIgnoreCase("n")) {
                System.out.println("Ingrese la fecha de contratación del empleado: ");
                String fecha = scanner.nextLine();
                Empleado empleado = new Empleado(nombre,cargo,sueldo,fecha);
                System.out.println("Datos del empleado:");
                System.out.println("Nombre: " + empleado.nombre);
                System.out.println("Sueldo: "+ empleado.sueldo);
                System.out.println("Cargo: "+ empleado.cargo);
                System.out.println("Fecha: "+ empleado.fecha);
            } 
            
            else if(decision.equalsIgnoreCase("s")){
                Empleado empleado = new Empleado(nombre,cargo,sueldo);
                System.out.println("Datos del empleado:");
                System.out.println("Nombre: " + empleado.nombre);
                System.out.println("Sueldo: "+ empleado.sueldo);
                System.out.println("Cargo: "+ empleado.cargo);
            }
        else {
            System.out.println("Favor de elegir un caracter valido");
        }
        } 
        else if(decision.equalsIgnoreCase("s")){
            Empleado empleado = new Empleado(nombre,sueldo);
            System.out.println("Datos del empleado:");
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Sueldo: " + empleado.sueldo);
        } 
        else {
            System.out.println("Favor de elegir un caracter valido");
        }
    
  }
    }

