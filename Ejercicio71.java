/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.pkg1;

import java.util.Scanner;


public class Ejercicio71 {

   
    public static void main(String[] args) {
        
        //solucion del curso
        
        Scanner entrada = new Scanner (System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.println("digite el numero de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168/24;
        horas = horasTotales%24;
        

        System.out.println("semanas: "semanas);
        System.out.println("dias: "dias);
        System.out.println("horas: "horas);

       
    }
    
}
