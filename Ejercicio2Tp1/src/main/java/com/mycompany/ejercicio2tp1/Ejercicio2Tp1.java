/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2tp1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author valen
 */
class Calcular{
  
  public int suma(int a, int b) {
    return a + b;
  }
  
  public double suma(double a, double b) {
    return a + b;
  }
  
  public int resta(int a, int b) {
    return a - b;
  }
  
  public double resta(double a, double b) {
    return a - b;
  }
  
  public int multiplicacion(int a, int b) {
    return a * b;
  }
  
  public double multiplicacion(double a, double b) {
    return a * b;
  }
  
  public int dividision(int a, int b) {
    return a / b;
  }
  
  public double dividision(double a, double b) {
    return a / b;
  }
  
}
class CalculoComplejos {
  private double preal;
  private double pimaginaria;

  public CalculoComplejos(double real, double imaginario) {
    this.preal = real;
    this.pimaginaria = imaginario;
  }

  public double getReal() {
    return preal;
  }

  public double getImaginario() {
    return pimaginaria;
  }

  public CalculoComplejos suma(CalculoComplejos signum) {
      
    double sumaReal = preal + signum.getReal();
    double sumaImaginario = pimaginaria + signum.getImaginario();
    
    return new CalculoComplejos(sumaReal, sumaImaginario);
  }

  public CalculoComplejos resta(CalculoComplejos signum) {
      
    double restaReal = preal - signum.getReal();
    double restaImaginario = pimaginaria - signum.getImaginario();
    
    return new CalculoComplejos(restaReal, restaImaginario);
  }

  public CalculoComplejos multiplicacion(CalculoComplejos signum) {
      
    double productoReal = preal * signum.getReal() - pimaginaria * signum.getImaginario();
    double productoImaginario = preal * signum.getImaginario() + pimaginaria * signum.getReal();
    
    return new CalculoComplejos(productoReal, productoImaginario);
  }

  public CalculoComplejos dividision(CalculoComplejos signum) {
      
    double denominador = signum.getReal() * signum.getReal() + signum.getImaginario() * signum.getImaginario();
    double cocienteReal = (preal * signum.getReal() + pimaginaria * signum.getImaginario()) / denominador;
    double cocienteImaginario = (pimaginaria * signum.getReal() - preal * signum.getImaginario()) / denominador;
    
    return new CalculoComplejos(cocienteReal, cocienteImaginario);
  }

  public String toString() {
    return  "( " +preal + " + " + pimaginaria + "i)";
  }
}


public class Ejercicio2Tp1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    Calcular calcular = new Calcular();

    int bucle=1;
    double resultado,num1,num2;
    while (bucle==1) {
      System.out.println(" Elija la Operacion a Realizar");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");
      System.out.println("5. Operaciones con complejos");
      System.out.println("6. Salir");

      try {
        String opcion = scanner.nextLine();
        switch (opcion) {
                
          case "1": //SUMA
            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2 = scanner.nextDouble();
            resultado = calcular.suma(num1, num2);
            if(((resultado)%1)==0){
                int resultadoe = (int)resultado;
                System.out.println("El resultado es: " + resultadoe);
            } else{
            System.out.println("El resultado es: " + resultado);
            }
            break;

          case "2": //RESTA
            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2 = scanner.nextDouble();
            resultado = calcular.resta(num1, num2);
            if(((resultado)%1)==0){
                int resultadoe = (int)resultado;
                System.out.println("El resultado es: " + resultadoe);
            } else{
            System.out.println("El resultado es: " + resultado);
            }
            break;

          case "3": //MULTIPLICACION
            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2 = scanner.nextDouble();
            resultado = calcular.multiplicacion(num1, num2);
             if(((resultado)%1)==0){
                int resultadoe = (int)resultado;
                System.out.println("El resultado es: " + resultadoe);
            } else{
            System.out.println("El resultado es: " + resultado);
            }
            break;

          case "4": //DIVISION
            System.out.println("Ingrese el dividendo:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el divisor:");
            num2 = scanner.nextDouble();
            resultado = calcular.dividision(num1, num2);
             if(((resultado)%1)==0){
                int resultadoe = (int)resultado;
                System.out.println("El resultado es: " + resultadoe);
            } else{
            System.out.println("El resultado es: " + resultado);
            }
            break;

          case "5": //OPERACIONES CON NUMEROS COMPLEJOS
            System.out.println("Ingrese el primer número real");
            double real1 = scanner.nextDouble();
            System.out.println("Ingrese el primer número imaginario");
            double imaginario1 = scanner.nextDouble();
            CalculoComplejos complejo1 = new CalculoComplejos(real1, imaginario1);

            System.out.println("Ingrese el segundo número real");
            double real2 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número imaginario");
            double imaginario2 = scanner.nextDouble();
            CalculoComplejos complejo2 = new CalculoComplejos(real2, imaginario2);

            CalculoComplejos resultadocomplejo;

            System.out.println("Elija una operación con números complejos");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int operacionComplejos = scanner.nextInt();

            switch (operacionComplejos) {
              case 1:
                resultadocomplejo = complejo1.suma(complejo2);
                System.out.println("El resultado es: " + resultadocomplejo);
                break;

              case 2:
                resultadocomplejo = complejo1.resta(complejo2);
                System.out.println("El resultado es: " + resultadocomplejo);
                break;

              case 3:
                resultadocomplejo = complejo1.multiplicacion(complejo2);
                System.out.println("El resultado es: " + resultadocomplejo);
                break;

              case 4:
                resultadocomplejo = complejo1.dividision(complejo2);
                System.out.println("El resultado es: " + resultadocomplejo);
                break;

              default:
                System.out.println("Elija una Opcion valida");
                break;
            }
            break;

          case "6":
            bucle=0;
            System.out.println("Saludos!");
            break;

          default:
            System.out.println("Elija una Opcion valida");
            break;
        }
      } 
      catch (InputMismatchException e) {
      System.out.println("Elija una asignacion valida");
      scanner.nextLine();
      }
        if (bucle==1)
        {
        scanner.nextLine();
        System.out.println(" Desea hacer mas operaciones? (1. Si - 2. No)");
        int decision = scanner.nextInt();
        while((decision!=1)&&(decision!=2)){
        System.out.println("Elija una Opcion Valida");
        decision = scanner.nextInt();
        }
        switch (decision){
            case 1:
                 scanner.nextLine();
                break;
            case 2:
                System.out.print("Un saludo!");
                bucle=0;
                break;
            default:
                System.out.println("Elija una Opcion Valida");
                break;
                
        }
        

        }
    }

  }
}
  

