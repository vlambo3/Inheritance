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
public class Televisor extends Electrodomestico {
    private Integer pulgadas;
    private Boolean TDT;    

    public Televisor() {
    }

    public Televisor(Integer pulgadas, Boolean TDT) {
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor(Integer pulgadas, Boolean TDT, Double precio, String color, char consumoEnergetico, Integer peso, String nombre) {
        super(precio, color, consumoEnergetico, peso, "TV");
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }   
    
    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        Scanner sc = new Scanner(System.in);
        Televisor t = new Televisor();
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = sc.nextInt();
        t.setPulgadas(pulgadas);
        t.setTDT(tieneSintonizador(t));
        t.setPrecio(precioFinal(t));
        return t; //otra forma es: return new Televisor(CON TODOS LOS PARAMETROS)
    }
    
    public Boolean tieneSintonizador(Televisor t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("El televisor tiene sintonizador");
        String respuesta = sc.next();               
        if (!respuesta.equalsIgnoreCase("si")) {
            TDT = false;
        } else TDT = true;
        return TDT;
    }
    
    public Double precioFinal(Televisor t) {
        double porcentajeIncremento = 1.3;
        if (pulgadas > 40) {
            precio = porcentajeIncremento * super.getPrecio();
            t.setPrecio(precio);
            if (TDT == true) {  
                precio = precio + 500;
                t.setPrecio(precio);
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + " precio= " + super.getPrecio() + ", color=" + super.getColor() + ", consumoEnergetico= " + super.getConsumoEnergetico() + ", pulgadas= " + pulgadas + ", TDT=" + TDT + "\n" +
                "El precio final es " + super.getPrecio();
    }
    
    
}

