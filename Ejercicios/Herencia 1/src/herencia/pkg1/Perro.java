/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg1;

/**
 *
 * @author Vanina
 */
class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza); // estoy llamando o enviando algo al padre de esta clase
    }

    @Override
    public void Alimentarse() {
        System.out.println("Este animal es " + raza  + " y se alimenta de "+ alimento);
    } 
}
