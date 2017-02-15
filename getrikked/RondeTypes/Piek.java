/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked.RondeTypes;
import getrikked.RegulierSpel;

/**
 *
 * @author Gijs
 */
public class Piek extends RegulierSpel {
    
    public Piek(){
        //set RondeType-attributen:
        setSpelnaam("piek");
        setWinstPerVerliezer(20);
        setIsRegulier(true);
        
        //set RegulierSpel-attributen:
        setAlleen(true);
        setVastAantalSlagen(true);
        setTeHalenSlagen(1);
        
        
    }
    
}
