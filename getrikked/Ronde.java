/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked;

import java.util.LinkedList;

/**
 *
 * @author Gijs
 */
//Een ronde bestaat uit 13 slagen.
public class Ronde {
    
    private Speler deler;
    private LinkedList <Speler> deelnemers;
    private LinkedList <Speler> uitdagers;
    private LinkedList <Speler> tegenstanders;

    private RondeType rondetype; 
    
    public Ronde(LinkedList <Speler> gekozenSpelers){
        deelnemers = new LinkedList<Speler> (gekozenSpelers);
        uitdagers = new LinkedList<Speler>();
        tegenstanders = new LinkedList<Speler>();
    }
    
    public void setUitdagers(LinkedList <Speler> uitdagenden){
        uitdagers = uitdagenden;
        tegenstanders = tegenSpelers();
    }
    
    public Speler getDeler() {
        return deler;
    }

    public void setDeler(Speler deler) {
        this.deler = deler;
    }
    
    private LinkedList<Speler> tegenSpelers(){
        LinkedList<Speler> tegenspelers = new LinkedList<Speler>(); 
        for(Speler deelnemer: deelnemers){
            for(Speler uitdager: uitdagers){
                if(!deelnemer.equals(uitdager)){
                    tegenspelers.add(deelnemer);
                }
            }
        }
        return tegenspelers;
    } 
    
    //termineert na het correct spelen van 13 slagen en past scores aan
    public void beeindig(int gehaaldeSlagen){
        //doe het reguliere-geval
        if(rondetype.isRegulier()){
            updateScore(gehaaldeSlagen);
        }
        // doe het passpel-geval
        else{
            
        }
    }
    
    //updateScore van een regulierSpel
    private void updateScore(int gehaaldeSlagen){
        int behaaldePuntenUitdagers = rondetype.getWinstNaSlagen(gehaaldeSlagen);
        for(Speler uitdager: uitdagers){
            for(Speler tegenspeler: tegenstanders){
                wisselPunten(uitdager, tegenspeler, behaaldePuntenUitdagers);
            }
        }
    }
    
    //termineert voortijdig, 13 slagen niet correct afgerond
    public void onderbreek(){
        
    }
    
    //wissel score punten uit tussen speler a en speler b 
    private void wisselPunten(Speler a, Speler b, int score){
        a.veranderScore(score);
        b.veranderScore(-score);
    }
    
}
