/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoherencia;

/**
 *
 * @author NAVARRO
 */
public class Humano {
    String nombre;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void comer(String nombre){
        System.out.println(nombre+" Esta Comiendo (clase Humano)");
    }
    
    public void dormir(){
        System.out.println(nombre+" Esta durmiendo (clase Humano)");
    }
}
