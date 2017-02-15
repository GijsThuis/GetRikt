/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Gijs
 */
public class View {
    
    NetbeansController nc; 
    
    View(NetbeansController nco){
        nc = nco;
        System.out.println(nc);
        System.out.println(nc.getDatabase());
        StartMenu();
    }
    
    public void StartMenu(){
        boolean klaar = false;
        int input = 0;
       
        while(!klaar){
            
       
            System.out.println("1:  Nieuw spel");
            System.out.println("2:  Voeg speler toe");
            System.out.println("3:  Bekijk scores");
            System.out.println("4:  Bekijk speltypes");
            System.out.println("5:  Sluit af");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            while(input <= 0 && input>5){
                input = scanner.nextInt();
            }

            if(input == 1){
                nc.initieerSpel();
                boolean spelKlaar = false;
                boolean eersteRonde = true;
                LinkedList toevoeglijst = new LinkedList<DefaultSpeler>(); 
                toevoeglijst.add(new DefaultSpeler("Gijs"));
                toevoeglijst.add(new DefaultSpeler("Tom"));
                toevoeglijst.add(new DefaultSpeler("Roeland"));
                toevoeglijst.add(new DefaultSpeler("Jeroen"));
                toevoeglijst.add(new DefaultSpeler("Pascal"));
                
                   
                for(int i = 0; i<toevoeglijst.size(); i++){
                    nc.getDatabase().voegSpelerToe((DefaultSpeler) toevoeglijst.get(i));
                    if(i<4){
                        nc.getSpel().voegSpelerToeInitieel((DefaultSpeler)toevoeglijst.get(i));
                    }
                }

                if(nc.getDatabase().heeftGenoegSpelers()){
                    nc.getSpel().showDeelnemers();
                    nc.getSpel().showHuidigeSpelers();
                    nc.getSpel().speelEersteRonde();
                   }
                else{
                    System.out.println("Voeg eerst spelers toe tot een minimum van 4 om een spel te kunnen starten.");
                }
 
                while(!spelKlaar){
                    if(!eersteRonde){
                        nc.getSpel().showDeelnemers();
                        nc.getSpel().showHuidigeSpelers();
                        nc.getSpel().speelEersteRonde();
                    }
                   System.out.println("DOE HIER IETS LEUKS ZOALS AANGEVEN WELK SPEL WORDT GESPEELD EN VERVOLGENS HOEVEEL SLAGEN ER GEHAALD ZIJN TENZIJ PASSPEL \n");
                   System.out.println("Druk 1 voor nieuwe ronde. \nDruk 2 om te stoppen.");
                   input = scanner.nextInt();
                   if(input == 2){
                       spelKlaar = true;
                   }
            
                }
            }

            if(input == 2){
                nc.getDatabase().voegSpelerToe();
            }

            if(input == 3){
                showScores();
            }

            if(input == 4){

            }

            if(input == 5){
                klaar = true;
            }
            System.out.println("Taak uitgevoerd.");
        }
      
    }
    
    private void showScores(){
        System.out.println();
        System.out.println("NAAM\t\t SCORES");
        for(Speler speler: nc.getDatabase().getSpelers()){
            System.out.println(speler.getNaam() + "\t\t" + speler.getOverallScore());
        }
    }
    
    
}
