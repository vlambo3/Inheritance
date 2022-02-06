/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Libreria.LimpiarPantalla;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Menu {
    public static void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int selectorInt;
        String selectorString = "";
        
        do {
            do {
                System.out.println("Ingrese un valor:"
                        + "\n1- "
                        + "\n2- "
                        + "\n3- "
                        + "\n4- Salir");
                selectorInt = leer.nextInt();
            } while (!(selectorInt == 1 || selectorInt == 2 || selectorInt == 3 || selectorInt == 4));
            
            switch (selectorInt) {
                case 1:
                    
                    LimpiarPantalla.limpiarConAviso();
                    break;
                case 2:
                    
                    LimpiarPantalla.limpiarConAviso();
                    break;
                case 3:
                    
                    LimpiarPantalla.limpiarConAviso();
                    break;
                case 4:
                    System.out.println("Seguro que desea salir? Y/N");
                    selectorString = leer.next();
                default:
                    System.out.println("No ha ingresado un valor válido.");
                    LimpiarPantalla.limpiarConAviso();
            }
            
        } while (!selectorString.equalsIgnoreCase("Y"));
        
    }
}
