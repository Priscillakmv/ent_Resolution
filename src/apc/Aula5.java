/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apc;

import java.util.ArrayList;

/**
 *
 * @author Priscilla
 */
public class Aula5 {
    public static void main (String args[]){
        ArrayList <String> array = new ArrayList<String>();
        array.add("Maria");
        array.add("Joao");
        array.add("Ana");
        for (int i = 0; i < array.size(); i++) {
            String get = array.get(i);
            System.out.println(" Saída " + get);
            
        }
      /*  array.remove("Ana");
        System.out.println(" Remoção .....");
        
         for (int i = 0; i < array.size(); i++) {
            String get = array.get(i);
            System.out.println(" Saída " + get);
            
        }*/
        if (array.contains("Ana")) {
            System.out.println(" Encontrou");
            
        }
        else{
            System.out.println(" Não existe");
        }
    }
    
}
