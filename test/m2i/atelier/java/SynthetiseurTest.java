/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {
    

    //@Test
    public void testAll(){
    Synthetiseur s = new Synthetiseur();
        System.out.println( s.isOn() );
        s.allumageOnOff();
        System.out.println( s.isOn() );
        
}
//@Test
public void volumeTest(){
    Synthetiseur v = new Synthetiseur();
    System.out.println(v.getVolume());
    v.volumePus();
    v.volumePus();
    v.volumePus();
    v.volumePus();
    v.volumePus();
    v.volumePus();
    System.out.println(v.getVolume());
}
    
@Test
public void testJouerNote(){
  Synthetiseur j = new Synthetiseur();
   j.allumageOnOff();
   
  
  
  j.jouerNote("fa#3");
  System.out.println();
    
}
}
