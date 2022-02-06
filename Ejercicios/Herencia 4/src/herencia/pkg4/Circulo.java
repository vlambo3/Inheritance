/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg4;

import herencia.pkg4.Interfaces.calculosFormas;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Circulo implements calculosFormas {
    public Double radio;

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void calculoArea() {
//        System.out.println("Ingrese el radio del circulo: ");
//        radio = sc.nextDouble();
        System.out.println("El area del circulo es: " + PI*Math.pow((radio),2));
    }

    @Override
    public void calculoPerimetro() {          
        System.out.println("El perimetro del circulo es: " + (PI * (radio*2)));
    }
    
    
}
