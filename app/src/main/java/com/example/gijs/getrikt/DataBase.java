/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gijs.getrikt;

import static java.util.Collections.list;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Gijs
 */
public class DataBase {
    
    private LinkedList <DefaultSpeler> spelers;

    
    DataBase(){
        spelers = new LinkedList<DefaultSpeler>();
    }
    
    public void voegSpelerToe(){
        System.out.print("Tik een naam in:\t");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();
        voegSpelerToe(naam);
    }
    
    
    
    public void voegSpelerToe(DefaultSpeler newSpeler){
        for(Speler speler: spelers){
            if(speler.getNaam().equals(newSpeler.getNaam())){
                return;
            }
        }
        spelers.add(newSpeler);
    }
    
    public void voegSpelerToe(String naam){
        for(Speler speler: spelers){
            if(speler.getNaam().equals(naam)){
                return;
            }
        }
        spelers.add(new DefaultSpeler(naam));
    }
    /*
    public void voegSpelerToe(Speler newSpeler){
        for(Speler speler: spelers){
            if(speler.getNaam().equals(newSpeler.getNaam())){
                return;
            }
        }
        spelers.add(newSpeler);
    }
*/

    
    
    
    public boolean heeftGenoegSpelers(){
        return spelers.size() >=4;
    }
    
    public void scores(){
        for(Speler speler: spelers){
            System.out.println();
        }
    }
    
    public LinkedList <Speler> ranglijst(){
        LinkedList <Speler> inputlijst = new LinkedList<Speler>(spelers);
        LinkedList <Speler> returnlijst = new LinkedList<Speler>();
        int tempJ =0;
        for(int i = 0; i<inputlijst.size(); i++){
            Speler hoogsteSpeler = inputlijst.getFirst();
            for(int j = i; j<inputlijst.size(); j++){
                if(inputlijst.get(j).getOverallScore() > inputlijst.get(i).getOverallScore()){
                    hoogsteSpeler = inputlijst.get(j);
                    tempJ = j;
                }
            }
            returnlijst.add(hoogsteSpeler);
            inputlijst.set(tempJ, hoogsteSpeler);
        }
        
        return returnlijst;
    }
    
    
    public LinkedList<DefaultSpeler> getSpelers() {
        return spelers;
    }


    
}