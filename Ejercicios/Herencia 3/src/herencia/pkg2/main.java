/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vanina
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <Electrodomestico> listaElectro = new ArrayList();
        Lavadora l = new Lavadora(60, 3100.00, "gris", 'B', 60);           
        Televisor t = new Televisor(50, true, 3230.00, "blanco", 'F', 400);
        Lavadora l2 = new Lavadora(80, 2800.00, "negro", 'D', 60);  
        Lavadora l3 = new Lavadora(40, 3300.00, "rojo", 'A', 60);  
        
        listaElectro.add(l);
//        listaElectro.add(t);
        listaElectro.add(l2);
        listaElectro.add(l3);
        
        for (Electrodomestico aux : listaElectro) {        
            aux.precioFinal();
            System.out.println(aux.getPrecio());
        }
        
        
        

       
        
    }
    
}
