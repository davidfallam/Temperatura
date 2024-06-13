/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author jfalla
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado, temperatura=0.0;
        while (true){
        System.out.println("Menu  temperatura ");
        System.out.println("1. Celsius a Fahrenheit ");
        System.out.println("2. Celsius a Kelvin ");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Fahrenheit a Kelvin");
        System.out.println("5. Kelvin a Fahrenheit ");
        System.out.println("6. Kelvin a Celsius");
        System.out.println("7. Salir o chao o vete!!!");
        System.out.println("Por favor digite la opcion deseada");
        int opcion = entrada.nextInt();

        if(opcion ==7 ){
            System.out.println("Hasta la vista ");
            break;
        }
        if(opcion >=1 && opcion <=6 ){
            System.out.println("Ingrese la temperatura a convertir ");
             temperatura = entrada.nextDouble();
        }
        switch(opcion){
            case 1:
                System.out.println("Convertidor de Celsius a Fahrenheit");
                resultado = (temperatura *9/5)+32;
                System.out.println("La temperatura en Fahrenheit es "+ resultado +" ºF");
                break;   
            case 2:
                System.out.println("Convertidor de Celsius a Kelvin");
                resultado = temperatura +273.15;
                System.out.println("La temperatura en Kelvin es "+ resultado);
                break; 
            case 3:
                System.out.println("Convertidor de Fahrenheit a Celsius");
                resultado = (temperatura -32)*5/9 ;
                System.out.println("La temperatura en Celsius es "+ resultado);
                break;    
            case 4:
                System.out.println("Convertidor de Fahrenheit a Kelvin");
                resultado = (temperatura -32)*5/9 +273.15;
                System.out.println("La temperatura en Kelvin es "+ resultado);
                break;
            case 5:
                System.out.println("Convertidor de Kelvin a Fahrenheit");
                resultado = (temperatura -273.15)*9/5 +32;
                System.out.println("La temperatura en Fahrenheit es "+ resultado);
                break;  
            case 6:
                System.out.println("Convertidor de Kelvin a Celsius");
                resultado = temperatura -273.15;
                System.out.println("La temperatura en Celsius es "+ resultado);
 
                break; 
            default:
                System.out.println("Opcion invalida!!!");
                break;
        
        
        
    
        }
        
        }
    }
}
        