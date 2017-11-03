/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {

    @Test
    public void nouvelleSerie() {
        Serie S1 = new Serie();
//        S1.setTitre("game of throne");
//        S1.setAnneeDeSortie(2010);
//        S1.setNombreDeSaisons(7);
//        S1.setSynopsis("bla bla");
        S1.initialise("game of throne", "bla bla", 2010, 7);
        S1.affiche();
        
        
        
        
        Serie S2 = new Serie();
//        S2.setTitre("rick and morty");
//        S2.setAnneeDeSortie(2011);
//        S2.setNombreDeSaisons(3);
//        S2.setSynopsis("bla bla");
        S2.initialise("rick and morty", "bla bla", 2011, 3);
        S2.affiche();
        
        
     
    }
    @Test
    public void TesteAffichage(){
        
    }

}
