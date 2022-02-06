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
public class YateDeLujo extends AMotor{
    private Integer camarotes;

    public YateDeLujo(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public YateDeLujo(Integer camarotes, Double motor) {
        super(motor);
        this.camarotes = camarotes;
    }

    public YateDeLujo(Integer camarotes, Double motor, String matricula, Double eslora, Integer anio) {
        super(motor, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
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
    
    public void crearYateDeLujo(){
        super.crearAMotor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de camarotes");
        camarotes = sc.nextInt();// o this.camarotes = sc.nextInt()
    }
}
