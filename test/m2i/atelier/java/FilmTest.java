/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import java.util.Date;
import java.util.Locale;
import m2i.atelierjava.entite.Film;
import org.junit.Test;



/**
 *
 * @author Formation
 */
public class FilmTest {
    
 
 @Test
 public void nouveauFilm(){
     Film f1 = new Film();
     Date d = new Date();
     
    
//     f1.setTitre("dracula");
//     f1.setAnneeDeProduction(2001);
    f1.initialise("dracula", "bla bla", 2001, new Date());
    f1.affiche();
    
     
            
            Film f2 = new Film();
//     f2.setTitre("kung fu panda");
//     f2.setAnneeDeProduction(2010);
       f2.initialise("kung fu panda", "bla bla", 2010, new Date());
       f2.affiche();
//     System.out.println(f1.getTitre());
//     System.out.println(f1.getAnneeDeProduction());
//     System.out.println(f2.getTitre());
//     System.out.println(f2.getAnneeDeProduction());
     
     
     
     
     
     
     
     
     
     
     
     
 }
}
