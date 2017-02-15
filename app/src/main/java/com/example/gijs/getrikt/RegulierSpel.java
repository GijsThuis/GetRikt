/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gijs.getrikt;

import java.util.LinkedList;
import java.util.Vector;



/**
 *
 * @author Gijs
 */


public abstract class RegulierSpel extends RondeType{
       private boolean alleen;
       private boolean vastAantalSlagen;
       private int teHalenSlagen;
       
       
       //Geeft het aantal punten terug dat de uitdager(s) wint/verliest van/aan alle tegenstanders
       @Override
    public int getWinstNaSlagen(int aantalGehaaldeSlagen){
        if(vastAantalSlagen){
            return(getWinstPerVerliezer());
        }
        else{
            int surplus = aantalGehaaldeSlagen - teHalenSlagen;
            if(surplus>=0){
                return getWinstPerVerliezer() * surplus + getWinstPerVerliezer();
            }
            else{
                return (surplus-1) * getWinstPerVerliezer();
            }
        }
    }
    
    public LinkedList <Integer> getMogelijkAantalSlagen(){
        LinkedList <Integer> list = new LinkedList<Integer>();
         if(vastAantalSlagen){
             if(teHalenSlagen == 1){
                 list.add(0);
                 list.add(1);
                 list.add(2);
             }
             else if(teHalenSlagen == 0){
                 list.add(0);
                 list.add(1);
             }
         }
         else{
             for(Integer i = 0; i<=13; i++){
                 list.add(i);
             }
         }
         return list;
    }
    
    

    public boolean isVastAantalSlagen() {
        return vastAantalSlagen;
    }

    public void setVastAantalSlagen(boolean vastAantalSlagen) {
        this.vastAantalSlagen = vastAantalSlagen;
    }

    public int getTeHalenSlagen() {
        return teHalenSlagen;
    }

    public void setTeHalenSlagen(int teHalenSlagen) {
        this.teHalenSlagen = teHalenSlagen;
    }
         
    public void setAlleen(boolean b){
        alleen = b;
    }
       
    public boolean getAlleen(){
        return alleen;
    }

    /*
    @Override
    public String toString(){
        return getSpelnaam() + " " + getWinstPerVerliezer() + " "  +getMogelijkAantalSlagen();
    }
    */

    @Override
    public String toString(){
        if(vastAantalSlagen){
            return getSpelnaam() + "\t\t" + getWinstPerVerliezer();
        }
        else{
             return getSpelnaam() + "\t\t" + getWinstPerVerliezer() + " x (gehaaldeslagen - " + teHalenSlagen +")";
        }
    }
}
