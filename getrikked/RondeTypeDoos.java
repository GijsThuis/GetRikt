/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getrikked;

import getrikked.RondeTypes.Rik;
import getrikked.RondeType;
import getrikked.RondeTypes.Misere;
import getrikked.RondeTypes.Piek;
import getrikked.RondeTypes.SchoppenvrouwLaatsteslag;
import java.util.LinkedList;

/**
 *
 * @author Gijs
 */
// Deze klasse bevat alle verschillende rondetypes.
public class RondeTypeDoos {
    
    LinkedList<RondeType> Doos;
    
    RondeTypeDoos(){
        Doos = new LinkedList<RondeType>();
        Doos.add(new Rik());
        Doos.add(new Piek());
        Doos.add(new Misere());
        Doos.add(new SchoppenvrouwLaatsteslag());
    }
    
    public LinkedList<RondeType> getDoos(){
        return Doos;
    }
    
    public void spreekDoos(){
        System.out.println("Dit zijn de rondetypes:");
        for(RondeType type: Doos){
            System.out.println("\t" + type.toString());
        }
    }
    
}
