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
public class NetbeansController implements Controller {
   
    private Spel spel;
    private LinkedList <DefaultSpeler> deelnemers;
    private View view;
    private DataBase database;
    
    NetbeansController(DataBase db){
        deelnemers = new LinkedList<DefaultSpeler>();
        View view = new View(this);
       // spel = new Spel();
        database = db;
    }
    
    NetbeansController(){
        deelnemers = new LinkedList<DefaultSpeler>();
        database = new DataBase();
        View view = new View(this);
     //   spel = new Spel();
    }

   
    
    
    
    public void initieerSpel(){
        System.out.println("nc.initieerspel.start");
        spel = new Spel();
    }
    
    //Gebruiker start een nieuw spel
    @Override
    public void startNewSpel(){
        
    }
    
    //Gebruiker voegt speler toe aan spel
    @Override
    public void voegSpelerToe(Speler speler, Spel spel){
        
    }
    
    //Gebruiker voegt een nieuwe speler toe aan database
    public void voegSpelerToe(String naam, DataBase database){
        database.voegSpelerToe(naam);
    }
    
    //Gebruiker voegt een nieuwe speler toe aan database
    public void voegSpelerToe(DefaultSpeler speler , DataBase database){
        database.voegSpelerToe(speler);
    }
    
    
    
    //Gebruiker begint een nieuwe ronde
    @Override
    public void startNewRonde(){
        
    }
    
    //Gebruiker beeindigt ronde voortijdig
    @Override
    public void termineerRonde(){
        
    }
    
    //Gebruiker kiest uitdager
    @Override
    public void kiesUitdagers(){
        
    }
    
    //Gebruiker kiest aantal gehaalde slagen door uitdager
    @Override
    public void kiesAantalGehaaldeSlagen(){
        
    }
    
    //Toon de volgorde van sterkste biedingen
    @Override
    public void toonSpeltypes(){
        
    }
    
    //Toon de tussenstand van het huidige spel
    @Override
    public void toonTussenstand(){
        
    }
    
    //Gebruiker sluit spel af
    @Override
    public void beeindigSpel(boolean slaOp){
    
    }    
    
    //Gebruiker past de inzet aan van een speltypes
    @Override
    public void veranderInzet(){
        
    }

    
    public DataBase getDatabase() {
        return database;
    }
    
    
    public Spel getSpel() {
        return spel;
    }

    public void setSpel(Spel spel) {
        this.spel = spel;
    }

    public LinkedList<DefaultSpeler> getDeelnemers() {
        return deelnemers;
    }

    public void setDeelnemers(LinkedList<DefaultSpeler> deelnemers) {
        this.deelnemers = deelnemers;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    
}
