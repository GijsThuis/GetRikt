/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gijs.getrikt;


import java.util.LinkedList;

/**
 *
 * @author Gijs
 */
// Deze klasse bevat alle verschillende rondetypes.
public class RondeTypeDoos {
    
    private LinkedList<RondeType> Doos;
    
    RondeTypeDoos(){
        Doos = new LinkedList<RondeType>();
        Doos.add(new Rik());
        Doos.add(new Piek());
        Doos.add(new Misere());
        Doos.add(new SchoppenvrouwLaatsteslag());
    }
    
    public LinkedList<RondeType> getDoos(){
        return Doos;
    }
    
    public void spreekDoos(){
        System.out.println("Dit zijn de rondetypes:");
        for(RondeType type: Doos){
            System.out.println("\t" + type.toString());
        }
    }


    
}
