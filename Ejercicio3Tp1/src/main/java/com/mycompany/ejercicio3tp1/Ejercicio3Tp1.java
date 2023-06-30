

package com.mycompany.ejercicio3tp1;

/**
 *
 * @author valen
 */
import java.util.Scanner;

public class Ejercicio3Tp1 {

    public static void main(String[] args) {
        int opcion=0;
       Scanner scanner = new Scanner(System.in); 
       while(opcion!=2){
        System.out.println("1.Ingresar una persona");
        System.out.println("2.Salir");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                   System.out.println("Ingrese el nombre de la persona");
                   scanner.nextLine();
                   String Nombre=scanner.nextLine();
                   Persona nuevaPersona = new Persona(Nombre);
                   System.out.println("Nombre de la persona " + Persona.getCantidadPersonas() + " : " + nuevaPersona.getNombre());
                   System.out.println("Cantidad de personas : " + Persona.getCantidadPersonas());
                break;
                case 2:
        System.out.println("Saludos!");
        break;
                default:
                    System.out.println("Ingrese el caracter valido");
                    break;
                
        }
        
       } 
}
}