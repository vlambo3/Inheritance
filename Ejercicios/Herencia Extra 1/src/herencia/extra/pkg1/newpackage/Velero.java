/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.extra.pkg1.newpackage;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Velero extends Barcos {
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, String matricula, Double eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }
    
    public void crearVelero() {
        super.crearBarco();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de mastiles del velero");
        mastiles = sc.nextInt();
    }
    
    
}
