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
public abstract class Speler {
    
    // Score van de speler in een spel
    private int score;
    // Score in van de speler in een speldatabase
    private int overallScore;
    //naam van de speler
    private String naam;
    
    abstract public void veranderScore(int verandering);
    abstract public void veranderOverallScore(int verandering);
    abstract public void veranderNaam(String newNaam);
            
    public int getScore(){
        return score;
    }
    public int getOverallScore(){
        return overallScore;
    }
    public String getNaam(){
        return naam;
    }
    
    public void setScore(int newScore){
        score = newScore;
    }
    
    public void setOverallScore(int newOverallScore){
        overallScore = newOverallScore;
    }
    
    public void setNaam(String newNaam){
        naam = newNaam;
    }
}
