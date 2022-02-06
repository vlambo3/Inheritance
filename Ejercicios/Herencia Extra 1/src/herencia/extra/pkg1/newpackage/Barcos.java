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
public class Barcos {
    protected String matricula;
    protected Double eslora;
    protected Integer anio;  

    public Barcos() {
    }

    public Barcos(String matricula, Double eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public void crearBarco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la matricula del barco");
        matricula = sc.next();
        System.out.println("Ingrese la eslora en metros del barco");
        eslora = sc.nextDouble();
        System.out.println("Ingrese el año de fabricación");
        anio = sc.nextInt();
    }
}
