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
public class Procesos {
    public void iniciar(){
        Humano adulto = new Humano();
        adulto.setNombre("juan");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println();
        
        Hombre padre = new Hombre();
        padre.setNombre("juan");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println("************");
        
        Mujer madre = new Mujer();
        madre.setNombre("Maria");
        madre.comer(madre.getNombre());
        madre.dormir();
    }
}
