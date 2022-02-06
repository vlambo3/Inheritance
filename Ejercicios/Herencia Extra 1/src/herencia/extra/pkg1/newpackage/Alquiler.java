/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.extra.pkg1.newpackage;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Alquiler {
    private String nombre;
    private Integer documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posicionAmarre;
    private Barcos elBarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre, Barcos elBarco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.elBarco = elBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barcos getElBarco() {
        return elBarco;
    }

    public void setElBarco(Barcos elBarco) {
        this.elBarco = elBarco;
    }
    
    public void alquiler() {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese un día un mes y un año");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        int diferenciaEnDias = fechaActual.getDay() - fechaIngresada.getDay()   ;

    }
}
