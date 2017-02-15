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
public class Spel {
    
    private LinkedList <Speler> deelnemers;
    private LinkedList <Speler> huidigeSpelers;
    private int gespeeldeRondes;  
    private Speler deler;
    private boolean deelnemerslijstAf;
    
    Spel(){
        System.out.println("Spel().start");
        deelnemerslijstAf = false;
        deelnemers = new LinkedList<Speler>();
        huidigeSpelers = new LinkedList<Speler>();
        gespeeldeRondes = 0;
        deler = new DefaultSpeler("Deler");
    }
    
    public void verversHuidigeSpelersEnDeler(){
        System.out.println("verversSpelersEnDeler.start");
        verversHuidigeSpelers();
        verversDeler();
    }
    
    private void verversHuidigeSpelers(){
        System.out.println("verversSpelers.start");
        huidigeSpelers.set(0, huidigeSpelers.get(1));
        huidigeSpelers.set(1, huidigeSpelers.get(2));
        huidigeSpelers.set(2, huidigeSpelers.get(3));
        if(deelnemers.size() == 4){
            huidigeSpelers.set(3, huidigeSpelers.get(0));
            
        }
        else if(deelnemers.size()>4){
            huidigeSpelers.set(3, deelnemers.get( gespeeldeRondes%deelnemers.size()));
        }
    }
    
    private void verversDeler(){
        deler = huidigeSpelers.get(0);
    }
    
    public void creeerDeelnemerslijst(){
        while(!deelnemerslijstAf){
            
        }
    }
    
    public void speelEersteRonde(){
        System.out.println("speelEersteRonde.start");
        showHuidigeSpelers();
        Ronde ronde = new Ronde(huidigeSpelers);
    }
    
    public void speelRonde(){
        System.out.println("speelRonde.start");
        verversHuidigeSpelersEnDeler();
        showHuidigeSpelers();
        Ronde ronde = new Ronde(huidigeSpelers);
    }
    
    public void voegSpelerToe(DefaultSpeler newSpeler){
        for(Speler speler: deelnemers){
            if(speler.getNaam().equals(newSpeler.getNaam())){
                return;
            }
        }
        deelnemers.add(newSpeler);
    }
    
    //initialiseert ook de lijst met huidige deelnemers naat het toevoegen aan deelnemers
    public void voegSpelerToeInitieel(DefaultSpeler newSpeler){
        for(Speler speler: deelnemers){
            if(speler.getNaam().equals(newSpeler.getNaam())){
                return;
            }
        }
        deelnemers.add(newSpeler);
        huidigeSpelers.add(newSpeler);
    }
    
    
    public void setDeelnemerslijstAf(boolean b){
        deelnemerslijstAf = b;
    }
    
    
    public void showHuidigeSpelers(){
        System.out.println("LIJST HUIDIGE DEELNEMERS");
        for(Speler speler: huidigeSpelers){
            System.out.println(speler.getNaam());
        }
        System.out.println("Deler:  " + deler.getNaam());
    }
    
    public void showDeelnemers(){
        System.out.println("Speler" + "\t\t" + "Score" + "\t\t" + "OverallScore");
        for(Speler speler: deelnemers){
            System.out.println(speler.getNaam() + "\t\t" + speler.getScore() + "\t\t" + speler.getOverallScore());
        }
    }

}
