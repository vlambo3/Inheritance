/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg3.y.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vanina
 */
public class Herencia3Y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l = new Lavadora(60, 3100d, "gris", 'B', 60, "Lavadora");
        Televisor t = new Televisor(50, true, 3230d, "blanco", 'F', 400, "TV");
        Lavadora l2 = new Lavadora(80, 2800.00, "negro", 'D', 60, "Lavadora");
        Lavadora l3 = new Lavadora(40, 3300.00, "rojo", 'A', 60, "Lavadora");

        List<Electrodomestico> listaElectro = new ArrayList();
        listaElectro.add(l);
        listaElectro.add(t);
        listaElectro.add(l2);
        listaElectro.add(l3);

        Double precioTotal2 = 0d;
        Double precioTotal3 = 0d;
        for (Electrodomestico aux : listaElectro) {
            if (aux.getNombre().equalsIgnoreCase("Lavadora")) {
                precioTotal2 += aux.getPrecio();
//            System.out.println("El " + aux + "  tiene un percio de " + aux.getPrecio());
            } else if (aux.getNombre().equalsIgnoreCase("TV")) {
                precioTotal3 += aux.getPrecio();
//            System.out.println(aux.getPrecio());
            }
        }
        System.out.println("El precio total de los lavarropas es: " + precioTotal2);
        System.out.println("El precio total de los Televisores es: " + precioTotal3);

    }
}
