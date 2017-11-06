/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import junit.framework.Assert;
import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {

    

@Test
    public void testAll() {
        Synthetiseur s = new Synthetiseur();

          Assert.assertFalse( s.isOn());
        s.allumageOnOff();
          Assert.assertTrue( s.isOn());
        s.allumageOnOff();
          Assert.assertFalse( s.isOn());
        
        
        
        
        
    }
@Test

    public void volumeTest() {
        Synthetiseur v = new Synthetiseur();
           
        
            
        v.volumePus();
            
        v.volumePus();
            
        v.volumePus();
            
        v.volumePus();
           
        v.volumePus();
            
        v.volumePus();
            
        v.volumePus();
          
        Assert.assertEquals(7, v.getVolume());

    }

    @Test
    public void testJouerNote() {
        Synthetiseur j = new Synthetiseur();

            j.allumageOnOff();
            
            j.volumeMoins();
            
            j.jouerNote("fa#3");
         
       
    }
}
