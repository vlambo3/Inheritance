/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg3.y.pkg2;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Lavadora extends Electrodomestico {
    private Integer carga;    

    public Lavadora() {
    }   

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso, String nombre) {
        super(precio, color, consumoEnergetico, peso, "Lavadora");
        this.carga = carga;
    }    

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }            
        
    public Lavadora crearLavadora() {        
        Lavadora l = new Lavadora();      
        super.crearElectrodomestico();        
        l.setCarga(calculoPeso(l));
        l.setPrecio(precioFinal(l));
        return l;
    }
    
    public Integer calculoPeso(Lavadora l) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la carga");
        carga = sc.nextInt(); 
        return carga;
    }
    
//  no puedo sobreescribir porque para eso necesito que tenga 
//    mismo: nombre, numero y tipo de argumento
//  @Override
    public Double precioFinal(Lavadora l) {  
        Integer incremento = 500;       
        if (carga > 30) {
            precio = incremento + super.getPrecio();
//            l.setPrecio(precio);
        } 
        return precio;
    }     
    
    @Override
    public String toString() {
        return "Lavadora{ " + "Nombre " + nombre + " carga= " + carga + " precio= " + super.getPrecio() + ", color=" + super.getColor() + ", consumoEnergetico=" + super.getConsumoEnergetico() + ", peso=" + super.getPeso() + '}' + "\n"
                + "El precio final es " + super.getPrecio();
    }

}

