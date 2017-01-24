/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOEjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int opEntrada;
        Scanner kb = new Scanner (System.in); 
        //Desplegamos el menu
        System.out.println("Calculadorea de areas, perimetos y volumenes");
        System.out.println("Introdusca la opcion deseada");
        System.out.println("1. Calcular areas");
        System.out.println("2. Calcular perimetros");
        System.out.println("3. Calcular volumenes");
        System.out.println("4. Salir");
        opEntrada=kb.nextInt();
         switch (opEntrada){
             case 1:
                 System.out.println("Bienvenido al calculo de areas");
                 break;
             case 2:
                 System.out.println("Bienvenido al calculo de perimetros");
                 break;
             case 3:
                 System.out.println("Bienvenido al calculo de volumenes");
                 break;
             default:
                 System.out.println("adios.");
         }
    }
    
}
