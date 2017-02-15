/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked;

import getrikked.Speler;
import java.util.LinkedList;

/**
 *
 * @author Gijs
 */
public abstract class RondeType {
    
    private String spelnaam;
    private int winstPerVerliezer;
    private boolean isRegulier;

    public boolean isRegulier() {
        return isRegulier;
    }

    public void setIsRegulier(boolean isRegulier) {
        this.isRegulier = isRegulier;
    }
    
    //returnt de winst aan de hand van het gewonnen aantal slagen
    public int getWinstNaSlagen(int aantalGehaaldeSlagen){
        return winstPerVerliezer;
    }
    
    //returnt de winst per slag(rikken) of inzet(met vastaantal slagen)
    public int getWinstPerVerliezer() {
        return winstPerVerliezer;
    }

    public void setWinstPerVerliezer(int winstPerVerliezer) {
        this.winstPerVerliezer = winstPerVerliezer;
    }
    
    public void setSpelnaam(String naam){
        spelnaam = naam;
    }
    
    public String getSpelnaam(){
        return spelnaam;
    }
    
    @Override
    public String toString(){
        return spelnaam + " " + winstPerVerliezer;
    }
        
}
