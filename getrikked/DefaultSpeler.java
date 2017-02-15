/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked;

/**
 *
 * @author Gijs
 */
public class DefaultSpeler extends Speler{
    
    DefaultSpeler(String spelersnaam){
        setNaam(spelersnaam);
        
    }
    
    @Override
    public void veranderNaam(String newNaam){
        setNaam(newNaam);
    }
    
    @Override
    public void veranderScore(int verandering){
        setScore(getScore()+verandering);
    }
    
    @Override
    public void veranderOverallScore(int verandering){
        setOverallScore(getOverallScore() + verandering);
    }
    
    
}
