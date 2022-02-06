/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public abstract class Electrodomestico {

    protected Double precio; //si hubiese puesto Double, cuando lo pase por parametro, debo acompañarlo con la letra d: 1500d
    protected String color;    
    protected char consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public abstract String toString();    
    
    public char comprobarConsumoEnergetico() {       
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    public String comprobarColor() {                                        
        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        } 
        return color;
    }
    
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
//        Electrodomestico e = new Electrodomestico();  
        System.out.println("Ingrese el color del electrodomestico -disponibles: blanco/negro/rojo/azul/gris-");
        color = sc.next();   
        comprobarColor();
        System.out.println("Ingrese el Consumo Energetico -letra entre A y F-");
        consumoEnergetico = sc.next().charAt(0);
        comprobarConsumoEnergetico();        
        System.out.println("Ingrese el peso en kilos:");
        peso = sc.nextInt();               
        precio= 1000.00;
        precioFinal();
    }

    public Double precioFinal() {
        switch (getConsumoEnergetico()) {
            case 'A':
                this.precio = precio + 1000;
                setPrecio(this.precio);
                break;
            case 'B':
                this.precio = precio + 800;
                setPrecio(precio);
                break;
            case 'C':
                this.precio = precio + 600;
                setPrecio(precio);
                break;
            case 'D':
                this.precio = precio + 500;
                setPrecio(precio);
                break;
            case 'E':
                this.precio = precio + 300;
                setPrecio(precio);
                break;
            case 'F':
                this.precio = precio + 100;
                setPrecio(precio);
                break;
            default:
                break;
        }

        if (getPeso() >= 1 && getPeso() <= 19) {
            this.precio = getPrecio() + 100;
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            this.precio = getPrecio() + 500;
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            this.precio = getPrecio() + 800;
        } else if (getPeso() >= 80) {
            this.precio = getPrecio() + 1000;
        }
        return precio;
    }

}
