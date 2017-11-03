/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.Soumarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VehiculeTest {
   //@Test
    public void testAvion(){
       Avion a = new Avion("boeing", false, "450", "blanc", 400, 0, 0, 0, 800);
       
       
       a.avancer();
       a.afficher();
       
       
       
       
       
       
       
    }
    
 @Test
 public void testSoumarin(){
     Soumarin s = new Soumarin("russe", false, "i50", "noir", 50, 0, 0, -10, 50, false);
     
     
     
     
     s.avancer();
     s.afficher();
     s.avancer();
     s.afficher();
     s.setMonte(true);
     s.avancer();
     s.afficher();
 }




//@Test
    public void testVehicule(){
        Vehicule v1 = new Vehicule("Ferrari", true, "f-50", "rouge", 2, 0, 0, 0, 5);
        Vehicule v2 = new Vehicule("ford", true, "f-42", "bleu", 5, 0, 0, 0, 2);
        
        v1.avancer();
        v1.avancer();
        v2.avancer();
        v2.avancer();
                
        
        
        
        
        v1.afficher();
        v2.afficher();
        
    }
    
}
