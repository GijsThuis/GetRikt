/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gijs.getrikt;

/**
 *
 * @author Gijs
 */
public interface Controller {
    
    
    //Gebruiker start een nieuw spel
    public void startNewSpel();
    
    //Gebruiker voegt speler toe aan database
    public void voegSpelerToe(DefaultSpeler speler, DataBase database);
    
    //Gebruiker voegt speler toe aan spel
    public void voegSpelerToe(Speler speler, Spel spel);
    
    //Gebruiker begint een nieuwe ronde
    public void startNewRonde();
    
    //Gebruiker beeindigt ronde voortijdig
    public void termineerRonde();
    
    //Gebruiker kiest uitdager van een RegulierSpel
    public void kiesUitdagers();
    
    //Gebruiker kiest aantal gehaalde slagen door uitdager
    public void kiesAantalGehaaldeSlagen();
    
    //Toon de volgorde van sterkste biedingen
    public void toonSpeltypes();
    
    //Toon de tussenstand van het huidige spel
    public void toonTussenstand();
    
    //Gebruiker sluit spel af
    public void beeindigSpel(boolean slaOp);
    
    //Gebruiker past de inzet aan van een van de speltypes
    public void veranderInzet();
    

}
