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
public class Rik extends RegulierSpel {
    
  //  private int winstPerVerliezer;
/*
    private LinkedList<Speler> deelnemers;
    private LinkedList<Speler> winnaars;
    private LinkedList<Speler> verliezers;
    private Speler uitdager;
    private Speler meegevraagde;
*/
   // private int gehaaldeSlagen;
    
    
    public Rik(){
       //set RondeType-attributen:
       setSpelnaam("rik");
       setWinstPerVerliezer(5);
       setIsRegulier(true);
       
       
       //set RegulierSpel-attributen:
       setAlleen(false);
       setVastAantalSlagen(false);
       setTeHalenSlagen(8);

    }
    
    //MAAK EEN OVERRIDING METHOD FOR HET TOEVOEGEN VAN DE MAAT EN VOOR TEGENSTANDERS TOEVOEGEN
}
