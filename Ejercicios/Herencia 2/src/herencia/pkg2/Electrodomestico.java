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
class Electrodomestico {

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

    public char comprobarConsumoEnergetico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Consumo Energetico -letra entre A y F-");
        char cE = sc.next().charAt(0);

        if (cE == 'A' || cE == 'B' || cE == 'C' || cE == 'D' || cE == 'E') {
            this.consumoEnergetico = cE;
        } else {
            this.consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    public String comprobarColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodomestico -disponibles: blanco/negro/rojo/azul/gris");
        String colorElectro = sc.next();                           
        if (colorElectro.equalsIgnoreCase("blanco") || colorElectro.equalsIgnoreCase("negro") || colorElectro.equalsIgnoreCase("rojo") || colorElectro.equalsIgnoreCase("azul") || colorElectro.equalsIgnoreCase("gris")) {
            this.color = colorElectro;
        } else {
            this.color = "blanco";
        } 
        return color;
    }
    
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
        Electrodomestico e = new Electrodomestico();  
        e.setColor(comprobarColor());
        e.setConsumoEnergetico(comprobarConsumoEnergetico());        
        System.out.println("Ingrese el peso en kilos:");
        peso = sc.nextInt();
        e.setPeso(peso);       
        e.setPrecio(precioFinal(e)); //probe definiendo el valor de 1000 en el atributo, luego borrarlo porque lo tengo aca 
    }

    public Double precioFinal(Electrodomestico e) {
        Double p = 1000.00;
        switch (e.getConsumoEnergetico()) {
            case 'A':
                this.precio = p + 1000;
                e.setPrecio(this.precio);
                break;
            case 'B':
                this.precio = p + 800;
                e.setPrecio(precio);
                break;
            case 'C':
                this.precio = p + 600;
                e.setPrecio(precio);
                break;
            case 'D':
                this.precio = p + 500;
                e.setPrecio(precio);
                break;
            case 'E':
                this.precio = p + 300;
                e.setPrecio(precio);
                break;
            case 'F':
                this.precio = p + 100;
                e.setPrecio(precio);
                break;
            default:
                break;
        }

        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            this.precio = e.getPrecio() + 100;
        } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            this.precio = e.getPrecio() + 500;
        } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            this.precio = e.getPrecio() + 800;
        } else if (e.getPeso() >= 80) {
            this.precio = e.getPrecio() + 1000;
        }
        return precio;
    }

}
