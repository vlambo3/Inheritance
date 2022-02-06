/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg4;

import herencia.pkg4.Interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Rectangulo implements calculosFormas {
    protected Float base;
    protected Float altura;

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void calculoArea() {
        System.out.println("Ingrese un valor para la base y un valor para la altura");
        base = sc.nextFloat();
        altura = sc.nextFloat();
        System.out.println("El area del rectangulo es: " + (base*altura));
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + (base+altura)*2);
    }
}
