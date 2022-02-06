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
public class AMotor extends Barcos{
    protected Double motor;

    public AMotor() {
    }

    public AMotor(Double motor) {
        this.motor = motor;
    }

    public AMotor(Double motor, String matricula, Double eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.motor = motor;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
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
    
    public void crearAMotor(){
        super.crearBarco();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el motor del barco");
        motor = sc.nextDouble();
    }
    
}
